package com.employee.servicerecord.dao;

import org.springframework.data.repository.CrudRepository;

import com.employee.servicerecord.model.EmpLogin;

public interface EmpRepository extends CrudRepository<EmpLogin, String> {
	
}
