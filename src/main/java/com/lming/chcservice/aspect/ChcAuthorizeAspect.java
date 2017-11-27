package com.lming.chcservice.aspect;

import com.lming.chcservice.constant.CookieConstant;
import com.lming.chcservice.constant.RedisConstant;
import com.lming.chcservice.vo.UserInfoVO;
import com.lming.chcservice.exception.ChcAuthorizeException;
import com.lming.chcservice.util.CookieUtil;
import com.lming.chcservice.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

/**
 * 用户登录切面
 */
@Aspect
@Component
@Slf4j
public class ChcAuthorizeAspect {

    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 切入点 indexController和LoginController除外其他的所有Controller的方法及参数类型
     */
    @Pointcut("execution(public * com.lming.chcservice.controller.OrderController.*(..))"
            + "&& execution(public * com.lming.chcservice.controller.ReserveController.*(..))"
    )
    public void verify() {
    }

    ;


    @Before("verify()")
    public void doVerify() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();

        Cookie cookie = CookieUtil.get(request, CookieConstant.TOKEN);
//        if(cookie==null)
//        {
//            log.warn("【登录校验】-cookie中找不到token");
//            // 抛出异常
//            throw new ChcAuthorizeException();
//        }
        String token = cookie == null ? request.getParameter("token") : cookie.getValue();
        // redis中是否存在改token
        String userJsonData = redisTemplate.opsForValue().get(String.format(RedisConstant.TOKEN_PREFIX, token));
        UserInfoVO userInfoDTO = JsonUtil.string2Obj(userJsonData, UserInfoVO.class);
        if (userInfoDTO == null) {
            log.warn("【登录校验】- redis中找不到token，token={}", token);
            throw new ChcAuthorizeException();
        }

        //  更新redis中的token失效时间
        //  重新生成一个新的token 安全性更高防止用户操作之后他人盗用该token
        redisTemplate.opsForValue().set(String.format(RedisConstant.TOKEN_PREFIX,token),
                JsonUtil.obj2String(userInfoDTO),
                RedisConstant.TOKEN_EXPIRE_TIME,
                TimeUnit.SECONDS);
    }

}
