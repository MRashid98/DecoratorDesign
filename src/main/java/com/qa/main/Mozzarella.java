package com.qa.main;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Mozzarella");
	}

	public String getDescription() {
		return tmpPizza.getDescription() + ", mozzarella";
	}

	public double getCost() {
		return tmpPizza.getCost() + 1.0;
	}

}