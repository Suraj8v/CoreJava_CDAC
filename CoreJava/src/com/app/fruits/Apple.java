package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String name, String color, double weight) {
		super(name, color, weight);
		
	}
	
	public String taste()
	{
		return "sweet n sour";
	}
	
	public String jam()
	{
		return super.getName()+" "+super.getColor()+ " jam is created...";
	}
	
	


}
