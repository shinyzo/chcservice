package com.lming.chcservice.aspect;

import com.lming.chcservice.constant.CookieConstant;
import com.lming.chcservice.constant.RedisConstant;
import com.lming.chcservice.exception.ChcAuthorizeException;
import com.lming.chcservice.exception.ChcProcessException;
import com.lming.chcservice.util.CookieUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
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

/**
 * 用户登录切面
 */
@Aspect
@Component
@Slf4j
public class ChcAuthorizeAspect {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Pointcut("execution(public * com.lming.chcservice.controller.*.*(..))"
            + "&& !execution(public * com.lming.chcservice.controller.LoginController.*(..))")
    public void verify(){};


    @Before("verify()")
    public void doVerify(){
       ServletRequestAttributes requestAttributes =  (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
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
        String openid = redisTemplate.opsForValue().get(String.format(RedisConstant.TOKEN_PREFIX,token));
        if(StringUtils.isEmpty(openid))
        {
            log.warn("【登录校验】- redis中找不到token，token={}",token);
            throw new ChcAuthorizeException();
        }

       //  更新用户cookie时间，redis不动


    }

}
