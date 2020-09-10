package com.qa.main;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Tomato Sauce");
	}

	public String getDescription() {
		return tmpPizza.getDescription() + ", tomato sauce";
	}

	public double getCost() {
		return tmpPizza.getCost() + 0.25;
	}

}