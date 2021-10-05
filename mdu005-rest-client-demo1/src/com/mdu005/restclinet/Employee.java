package com.mdu005.restclinet;

import java.time.LocalDate;
import java.util.Date;

import javax.json.bind.annotation.JsonbDateFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Employee {
	private int empno;
	private String empname;
	private String email;
	private String mobile;
	
	private LocalDate dateofjoin;
	private double salary;
	
	public Employee(int empno, String empname, String email, String mobile, LocalDate dateofjoin, double salary) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.email = email;
		this.mobile = mobile;
		this.dateofjoin = dateofjoin;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
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
	public LocalDate getDateofjoin() {
		return dateofjoin;
	}
	public void setDateofjoin(LocalDate dateofjoin) {
		this.dateofjoin = dateofjoin;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", email=" + email + ", mobile=" + mobile
				+ ", dateofjoin=" + dateofjoin + ", salary=" + salary + "]";
	}
	
}
