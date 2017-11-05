package com.lming.chcservice.controller;

import com.lming.chcservice.constant.CookieConstant;
import com.lming.chcservice.constant.RedisConstant;
import com.lming.chcservice.converter.UserInfo2UserInfoDTOConverter;
import com.lming.chcservice.dto.UserInfoDTO;
import com.lming.chcservice.enums.ResultEnum;
import com.lming.chcservice.model.MobileNav;
import com.lming.chcservice.model.UserInfo;
import com.lming.chcservice.service.UserService;
import com.lming.chcservice.util.CookieUtil;
import com.lming.chcservice.util.ResultVOUtil;
import com.lming.chcservice.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/")
@Slf4j
public class IndexController {


    @GetMapping(value = "index")
    public String index(){

        return "Hi, CHC Service is Running !";
    }

}
