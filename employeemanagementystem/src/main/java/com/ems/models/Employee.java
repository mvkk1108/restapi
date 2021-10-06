package com.ems.models;

import java.util.Date;

public class Employee {
	
	private int  id ;
	private String  fullname;
	private String   username;
	private String   email;
	private String  mobile;
	private double   salary;
	private String   status;
	private String  password;
	private Date  dataofjoin;
	private int  deptno ;
	public Employee(int id, String fullname, String username, String email, String mobile, double salary, String status,
			String password, Date dataofjoin, int deptno) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.username = username;
		this.email = email;
		this.mobile = mobile;
		this.salary = salary;
		this.status = status;
		this.password = password;
		this.dataofjoin = dataofjoin;
		this.deptno = deptno;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDataofjoin() {
		return dataofjoin;
	}
	public void setDataofjoin(Date dataofjoin) {
		this.dataofjoin = dataofjoin;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullname=" + fullname + ", username=" + username + ", email=" + email
				+ ", mobile=" + mobile + ", salary=" + salary + ", status=" + status + ", password=" + password
				+ ", dataofjoin=" + dataofjoin + ", deptno=" + deptno + "]";
	}
	
	

}
