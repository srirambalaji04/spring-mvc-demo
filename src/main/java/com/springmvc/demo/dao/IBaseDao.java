package com.springmvc.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public interface IBaseDao {

	public SessionFactory getSessionFactory();
	
	public Session getSession();
}
