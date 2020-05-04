package com.ssm.shop.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssm.shop.pojo.Login;


@Repository
public interface LoginDao {
	
	public Login getLogin(Login login);

	public List<Login> getAllLogin();
}
