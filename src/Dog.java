
public class Dog {
	
    int weight;  
	String name; 
	
	public void bark() {
		System.out.println("Woof");
	}
	
	public void play() {
		System.out.println("Playing");
	}
	
	
	public Dog(String name,int  weight) {
		this.name = name;
		this.weight = weight;
	}

}
