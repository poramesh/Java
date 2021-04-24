package String;

public class StringMethods {

	public static void main(String args[]) {
				
		String s="Sachin"+" Tendulkar";  
		String s1 = "Sachin";
		String s2=50+30+"Sachin"+40+40;  
		
	    //String concatenation : addition of strings.

		System.out.println(s); //Sachin Tendulkar  
		//The Java compiler transforms above code to this: String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString();  
		System.out.println(s1.concat("Tendulkar")); //SachinTendulkar
		System.out.println(s2);//80Sachin4040  
		
		//SubString: substring is a subset of another string
		
		System.out.println(s1.substring(0,3));//Sac
	    System.out.println(s.substring(7));//Tendulkar  
	    
	    //toUpperCase & toLowerCase
	    
	    System.out.println(s.toUpperCase());//SACHIN  
	    System.out.println(s.toLowerCase());//sachin  
	    System.out.println(s); //sachin(no change)
	    
	    //Replace method replaces all occurrence of first sequence of character with second sequence of chara
	    
	    String replaceString = s.replace("Sachin","Sachi");//replaces all occurrences of "Sachin" to "Sachi"
	    System.out.println(replaceString);

	    //valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into string.

	    int a=10;  
	    String str=String.valueOf(a);  
	    System.out.println(str+10);  
	    
	    //startsWith() and endsWith() method
	    
	    System.out.println(s.startsWith("Sa"));//true  
	    System.out.println(s.endsWith("r"));//true  
	    
	    //trim() method eliminates white spaces before and after string.

	    String strim="  Sachin  ";  
	    System.out.println(strim);//  Sachin    
	    System.out.println(strim.trim());//Sachin  
	    
	    //
		
	}
}
