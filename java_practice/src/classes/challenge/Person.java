package classes.challenge;

import java.text.DecimalFormat;

public class Person {
	
	String name;
	double weight;
	
	public Person(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	void eat(Food food) {
		if (food != null) {
			this.weight += food.weight;
		}
	}
	
	String greetings() {
        DecimalFormat dFormat = new DecimalFormat("#0.00");
		return "Hello, I'm " + name + " and my weight is " + dFormat.format(weight) + "kg.";
	}
	
}
