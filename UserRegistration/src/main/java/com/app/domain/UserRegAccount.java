package com.app.domain;

import java.util.Date;

import com.app.constants.AppConstant;

import lombok.Data;


@Data
public class UserRegAccount {
	private Integer userId;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private long phno;
	private String otpNo;
	private Date dob;
	private String accountStatus= AppConstant.LOCK;
	private String adds;
}
