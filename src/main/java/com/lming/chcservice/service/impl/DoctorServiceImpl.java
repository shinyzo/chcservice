package com.lming.chcservice.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lming.chcservice.constant.PageConstant;
import com.lming.chcservice.dao.DoctorRepository;
import com.lming.chcservice.entity.DoctorInfo;
import com.lming.chcservice.form.DoctorQueryForm;
import com.lming.chcservice.form.Form2MapConvert;
import com.lming.chcservice.mapper.DoctorMapper;
import com.lming.chcservice.service.DoctorService;
import com.lming.chcservice.util.DefaultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository repository;

    @Autowired
    private DoctorMapper mapper;

    @Override
    public DoctorInfo findById(Integer doctorId) {
        return repository.findOne(doctorId);
    }

    @Override
    public List<DoctorInfo> findAll(DoctorQueryForm doctorQueryForm) {
        Map<String, Object> paramsMap = Form2MapConvert.convert2Map(doctorQueryForm);
        return mapper.findAll(paramsMap);
    }

    @Override
    public PageInfo<DoctorInfo> findByPage(DoctorQueryForm doctorQueryForm) {
        Map<String, Object> paramsMap = Form2MapConvert.convert2Map(doctorQueryForm);
        PageHelper.startPage(
                DefaultUtil.getVal(doctorQueryForm.getPageNum(),PageConstant.PAGE_NUM ),
                DefaultUtil.getVal(doctorQueryForm.getPageSize(),PageConstant.PAGE_SIZE )
        );
        List<DoctorInfo> doctorInfos = mapper.findAll(paramsMap);
        PageInfo<DoctorInfo> pageInfo = new PageInfo<>(doctorInfos);
        return pageInfo;
    }


}
