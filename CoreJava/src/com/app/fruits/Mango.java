package com.app.fruits;

public class Mango extends Fruit {
	
  

	public Mango(String name, String color, double weight) {
		super(name, color, weight);
		// TODO Auto-generated constructor stub
	}
	
	public String taste()
	{
		return "Sweet";
	}
	
	public String pulp()
	{
		return super.getName()+" "+super.getColor()+ "Pulp is created...";
	}


	
	
	

}
