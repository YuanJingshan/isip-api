package com.jyyy.isip.app.api.company.mapper;

import com.jyyy.isip.app.api.company.model.AuditLog;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditLogMapper {

    int insert(AuditLog record);

}