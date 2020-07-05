package com.hz.service;

import com.hz.domain.Permission;
import com.hz.domain.Role;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hz
 * @date 2020/4/9 3:47
 */


public interface IRoleService {

    List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;

    Role findById(String roleId) throws  Exception;


    void deleteRoleById(String roleId);

    void addPermissionToRole(String roleId, String[] permissionIds);

    List<Permission> findOtherPermissions(String roleId);
}
