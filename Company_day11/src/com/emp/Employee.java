package com.emp;

import java.io.Serializable;
import java.time.LocalDate;

import com.dept.Department;

public class Employee implements Serializable {
	
	private String id,firstName,lastName;
	LocalDate joinDate;
	Department dept;
	private double salary;
	
	public Employee(String id)
	{
		this.id = id;
	}
	
	
	public Employee(String id, String firstName, String lastName, LocalDate joinDate, Department dept, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.joinDate = joinDate;
		this.dept = dept;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", joinDate=" + joinDate
				+ ", dept=" + dept + " salary : "+salary;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public LocalDate getJoinDate() {
		return joinDate;
	}


	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}


	public Department getDept() {
		return dept;
	}


	public void setDept(Department dept) {
		this.dept = dept;
	}


	public String getId() {
		return id;
	}
	
	
	
	

}
