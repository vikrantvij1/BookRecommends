package com.book.login.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.book.login.model.LoginModel;
@Transactional
@Repository
public class LoginDaoImpl implements LoginDao {
	@PersistenceContext	
	private EntityManager entityManager;
	
	
	@Override
	public void addUser(LoginModel login) {
		// TODO Auto-generated method stub
		entityManager.persist(login);

	}

}
