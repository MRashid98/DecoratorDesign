package com.qa.main;

public class Main {

	public static void main(String[] args) {

		Pizza basicPizza = new Mozzarella(new TomatoSauce(new PlainPizza()));
		
		System.out.println("Ingredients: " + basicPizza.getDescription());
		System.out.println("Cost: " + basicPizza.getCost());
	}

}
