package com.mdu005.rest.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.mdu005.rest.dao.EmployeeDao;
import com.mdu005.rest.models.Employee;

@Path("/ems")
public class EmployeeServices {
	
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String hello()
	{
		return "HelloWorld";
	}

	
	@GET
	//@Path("employee/{empno}")
	@Path("/employee")
	@Produces(MediaType.APPLICATION_JSON)
	
	//public Employee findEmployee(@PathParam("empno") int empno)
	public Employee findEmployee(@QueryParam("empno") int empno)
	{
		EmployeeDao dao = new EmployeeDao();
	return	dao.getEmployee(empno);
	}
	
	@GET
	@Path("/employees")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> findAllEmployees()
	{
		EmployeeDao dao = new EmployeeDao();
		
		return dao.getEmployees();
	}
}
