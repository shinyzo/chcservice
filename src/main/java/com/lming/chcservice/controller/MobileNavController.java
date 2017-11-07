package com.lming.chcservice.controller;

import com.lming.chcservice.constant.RedisConstant;
import com.lming.chcservice.model.MobileNav;
import com.lming.chcservice.model.UserInfo;
import com.lming.chcservice.service.MobileNavService;
import com.lming.chcservice.service.UserService;
import com.lming.chcservice.util.ResultVOUtil;
import com.lming.chcservice.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/nav")
@Slf4j
public class MobileNavController {

    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private UserService userService;
    @Autowired
    private MobileNavService mobileNavService;

    @PostMapping(value = "/list")
    public ResultVO list(@RequestParam("token") String token){
        // 从redis缓存中根据用户的token取openid
        String openid = redisTemplate.opsForValue().get(String.format(RedisConstant.TOKEN_PREFIX,token));
        // 根据用户的openid获取用户信息
        UserInfo userInfo = userService.findOne(openid);
        // 根据用户信息获取用户的导航
        List<MobileNav> mobileNavList = mobileNavService.getNavByRoleId(userInfo.getRoleId());
        log.info("【导航列表】 -获取用户导航列表，navList={}",mobileNavList);
        return ResultVOUtil.success(mobileNavList);
    }


}
