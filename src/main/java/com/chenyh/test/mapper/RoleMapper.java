package com.chenyh.test.mapper;

import com.chenyh.test.bo.Role;

/**
 * @author yihui.chen@geely.com
 * @create 2020-03-27 15:33
 * @description
 */
public interface RoleMapper {

    public Role getRole(Long id);

    public Role findRole(String roleName);

    public int deleteRole(Long id);

    public int insertRole(Role role);
}
