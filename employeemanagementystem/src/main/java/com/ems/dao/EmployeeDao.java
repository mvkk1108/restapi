package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ems.models.Employee;
import com.ems.utils.DBUtils;
import com.ems.utils.SQLConstants;

public class EmployeeDao {
	
	
public boolean save(Employee emp) throws SQLException
{
	boolean status = false;
	
	
	
	Connection con = DBUtils.getCon();
	PreparedStatement ps = null;
	try
	{
		
		
		ps = con.prepareStatement(SQLConstants.INSERT_EMPLOYEE);
		
		ps.setString(1, emp.getFullname());
		
		ps.setString(2, emp.getEmail());
		
		ps.setString(3, emp.getMobile());
		ps.setString(4, emp.getUsername());
		ps.setString(5,emp.getPassword());
		ps.setString(6, emp.getStatus());
		int res = ps.executeUpdate();
		
		if(res>=1)
		{
			status = true;
			
		}
	}catch (Exception e) {
	e.printStackTrace();
	}
	finally
	{
		if(con!=null)
		{
			con.close();
		}
	}
	return status;
}
}
