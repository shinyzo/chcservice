package com.lming.chcservice.controller;

import com.github.pagehelper.util.StringUtil;
import com.lming.chcservice.entity.ReserveEntity;
import com.lming.chcservice.enums.ReserveStatusEnum;
import com.lming.chcservice.enums.ResultEnum;
import com.lming.chcservice.exception.ChcProcessException;
import com.lming.chcservice.form.ReserveCreateForm;
import com.lming.chcservice.service.impl.ReserveServiceImpl;
import com.lming.chcservice.util.KeyUtil;
import com.lming.chcservice.util.ResultVOUtil;
import com.lming.chcservice.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 预约控制层
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
@RestController
@RequestMapping("/api/v1")
@Slf4j
public class ReserveController {

    @Autowired
    private ReserveServiceImpl reserveService;

    @GetMapping("/reserves/formuser/{id}")
    public ResultVO queryReserveByFromUserId(@PathVariable("id") Integer fromUserId)
    {
        List<ReserveEntity> reserveList = reserveService.findAllByFromUserId(fromUserId);
        return ResultVOUtil.success(reserveList);
    }

    @GetMapping("/reserves/fromdoctor/{id}")
    public ResultVO queryReserveByDoctorId(@PathVariable("id") Integer doctorId)
    {
        List<ReserveEntity> reserveList = reserveService.findAllByDoctorId(doctorId);
        return ResultVOUtil.success(reserveList);
    }

    @GetMapping("/reserve/create")
    public ResultVO create(@Valid ReserveCreateForm reserveCreateForm, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors()){
            log.error("【创建预约】 参数不正确，reserveCreateForm={}",reserveCreateForm);
            throw new ChcProcessException(ResultEnum.PARAM_ERROR.getCode(),bindingResult.getFieldError().getDefaultMessage());
        }
        ReserveEntity reserveEntity = new ReserveEntity();
        reserveEntity.setReserveId(KeyUtil.getReserveId());
        reserveEntity.setDoctorId(reserveCreateForm.getDoctorId());
        reserveEntity.setFromUserId(reserveCreateForm.getFromUserId());
        reserveEntity.setStatus(ReserveStatusEnum.IN.getCode());
        reserveService.create(reserveEntity);
        return ResultVOUtil.success(reserveEntity);
    }

    @GetMapping("/reserve/cancel")
    public ResultVO cancel(@RequestParam("reverseId") String reserveId)
    {
        if(StringUtil.isEmpty(reserveId)){
            log.error("【取消预约】 参数不正确，reserveId={}",reserveId);
            throw new ChcProcessException(ResultEnum.PARAM_ERROR);
        }

        // 需要校验 取消者与预约者是否同一个用户
        ReserveEntity reserveEntity = new ReserveEntity();
        reserveEntity.setReserveId(reserveId);
        reserveEntity.setStatus(ReserveStatusEnum.CANCEL.getCode());
        reserveService.cancel(reserveEntity);
        return ResultVOUtil.success(reserveEntity);
    }


}
