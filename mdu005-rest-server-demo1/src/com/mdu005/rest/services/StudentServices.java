package com.mdu005.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("student")
public class StudentServices {

	@Path("std1")
	@GET
	public String studentsInfo()
	{
		return "Student Service";
	}
	
	@POST
	@Path("/student")
	public String getStudentName(@QueryParam("name") String name)
	{
		return "Hello "+name;
	}
}
