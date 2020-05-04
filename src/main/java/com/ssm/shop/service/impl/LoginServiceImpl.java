package com.ssm.shop.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.shop.dao.LoginDao;
import com.ssm.shop.pojo.Login;
import com.ssm.shop.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao = null;

	@Override
	@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public Login getLogin(Login login) {
		return loginDao.getLogin(login);
	}

	@Override
	public List<Login> getAllLogin() {
		// TODO Auto-generated method stub
		return loginDao.getAllLogin();
	}

}
