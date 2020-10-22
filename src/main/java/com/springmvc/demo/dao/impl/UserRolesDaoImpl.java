package com.springmvc.demo.dao.impl;

import java.util.Collection;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.demo.dao.IUserRolesDao;
import com.springmvc.demo.entity.UserRolesEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
@Transactional
public class UserRolesDaoImpl extends BaseDaoImpl implements IUserRolesDao {

	@SuppressWarnings("unchecked")
	@Override
	public Collection<UserRolesEntity> getUserRolesByUserName(String userName) {
		log.info("{}", userName);
		Criteria criteria = getSession().createCriteria(UserRolesEntity.class);
		criteria.createAlias("userDetailsEntity", "userDetails");
		criteria.add(Restrictions.eq("userDetails.userName", userName));
		return (Collection<UserRolesEntity>) criteria.list();
	}
}
