package com.jyyy.isip.app.api.company.service.impl;

import com.jyyy.isip.app.api.company.model.BaseInfo;
import com.jyyy.isip.app.api.company.mapper.BaseInfoMapper;
import com.jyyy.isip.app.api.company.service.BaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YuanJingshan
 * @version 1.0
 * @description 企业基础信息Service
 * @date Create in 2019/8/30
 */
@Service
public class BaseInfoServiceImpl implements BaseInfoService {

    @Autowired
    private BaseInfoMapper baseInfoMapper;

    @Override
    public List<BaseInfo> findByIds(List<String> list) {
        return baseInfoMapper.selectByIds(list);
    }
}
