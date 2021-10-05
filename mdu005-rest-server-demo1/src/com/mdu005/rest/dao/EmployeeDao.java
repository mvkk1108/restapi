package com.mdu005.rest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.mdu005.rest.db.DBConnection;
import com.mdu005.rest.models.Employee;

public class EmployeeDao {
	
	
	
	public Employee getEmployee(int empId)
	{
		
		Employee emp = null;
		
		
		Connection con= null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try
		{
			con = DBConnection.getConnection();
			ps = con.prepareStatement("select * from employee where empno=?");
			ps.setInt(1, empId);
			
			rs = ps.executeQuery();
			if(rs.next())
			{
				emp = new Employee();
		    	emp.setEmpno(rs.getInt(1));
		    	emp.setEmpname(rs.getString(2));
		    	emp.setEmail(rs.getString(3));
		    	emp.setMobile(rs.getString(4));
		    	LocalDate ld = LocalDate.parse(new SimpleDateFormat("YYYY-MM-dd").format(rs.getDate(6)));
		    	
		    	//System.out.println(ld);
		    	emp.setDateofjoin(ld);
		    	emp.setSalary(rs.getDouble(5));
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return emp;
	}
	
	
	
	public List<Employee> getEmployees()
	{
	
		List<Employee> employeesList = new ArrayList<Employee>();
		

		Employee emp = null;
		
		
		Connection con= null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try
		{
			con = DBConnection.getConnection();
			ps = con.prepareStatement("select * from employee");
			
			
			rs = ps.executeQuery();
			while(rs.next())
			{
				emp = new Employee();
		    	emp.setEmpno(rs.getInt(1));
		    	emp.setEmpname(rs.getString(2));
		    	emp.setEmail(rs.getString(3));
		    	emp.setMobile(rs.getString(4));
	LocalDate ld = LocalDate.parse(new SimpleDateFormat("YYYY-MM-dd").format(rs.getDate(6)));
		    	
		    	//System.out.println(ld);
		    	emp.setDateofjoin(ld);
		    	emp.setSalary(rs.getDouble(5));
		    	employeesList.add(emp);
			}
		
		
		
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	
		return employeesList;
	
	}

}
