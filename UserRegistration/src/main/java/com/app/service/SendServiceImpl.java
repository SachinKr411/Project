package com.app.service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.domain.UserRegAccount;



@Service()
public class SendServiceImpl implements SendService {
	
	
	@Override
	public String sendotp(UserRegAccount ua) {
		String respBody = null;
		String restUrl = "https://2factor.in/API/V1/{api_key}/SMS/{phone_number}/AUTOGEN";
		RestTemplate rt= new RestTemplate();
		ResponseEntity<String> resEntity = rt.getForEntity(restUrl, String.class, "0cc636d7-549f-11eb-8153-0200cd936042", ua.getPhno() );
		int status = resEntity.getStatusCodeValue();
		if(status == 200) {
			respBody= resEntity.getBody();			
		}
		System.out.println(respBody);
		return respBody;
	}

	

	

}
