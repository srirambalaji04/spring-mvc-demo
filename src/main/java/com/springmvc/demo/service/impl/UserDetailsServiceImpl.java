package com.springmvc.demo.service.impl;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springmvc.demo.dao.IUserRolesDao;
import com.springmvc.demo.entity.CustomUserDetails;
import com.springmvc.demo.entity.UserRolesEntity;

import lombok.extern.slf4j.Slf4j;

@Service("userDetailsService")
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private IUserRolesDao userRolesDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Collection<UserRolesEntity> userRolesEntities = Optional.ofNullable(userRolesDao.getUserRolesByUserName(username))
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found"));
		log.debug("{}", userRolesEntities);
		return new CustomUserDetails(userRolesEntities);
	}

}
