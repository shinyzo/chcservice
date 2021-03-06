package com.lming.chcservice.controller;

import com.lming.chcservice.constant.CookieConstant;
import com.lming.chcservice.constant.RedisConstant;
import com.lming.chcservice.converter.UserInfo2UserInfoVOConverter;
import com.lming.chcservice.vo.UserInfoVO;
import com.lming.chcservice.enums.ResultEnum;
import com.lming.chcservice.entity.UserInfo;
import com.lming.chcservice.service.UserService;
import com.lming.chcservice.util.CookieUtil;
import com.lming.chcservice.util.JsonUtil;
import com.lming.chcservice.util.ResultVOUtil;
import com.lming.chcservice.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping(value = "/api/v1")
@Slf4j
public class LoginController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public ResultVO login(@RequestParam("loginName") String loginName,
                          @RequestParam("loginPass") String loginPass,
                          HttpServletResponse response){
        UserInfo userInfo = userService.findOne(loginName,loginPass);
        if(userInfo ==null)
        {
            log.info("【用户登录】 - 用户名或密码错误，loginName={}",loginName);
           return ResultVOUtil.error(ResultEnum.LOGIN_FAILED);
        }


        // 设置token至redis 采用分布式session
        String token = UUID.randomUUID().toString();
        UserInfoVO userInfoDTO = UserInfo2UserInfoVOConverter.convert(userInfo);
        userInfoDTO.setToken(token);
        // 设置token至Cookie
        CookieUtil.set(response, CookieConstant.TOKEN,token,CookieConstant.EXPIRE_TIME);
        redisTemplate.opsForValue().set(String.format(RedisConstant.TOKEN_PREFIX,token),
                JsonUtil.obj2String(userInfoDTO),
                RedisConstant.TOKEN_EXPIRE_TIME,
                TimeUnit.SECONDS);

        return ResultVOUtil.success(userInfoDTO);
    }


    @GetMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse resposne, Map<String,Object> map){

        Cookie cookie = CookieUtil.get(request,CookieConstant.TOKEN);
        if(cookie!=null)
        {
            // 清除cookie中的token
            CookieUtil.set(resposne,CookieConstant.TOKEN,null,0);
            // 删除redis 对应的token
            redisTemplate.opsForValue().getOperations().delete(String.format(RedisConstant.TOKEN_PREFIX,cookie.getValue()));
        }
    }

}
