package com.springmvc.demo.dao;

import java.util.Collection;

import com.springmvc.demo.entity.UserRolesEntity;

public interface IUserRolesDao {

	public Collection<UserRolesEntity> getUserRolesByUserName(String userName);
}
