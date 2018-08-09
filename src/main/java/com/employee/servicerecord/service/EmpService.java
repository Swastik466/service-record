package com.employee.servicerecord.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.servicerecord.dao.EmpRepository;
import com.employee.servicerecord.model.EmpLogin;
import com.employee.servicerecord.model.Employee;

@Service
public class EmpService {

  @Autowired
  private EmpRepository empRepository;
  
  public void addEmployee(EmpLogin emplogin) {
	  try {
		  empRepository.save(emplogin);
	  } catch (Exception e) {
		  
		  //exception to be logged
		  e.printStackTrace();
	  }
	  
  }

public Employee getUserProfile(String username) {
	// TODO Auto-generated method stub
	Employee employee = new Employee();
	
	return null;
}
}
