
public class Main {
	
	public static void main(String[] args) {
	
		Exercise_2.helloWorldEx();
		RandomPhrase.ranMessage();
		
		//When methods arent static, the object MUST be instanciated 
		
		Cat cat = new Cat();
		Cat harry = new Cat(10,
				20,
				true,
				1000,
				"Black");
		
		cat.meow();
		cat.scratch();
		
		System.out.println(harry.total);
		
		

	}
}
