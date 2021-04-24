package String;

public class StringPool {

	public static void main(String args[]) {
		
		String str1 = "Hello world";  /*creates a string object and places it in a string pool  
		because it is not already present in the string pool and a reference is assigned to str1.*/
		
		String str2 = "Hello world";  /*Does not create string object in string pool as this "Java"
        literal already present there so it will return the reference. */
		
		String str3 = new String(str2); /*creates new object in heap and does not create new object
       in string pool as it already present there. */
		
		String str4 = new String("Hello world"); /*creates a new object in heap and does not create new object
		in string pool as it is already present there. */
		
		String str5 = str4; //returns the object reference of str4.
		
		String str6 = str1; //str6 would be pointing to the same string literal "Hello world" 
		
		System.out.println(str1==str2); //true 
		System.out.println(str1==str3); //false
		System.out.println(str2==str3.intern()); //true
		System.out.println(str4==str5); //true
		System.out.println(str6==str1); //true 
		System.out.println(str4==str5); //true because same object references;
		System.out.println(str3==str4); //false because different object reference;
		
	}
}
