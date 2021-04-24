package String;

public class BasicString {
	
	public static void main(String args[]) {
		
		char ch[] = {'a','b','c','d','e','f'};	
		
		String str = new String(ch);
		
		for(int i=0; i<=str.length()-1; i++) {
		 System.out.print(str.charAt(i)) ;		
		}
		//or simply we can print the string in a line .,
		System.out.print("\n"+str);
		
		char[] chtostr = ch; // assigning the char array to another char array;
		
		System.out.print("\n" + String.valueOf(chtostr) + "\n"); //converting n printing from char to string.
			
		char ch1[] =str.toCharArray(); //converting the string to character array.
		
		//printing the char array by iterating each value through for each;
		for(char a : ch1) {
			System.out.print(a);
		}
		
		
		
	}

}
