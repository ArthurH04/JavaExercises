package classes.challenge;

public class Dinner {

	public static void main(String[] args) {
		
		Person person = new Person("Walter", 72.40);
		
		Food food1 = new Food("Apple", 0.256 );
		Food food2 = new Food("Pineaple", 0.165);
		
		System.out.println(person.greetings());
		
		person.eat(food1);
		person.eat(food2);
		
		System.out.println(person.greetings());
		
		
	}

}
