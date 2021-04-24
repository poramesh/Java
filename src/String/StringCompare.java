package String;

public class StringCompare {
	
	public static void main(String args[]) {
		
		/*By equals() method : The String equals() method compares the original content of the string.
		It compares values of string for equality. String class provides two methods  equals and equalsignorecase */
		
		String str1 = "Hello";
		String str2 = "hello";
		String str3 = "Hello";
		String str4 = new String("Hello");
		String str5 = "hey";
		String str6 = "Dasdasfdsfdsfds";
		
		Boolean value = str1.equals(str2);		
		System.out.println(value); //false
		
		Boolean value1 = str1.equalsIgnoreCase(str2);
		System.out.println(value1); //true

		/* = = operator compares references not values. */
		
		Boolean value2 = (str1 == str2);
		System.out.println(value2); // false
		System.out.println(str1 == str3); //true
		System.out.println(str1 == str4); //false bc different refernce 
		
		
		/* The String compareTo() method compares values lexicographically and 
		 returns an integer value that describes if first string is less than,
		 equal to or greater than second string.

         Suppose s1 and s2 are two string variables. If:

          s1 == s2 :0
          s1 > s2 : negative value
          s1 < s2 : positive value */
		
		 System.out.println(str1.compareTo(str3));//0  
		 System.out.println(str1.compareTo(str5));//-32(because Hello > hello)  
		 System.out.println(str5.compareTo(str1));//32(because hello < Hello)
		 System.out.println(str1.compareTo(str6));
		 System.out.println(str6.compareTo(str1));
		
	}

}
