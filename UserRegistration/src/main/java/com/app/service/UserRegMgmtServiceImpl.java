package com.app.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.constants.AppConstant;
import com.app.domain.UserRegAccount;
import com.app.entity.UserAccount;
import com.app.repository.UserAccountRepository;


@Service("/UserService")
public class UserRegMgmtServiceImpl implements UserRegMgmtService {
	@Autowired
	private UserAccountRepository repository;
	
	@Override
	public boolean registerUserAccount(UserRegAccount ua) {
		//convert domain to entity class object
		UserAccount user= new UserAccount();
		BeanUtils.copyProperties(ua, user);
		//invoke repo class
		UserAccount saveEntity = repository.save(user);
		if(saveEntity.getUserId() != null)	
			return true;
		
		else 
			return false;
		
	}
	
	@Override
	public void updateStatus(String accountStatus, String username) {
		int isUpdate= 0;
		try {
			isUpdate = repository.updateStatus(accountStatus, username);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		if(isUpdate != 0) 
			System.out.println(AppConstant.status);
		else
			System.out.println(AppConstant.STATUS);
	}

	@Override
	public String fetchDtlsByUserNameAndPwd(String username, String pwd) {
		
	    int dtls = repository.findByUserNameAndPassword(username, pwd);
		if(dtls != 0) 
				return AppConstant.Login;		
		else	
			return AppConstant.credential;
		
	}

}
