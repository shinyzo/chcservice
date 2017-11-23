package com.lming.chcservice.aspect;

import com.lming.chcservice.constant.CookieConstant;
import com.lming.chcservice.constant.RedisConstant;
import com.lming.chcservice.enums.PlatTypeEnum;
import com.lming.chcservice.enums.ResultEnum;
import com.lming.chcservice.exception.ChcAuthorizeException;
import com.lming.chcservice.exception.ChcProcessException;
import com.lming.chcservice.util.CookieUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * 公共参数校验
 * App版本，字符编码，加密验签
 *
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
@Aspect
@Component
@Slf4j
public class ChcParamCheckAspect {

    /**
     * 切入点 indexController和LoginController除外其他的所有Controller的方法及参数类型
     */
    @Pointcut("execution(public * com.lming.chcservice.controller.*.*(..))")
    public void verify() {
    }

    ;


    @Before("verify()")
    public void doVerify() {
//        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = requestAttributes.getRequest();
//        String version = request.getParameter("version");
//        String appType = request.getParameter("appType");
//        String charset = request.getParameter("charset");
//        String platType = request.getParameter("platType");
//        String randomKey = request.getParameter("randomKey");
//        String signData = request.getParameter("signData");
//
//        log.info("version => {}", version);
//        log.info("appType => {}", appType);
//        log.info("charset => {}", charset);
//        log.info("platType => {}", platType);
//        log.info("randomKey => {}", randomKey);
//        log.info("signData => {}", signData);
//
//        if (StringUtils.isEmpty(version) || StringUtils.isEmpty(appType) || StringUtils.isEmpty(charset)
//                || StringUtils.isEmpty(platType) || StringUtils.isEmpty(randomKey) || StringUtils.isEmpty(signData)
//                ) {
//            throw new ChcProcessException(ResultEnum.PARAM_ERROR);
//        }
//
//        if (PlatTypeEnum.getPlatTypeEnum(platType) == null) {
//            throw new ChcProcessException(ResultEnum.APP_TYPE_ERROR);
//        }


    }
}
