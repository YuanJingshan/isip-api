package com.jyyy.isip.app.api.company.service;

import com.jyyy.isip.app.api.company.model.BaseInfo;

import java.util.List;

/**
 * interface
 *
 * @author YuanJingshan
 * @version 1.0
 * @description 企业基础信息Service
 * @date Create in 2019/8/30 11:24
 */
public interface BaseInfoService {

    /*
     * 根据ID查询
     * @author YuanJingshan
     * @date Create in 2019/9/3 10:36
     * @param [list]
     * @return java.util.List<com.up.bp.app.api.company.base.entity.BaseInfo>
     */
    List<BaseInfo> findByIds(List<String> list);
}
