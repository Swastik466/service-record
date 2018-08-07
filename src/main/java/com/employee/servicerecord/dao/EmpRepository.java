package com.employee.servicerecord.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.servicerecord.model.EmpLogin;

public interface EmpRepository extends JpaRepository<EmpLogin, String> {
	
}
