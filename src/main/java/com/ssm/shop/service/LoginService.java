package com.ssm.shop.service;

import java.util.List;

import com.ssm.shop.pojo.Login;

public interface LoginService {
	
	public Login getLogin(Login login);

	public List<Login> getAllLogin();
}
