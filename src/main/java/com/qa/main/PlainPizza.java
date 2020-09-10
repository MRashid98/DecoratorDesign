package com.qa.main;

public class PlainPizza implements Pizza {

	public PlainPizza() {
		System.out.println("Adding thin dough");
	}

	public String getDescription() {
		return "thin dough";
	}

	public double getCost() {
		return 4.0;
	}

}


