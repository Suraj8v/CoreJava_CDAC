package com.rules;
import java.time.LocalDate; 
import com.test.*;
import java.time.Period;
import java.util.Map;

import javax.naming.CommunicationException;

import com.dept.*;
import com.emp.*;
import com.exception.*;

public class ValidateRules {
	
	public static Employee validateAll(String id, String firstName, String lastName, String joinDate, String dept, double salary,Map<String,Employee>empMap) throws CompanyException
	{
		LocalDate jdate = validateDate(joinDate);
		Department d1 = validateDept(dept);
		String empid = checkDuplicate(id,empMap);
		
		Employee e = new Employee(id, firstName, lastName, jdate, d1, salary);
		
		return e;
		
	}
	
	
	public static LocalDate validateDate(String date) throws CompanyException
	{
		LocalDate d = LocalDate.parse(date);
		int year = Period.between(d, LocalDate.now()).getYears();
		if(year>=3)
			throw new CompanyException("Invalid Joining Date!!");
			
		else
			return d;
			
		
	}
	
	public static String checkDuplicate(String id, Map<String,Employee>empMap) throws CompanyException
	{
		if(empMap.containsKey(id))
			throw new CompanyException("Employee already exists");
		else
		  return id;
		
	}
	
	public static Department validateDept(String dept)
	{
		Department d = Department.valueOf(dept.toUpperCase());
	    return d;
	}
	
	
	
	

}
