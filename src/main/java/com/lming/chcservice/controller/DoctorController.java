package com.lming.chcservice.controller;

import com.lming.chcservice.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/doctor")
@Slf4j
public class DoctorController {

    @GetMapping("/list")
    public ResultVO list() {

        return null;
    }
}
