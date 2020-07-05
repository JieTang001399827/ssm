package com.jt.service;

import com.jt.domain.Permission;
import com.jt.domain.Role;
import org.springframework.stereotype.Service;

import java.util.List;



public interface IRoleService {

    List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;

    Role findById(String roleId) throws  Exception;


    void deleteRoleById(String roleId);

    void addPermissionToRole(String roleId, String[] permissionIds);

    List<Permission> findOtherPermissions(String roleId);
}
