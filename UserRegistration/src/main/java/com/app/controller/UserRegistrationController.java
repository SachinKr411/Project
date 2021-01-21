package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.app.constants.AppConstant;
import com.app.domain.UserRegAccount;
import com.app.service.SendService;
import com.app.service.UserRegMgmtService;


@Controller
public class UserRegistrationController {
	@Autowired
	private UserRegMgmtService service;
	@Autowired
	private SendService otpService;
	
	@GetMapping("/loadForm.htm")
	public String loadRegForm(Model model) {
		// create cmd obj
		UserRegAccount acc = new UserRegAccount();
		// send cmd obj
		model.addAttribute("userAcc", acc);
		return AppConstant.regForm;
	}
	
	@PostMapping("/sendOtp")
	public String handleRegisterBtn(Model model,@ModelAttribute("userAcc")UserRegAccount ua) {
		 boolean registerUserAccount = service.registerUserAccount(ua);
		 if(!registerUserAccount)	{		 
			 model.addAttribute("MSG",AppConstant.FAILED);
			 return AppConstant.resultPage;
		 }
		 else {
			 otpService.sendotp(ua);
			 model.addAttribute("MSG",AppConstant.SUCCESS);
			 return AppConstant.otpPage;
		 }
				
	}
	@PostMapping("/verifyOtp")
	public String handlesubmitBtn(Model model,@ModelAttribute("userAcc")UserRegAccount ua) {
		service.updateStatus(AppConstant.UNLOCK, ua.getUserName());	
		model.addAttribute("MSG",AppConstant.success);
			return AppConstant.resultPage;
		
	}
	

}
