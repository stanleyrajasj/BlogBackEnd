package com.niit.BlogBack.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.niit.BlogBack.model.User;

@Repository("UserDao")
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	

	public UserDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<User> list() {
		// TODO Auto-generated method stub
		@SuppressWarnings({ "unchecked" })
		List<User> listUser = (List<User>)
		sessionFactory.getCurrentSession().createCriteria(User.class)
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUser;
		
	}

	/*
	@Transactional	
	public User create(User users) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(users);
		return users;
	}*/
	

	public User get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	public User update(Long id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveOrUpdate(User user) {
		// TODO Auto-generated method stub
		
	}

	public void delete(String user_Id) {
		// TODO Auto-generated method stub
		
	}

	public boolean isvaliduser(String name, String password, boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAdmin(String name, String password, boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

	public User create(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	
}