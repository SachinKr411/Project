package com.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "USER_REGISTRATION")
public class UserAccount {
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Integer userId;
	@Column(name = "FIRSTNAME")
	private String firstName;
	@Column(name = "LASTNAME" )
	private String lastName;
	@Column(name = "USERNAME")
	private String userName;
	@Column(name = "NUMBER")
	private long phno;
	@Column(name="PASSWORD")
	private String password;
	@Column(name = "DOB" )
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Column(name = "ACCOUNT_STATUS")
	private String accountStatus;
	@Column(name = "ADDRESS")
	private String adds;
	@Column(name = "CREATED_DATE")
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Column(name = "UPDATE_DATE")
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
}
