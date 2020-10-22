package com.springmvc.demo.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.springmvc.demo.dao.IBaseDao;

public class BaseDaoImpl implements IBaseDao {

	@Autowired
	private SessionFactory sessionFactory;

	public org.hibernate.SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}

	@Override
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
}
