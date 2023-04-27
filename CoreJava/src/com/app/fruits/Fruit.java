package com.app.fruits;

public class Fruit {
	
	private String name,color; private double weight; boolean fresh;
	
	public Fruit(String name, String color, double weight) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.fresh = true;
	}
	
	
	public String taste()
	{
		return "no such taste";
	}
	
	public String toString()
	{
		return "name :"+name+" weight: "+weight+" color "+color;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public boolean isFresh() {
		return this.fresh;
	}
	public void setFresh(boolean f) {
		this.fresh=f;
	}


	

	
	}
	
	

	

