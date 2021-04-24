package String;

public class StringMethods {

	public static void main(String args[]) {
		
		//String concatenation
		
		String s="Sachin"+" Tendulkar";  
		String s1 = "Sachin";
		String s2=50+30+"Sachin"+40+40;  

		System.out.println(s); //Sachin Tendulkar  
		//The Java compiler transforms above code to this: String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString();  
		System.out.println(s1.concat("Tendulkar")); //SachinTendulkar
		System.out.println(s2);//80Sachin4040  
		
		
		
	}
}
