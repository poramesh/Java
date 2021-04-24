package String;

public class StringIsImmutable {
	
	public static void main(String args[]) {
		
		/*String is imuutable bc java uses the concept of string literal.Suppose there are 5 reference variables,
		all referes to one object "sachin".If one reference variable changes the value of the object, 
		it will be affected to all the reference variables. That is why string objects are immutable in java*/
		
		String str = "Hello";
		
		str.concat("world");
		
		System.out.println(str); //prints Hello 
		
		System.out.println(str.concat("world")); //prints Helloworld
		
		String str1 =  str.concat(" world"); //explicitly assigned to a variable
		
		System.out.println(str1); //prints Hello world 
			
	}

}
