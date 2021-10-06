package com.ems.services;

import java.sql.SQLException;

import com.ems.dao.EmployeeDao;
import com.ems.models.Employee;

public class EmployeeServices {
	
	public boolean createNewEmployee(Employee emp) throws SQLException
	{
		EmployeeDao dao = new EmployeeDao();
		return dao.save(emp);
		
	}

}
