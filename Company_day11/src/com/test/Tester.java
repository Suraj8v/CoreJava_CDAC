package com.test;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static com.rules.ValidateRules.*;

import com.dept.*;
import com.emp.*;
import com.exception.*;
import com.rules.*;
import static com.filehandling.IOUtils.*;
import com.filehandling.*;

public class Tester {

	public static void main(String[] args) {
		
		
		Map<String,Employee> empMap = new HashMap<String, Employee>();
			try(Scanner sc = new Scanner(System.in)) {
				
				System.out.println("Enter the file name : ");
				empMap =restoreData(sc.next());
				System.out.println("Data restored successfully!!");
				
				boolean exit = false;
			
			while(exit!=true) 
			try {	
	
				System.out.println("Choose an option : ");
				System.out.println("1.Hire new emp  2.List all emp details 3. Promote an emp  4.Delete emp details  5.sort the employees");
			
				switch(sc.nextInt())
				{
				
				case 1 :
					System.out.println("Enter the following details : ");
					System.out.println("id, firstName, lastName, joinDate, dept, salary");
					Employee e = validateAll(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),empMap);
					empMap.put(e.getId(), e);
					System.out.println("Employee added successfully!");
					break;
				
				case 2:
					 
					//empMap.values().forEach(e1->System.out.println(e1));
					empMap.forEach((k,v)->System.out.println(v));
					break;
					
				case 3 :
					System.out.println("Enter the employee id :");
					String id = sc.next();
					if(empMap.containsKey(id)) 
					{
						System.out.println("Enter the Salary to increase : ");
						empMap.get(id).setSalary(empMap.get(id).getSalary()+sc.nextDouble());
						System.out.println("Salary has been increased!!");
					}
					else
						throw new CompanyException("Invalid employee id");
					break;
					
				case 4 :
					System.out.println("Enter the employee id which you want to delete : ");
					String eid = sc.next();
					if(empMap.containsKey(eid))
					{
						empMap.remove(eid);
						System.out.println("Employee deleted successfully");
					}
					else
						throw new CompanyException("Invalid employee id");
					break;
				
				case 5 :
					empMap.values().stream().sorted((d1,d2)->d1.getJoinDate().compareTo(d2.getJoinDate()))
					.forEach(p->System.out.println(p));
					break;
				
				case 6 :
					empMap =restoreData("emp.ser");
					System.out.println("Data restored successfully!!");
					break;
	
				case 0 :
					System.out.println("Enter the filename : ");
					storeData(sc.next(),empMap);
					System.out.println("Data stored successfully!!");
					exit=true;
					break;
					
		
				}
				}
	
			catch(Exception e)
			{
				e.printStackTrace();
				sc.nextLine();
			}
			}

			
		}
	}

	


//100 suraj jagdale 2021-12-12 hr 4000
//101 sourabh deshmukh 2022-12-12  rnd 10000
//102 malhar patil 2021-04-08 finance 23000
//103 john cena 2022-03-09 sales 34400
//200 john wick 2022-11-11 SALES 9000.0