
public class RandomPhrase {
	
	//So an array is a mutable list, which means that the contents within can change 
	//The array itself is not mutable - so if we set the size of it to be 3 - it will always be 3 
	//Additionally they can only contain similar data types
	
	//BONUS: Try and make a grid using a multi dimesnion array
	
	public static void ranMessage() {
	
	String[] names =  {"Harry", "Gabreila", "Bavneet", "Damien "}; //new String[4];
						//to call an element from an array we need to call its index
						//indexs start from 0 
	String[] verbs = {"is running", "is feeling", "has created ", "has desroyed "};
	
	String[] pun = {"HEAT", "COLD", "RAGE", "COFFEE"};
	
	int randNames = (int)(Math.random() * names.length);
	
					//0.00 - 1 * 4 = Max Value = 4, Min Value = 0 - 1,2...
					// Remember Java always rounds down 1.9999999999 == 1 if rounded
	
	int randVerbs = (int)(Math.random() * verbs.length);
	int randPuns = (int)(Math.random() * pun.length);
	
	
	System.out.println(names[randNames] + verbs[randVerbs] + pun[randPuns]);
	
	}
	
	
}
