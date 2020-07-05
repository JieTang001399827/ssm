package com.jt.service;

import com.jt.domain.Permission;

import java.util.List;


public interface IPermissionService {

    void deleteById(String id) throws Exception;

    Permission findById(String id) throws Exception;

    void save(Permission permission) throws Exception;

    List<Permission> findAll() throws Exception;
}
