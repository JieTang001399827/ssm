package com.jt.service.impl;

import com.jt.dao.IPermissionDao;
import com.jt.domain.Permission;
import com.jt.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class PermissionImpl implements IPermissionService {

    @Autowired
    private IPermissionDao permissionDao;

    @Override
    public void deleteById(String id) throws Exception {
        permissionDao.deleteFromRole_Permission(id);
        permissionDao.deleteById(id);
    }

    @Override
    public Permission findById(String id) throws Exception {
        return permissionDao.findById(id);
    }

    @Override
    public void save(Permission permission) throws Exception{
        // 不好的设计
        Integer permissionId = (int) (Math.random() * Math.random() * Math.random() * 100000);
        permission.setId(permissionId.toString());
        permissionDao.save(permission);
    }

    @Override
    public List<Permission> findAll() throws Exception{
        return permissionDao.findAll();
    }
}
