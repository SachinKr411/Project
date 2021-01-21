package com.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.constants.AppConstant;
import com.app.domain.UserRegAccount;
import com.app.service.UserRegMgmtService;


@Controller
public class LoginPageController {
	@Autowired
	private UserRegMgmtService service;
	
	@GetMapping("/login.htm")
	public String showLoginPage(Map<String,Object> map) {
		UserRegAccount ura= new UserRegAccount();
		map.put("loginDtls", ura);
		return AppConstant.loginPage;
	}
	
	@PostMapping("/login.htm")
	public String handleLoginBttn(Map<String,Object> map, @ModelAttribute("loginDtls") UserRegAccount ura) {
		String msg = service.fetchDtlsByUserNameAndPwd(ura.getUserName(), ura.getPassword());
		map.put("MSG", msg);
		return  AppConstant.resultPage;
	}
}
