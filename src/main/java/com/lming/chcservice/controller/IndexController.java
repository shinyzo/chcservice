package com.lming.chcservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class IndexController {



    @RequestMapping(value = "/")
    public String index(){

        return "index";
    }

}
