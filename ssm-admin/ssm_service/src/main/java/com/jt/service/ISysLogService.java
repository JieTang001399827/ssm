package com.jt.service;

import com.jt.domain.SysLog;

import java.util.List;




public interface ISysLogService {

    List<SysLog> findAll(Integer pageNum, Integer pageSize) throws Exception;

    void save(SysLog sysLog) throws Exception;

}
