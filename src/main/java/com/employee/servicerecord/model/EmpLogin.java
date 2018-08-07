package com.employee.servicerecord.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmpLogin {
  
	@Id
	private String userId;
	private String passkey;
	
	public EmpLogin() {
		
	}
	
	public EmpLogin(String userName, String password) {
		super();
		this.userId = userName;
		this.passkey = password;
	}
	
	public String getUserName() {
		return userId;
	}
	public void setUserName(String userName) {
		this.userId = userName;
	}
	public String getPassword() {
		return passkey;
	}
	public void setPassword(String password) {
		this.passkey = password;
	}
}
