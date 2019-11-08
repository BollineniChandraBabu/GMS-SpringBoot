package com.revature.GradeManagementSystemapi.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.revature.GradeManagementSystemapi.dao.impl.DepartmentsRepository;
import com.revature.GradeManagementSystemapi.model.Departments;


@Service
public class DepartmentsServicesImpl {
	@Autowired
	private DepartmentsRepository departmentsRepository;
	@Transactional
	public boolean checkDepartment(int id) 
	{
	boolean result=false;
	Departments departments=departmentsRepository.checkDepartment(id);
	 if(departments!=null) {
		 result=true;
	 }
	return result;	
	}
	public List<Departments> viewDepartments()
	{
	return departmentsRepository.viewDepartments();
	}
}
