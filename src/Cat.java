
public class Cat {

	// Objects consist of two types items
	// Variables, otherwise known as instance variables

	// We all have characteristics but each one is slightly personalised
	// An instance is essentially that

	// What would a cat have ????
	// Paws, Tail, Whiskers, Colour
	// IT POSSESSES
	int age;
	int noOfPaws; // default to 0
	boolean hasTail;
	int noOfWhiskers;
	String colour;
	int total;

	// The method is how the class is able to do things - Its functionality
	// ITS ACTIONS

	// Void here refers to the return type

	// What if we had an negative number

	// Your methods should only be doing one thing
	// If its doing more than one thing its doing too much

	public void meow() {

		if (age >= 0) {

			if (age < 7 && age >= 0) {
				System.out.println("cute meow");
			} else if (age >= 7 && age < 12) {
				System.out.println("Middle aged meow");
			} else {
				System.out.println("Old Meow");
			}
		} else {
			System.out.println("Cat cant meow if its got a negative age dummy");
		}
	}

	public void scratch() {
		System.out.println("Scratch");
	}

	// Constructors

	public Cat() {
		
	}

	public Cat(int age,
	int noOfPaws,
	boolean hasTail,
	int noOfWhiskers,
	String colour) {
		//This as the instance 
		this.total =  noOfPaws + noOfWhiskers;
		this.age = age;
		this.noOfPaws = noOfPaws;
		this.hasTail = hasTail;
		this.noOfWhiskers = noOfWhiskers;
		this.colour = colour;
	}

}
