package com.employee.servicerecord.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.servicerecord.model.EmpLogin;
import com.employee.servicerecord.model.Employee;
import com.employee.servicerecord.model.EmployeeProfile;
import com.employee.servicerecord.service.EmpService;

@RestController
public class EmployeeController {

	@Autowired
	private EmpService empService;
	
	@RequestMapping("/hello")
	public String testMtethod() {
		return "Hello";
	}

	@RequestMapping(value = "/employee/profile/{userName}", method = RequestMethod.GET)
	@ResponseBody
	public Employee getProfileByUserName(@PathVariable("userName") String userName) {
		Employee emp = new Employee();
		EmployeeProfile empProfile = constructSampleProfile(); // this to be retrieved from Database based on userName
		emp.setUserName(userName);
		emp.setEmpProfile(empProfile);
		return emp;
	}
	
	@RequestMapping(value = "/employee/signup", method = RequestMethod.POST)
	public void signup(@RequestBody EmpLogin empLogin) {
		empService.addEmployee(empLogin);
	}

	private EmployeeProfile constructSampleProfile() {
		EmployeeProfile empProfile = new EmployeeProfile();
		empProfile.setName("Test Employee");
		empProfile.setPost("Coder");
		empProfile.setGradePay("B");
		empProfile.setOrganization("IR");
		empProfile.setDateOfJoining(new Date());
		empProfile.setPanNumber("POLHO9867Z"); // Validation can be put while saving PNR details to DB
		empProfile.setEmployeeNo(007);
		return empProfile;
	}

}
