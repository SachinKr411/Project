package com.app.service;

import com.app.domain.UserRegAccount;

public interface UserRegMgmtService {
	
	public boolean registerUserAccount(UserRegAccount ua);		
	public void updateStatus(String accountStatus,String username);
	public String fetchDtlsByUserNameAndPwd(String username,String pwd);
}
