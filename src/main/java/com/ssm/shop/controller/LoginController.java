package com.ssm.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.shop.pojo.Login;
import com.ssm.shop.service.LoginService;

@Controller
@RequestMapping("/login")
//鍙互閰嶇疆鏁版嵁妯″�?�鐨勫悕绉板拰绫诲�?�锛屼袱鑰呭彇鎴栧叧绯�
public class LoginController {
	
	@Autowired
	private LoginService loginService = null;
	
	@RequestMapping("/login")
	public ModelAndView login(Login login) {
		ModelAndView mv = new ModelAndView();
//		Login l = loginService.getLogin(login);
//		if(l!=null)
//		{
//		  System.out.println(l);
//		  mv.addObject("login", l); 
//		  mv.setViewName("loginsucc");
//		}
//		else
			mv.setViewName("fail");
			System.out.println("****************************************");
		return null;
	}
	@RequestMapping("/getAllLogin")
	public ModelAndView getAllRole() {
		List<Login> role = loginService.getAllLogin();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("allDetails");
		mv.addObject("role", role);
		return mv;
	}
}
