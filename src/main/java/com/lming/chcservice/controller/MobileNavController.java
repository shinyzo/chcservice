package com.lming.chcservice.controller;

import com.lming.chcservice.constant.RedisConstant;
import com.lming.chcservice.enums.PlatTypeEnum;
import com.lming.chcservice.enums.ResultEnum;
import com.lming.chcservice.exception.ChcProcessException;
import com.lming.chcservice.form.Form;
import com.lming.chcservice.entity.MobileNav;
import com.lming.chcservice.entity.UserInfo;
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
@RequestMapping(value = "/api/v1")
@Slf4j
public class MobileNavController {

    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private UserService userService;
    @Autowired
    private MobileNavService mobileNavService;

    @PostMapping(value = "/list2")
    public ResultVO list2(@RequestParam("token") String token) {
        // 从redis缓存中根据用户的token取openid
        String openid = redisTemplate.opsForValue().get(String.format(RedisConstant.TOKEN_PREFIX, token));
        // 根据用户的openid获取用户信息
        UserInfo userInfo = userService.findOne(openid);
        // 根据用户信息获取用户的导航
        List<MobileNav> mobileNavList = mobileNavService.getNavByPlatType(PlatTypeEnum.P.toString());
        log.info("【导航列表】 -获取用户导航列表，navList={}", mobileNavList);
        return ResultVOUtil.success(mobileNavList);
    }

    @GetMapping(value = "/navs")
    public ResultVO findList(@RequestParam("platType") String platType) {
        // 根据用户信息获取用户的导航
        PlatTypeEnum platTypeEnum = PlatTypeEnum.getPlatTypeEnum(platType);
        if (platTypeEnum == null) {
            throw new ChcProcessException(ResultEnum.APP_TYPE_ERROR);
        }
        List<MobileNav> mobileNavList = mobileNavService.getNavByPlatType(platTypeEnum.toString());
        log.info("【导航列表】 -获取用户导航列表，navList={}", mobileNavList);
        return ResultVOUtil.success(mobileNavList);
    }
}
