package Exception_Handling;

public class FinallyBlock {
	public static void main(String args[]){  
		
		
		/* Java finally block is a block that is used to execute important code such as closing connection, stream etc.
        Java finally block is always executed whether exception is handled or not.
        Java finally block follows try or catch block.
        */


		  try{  
		   int data=25/5;  
		   System.out.println(data);  
		  }  
		  catch(NullPointerException e){System.out.println(e);}  
		  finally{System.out.println("finally block is always executed");}  
		  System.out.println("rest of the code...");  
		  } 

	    //Rule: For each try block there can be zero or more catch blocks, but only one finally block.
	
	    //Note:  The finally block will not be executed if program exits(either by calling System.exit() or by causing a fatal error that causes the process to abort).
}
