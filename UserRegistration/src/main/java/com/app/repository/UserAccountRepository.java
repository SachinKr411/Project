package com.app.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.app.entity.UserAccount;

public interface UserAccountRepository extends CrudRepository<UserAccount, Integer> {
	
	@Modifying
	@Transactional
	@Query(value = "update UserAccount set accountStatus= :accStatus where userName= :user")
	public int updateStatus(@Param("accStatus")String accountStatus,@Param("user")String username);
	
	@Query("select count(*) from UserAccount where userName= :uname and password= :pwd ")
	public int findByUserNameAndPassword(@Param("uname")String username,@Param("pwd")String pwd);

}
