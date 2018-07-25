package com.employee.service.model;

public class Employee {

	 private String userName;
	 private EmployeeProfile empProfile;
	 
	 public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public EmployeeProfile getEmpProfile() {
		return empProfile;
	}
	public void setEmpProfile(EmployeeProfile empProfile) {
		this.empProfile = empProfile;
	}
	
}
