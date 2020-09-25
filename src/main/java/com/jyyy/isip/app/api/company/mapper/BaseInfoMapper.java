package com.jyyy.isip.app.api.company.mapper;

import com.jyyy.isip.app.api.company.model.BaseInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaseInfoMapper {

    int insert(BaseInfo record);

    List<BaseInfo> selectAll();

    BaseInfo selectById(String id);

    List<BaseInfo> selectByIds(List<String> ids);
}