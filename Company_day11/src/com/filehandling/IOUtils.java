package com.filehandling;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;


import com.emp.Employee;


public interface IOUtils {
	
	public static void storeData (String fileName, Map<String,Employee>empMap) throws IOException
	{
		try(ObjectOutputStream os = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName))))
				{
					os.writeObject(empMap); 
				}
	}
	
	@SuppressWarnings("unchecked")
	public static Map<String,Employee> restoreData (String fileName) 
	{
		try(ObjectInputStream os = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName))))
		{ 
			return (Map<String,Employee>)os.readObject();
			
			
		}
		catch(Exception e)
		{
			System.out.println("error in deserialization");
			return new HashMap<>();
		}
	}

}
