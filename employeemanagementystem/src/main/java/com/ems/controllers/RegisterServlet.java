package com.ems.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.models.Employee;
import com.ems.services.EmployeeServices;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// read the data 
		
		String fullname = request.getParameter("fullname");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		// store the data 
		PrintWriter out = response.getWriter();
		response.setContentType("text/css");
		
		Employee emp = new Employee();
		emp.setFullname(fullname);
		emp.setEmail(email);
		emp.setMobile(mobile);
		emp.setUsername(username);
		emp.setPassword(password);
		emp.setStatus("no");
		
		EmployeeServices services = new EmployeeServices();
		try
		{
		boolean status =	services.createNewEmployee(emp);
		
		if(status)
		{
		response.sendRedirect("success.jsp?message=Your registration is successfull");	
		}
		else
		{
			response.sendRedirect("failure.jsp?message=somethind goes woring ... pls try again");	
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// give response
		
		
		
	}

}
