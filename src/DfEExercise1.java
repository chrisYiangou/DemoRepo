
public class DfEExercise1 {

	public static void main(String[] args) {
		
		//All I want you to do is just make a comment and explain whats going on in each line
		//Fix the issue -- Create a Dog...
		
		
		boolean amIHappy = false; // A boolean names amIHAppy is being declared and assigned false
		
		int weight = 50; //Declared the numeric value of 30 to a variable called weight 
		String name = "Billy Bob"; //Declared a String called name and assigned it a value of Billy Bob
		Dog goodBoy = new Dog(name, weight); //Declaring a single Dog called goodBoy and setting its name and weight to the values assigned above  
		int x = weight - 10; // Create an integer which is 50-10 =40
		if (x < 15) goodBoy.bark(); //If x is smaller than 15 
//		} else {
//			System.out.println("Too Old");
//		}
		while (x < 3) {
			
			goodBoy.play();
			x = x + 1; //x++
		}   //While x is less than 3, the good boy will play #
		
		int[] numList = {1,2,3,4,5,6}; //Made a array of numbers 
		System.out.println("How are you"); //System is printing How are you
		System.out.println("My " + name + " is doing great"
							+ " how's yours");  // Printing a concated String with a previously defined name value
		String num = "305"; // Declared a string called num with value 305  
		int z = Integer.parseInt(num); // Taking the num and turning it into an Integer called z
		System.out.println(num);
		
		goodBoy.weight = 30;
		
		int random = (int) (Math.random() * 10);
		
		System.out.println(random);
		
	}

		
	}

