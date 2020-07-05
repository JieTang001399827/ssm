package com.jt.dao;

import com.jt.domain.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface ISysLogDao {

    @Select("select * from sysLog")
    List<SysLog> findAll(Integer pageNum, Integer pageSize) throws Exception;

    @Insert("insert into syslog(id,visitTime,username,ip,url,executionTime,method) values(#{id},#{visitTime},#{username},#{ip},#{url},#{executionTime},#{method})")
    void save(SysLog sysLog) throws Exception;
}
