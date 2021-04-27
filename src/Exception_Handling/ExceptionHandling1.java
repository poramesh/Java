package Exception_Handling;

public class ExceptionHandling1 {
	
	public static void main(String args[]) {
		
	
		//The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that normal flow of the application can be maintained.
		//Dictionary Meaning: Exception is an abnormal condition.
		//Let's say there are 10 statements to be executed and there occurs a problem at line 6 then the further statements will not be executed so 
		//to handle that we use execption handling.
		
		try{  
		      //code that may raise exception  
		      int data = 100/0;  
		      
		      System.out.print(data); //will not be printed
		      
		   }catch(ArithmeticException e){
			   System.out.println(e);
			   }  
		   
		//rest code of the program   
		   System.out.println("rest of the code...");  

		   
		  //Some scenarios where unchecked exceptions could occur.,  
		 /* int a=50/0;//ArithmeticException
		  * 
		    String s=null;  
            System.out.println(s.length());//NullPointerException  
            
            String s="abc";  
            int i=Integer.parseInt(s);//NumberFormatException 
            
            int a[]=new int[5];  
            a[10]=50; //ArrayIndexOutOfBoundsException   

		  */


		
	}

}
