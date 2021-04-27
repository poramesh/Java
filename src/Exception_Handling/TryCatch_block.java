package Exception_Handling;

public class TryCatch_block {
	
	public static void main(String args[]) {
		
		//Java try block is used to enclose the code that might throw an exception. It must be used within the method.
        
		//If an exception occurs at the particular statement of try block, the rest of the block code will not execute. 
        //So, it is recommended not to keeping the code in try block that will not throw an exception.

        //Java try block must be followed by either catch or finally block.
		
		/*Java catch block is used to handle the Exception by declaring the type of exception within the parameter. 
		 * The declared exception must be the parent class exception ( i.e., Exception) or the generated exception type. 
		 * However, the good approach is to declare the generated type of exception.
		 */
		//if the exception is handled then the rest of vofe will be executed or esle jvm will print the excpetion message and termintaed the program.
		
		
		      try  
	          {  
	           int arr[]= {1,3,5,7};  
	            System.out.println(arr[10]); //may throw exception   
	          }  
	            // handling the array exception  
	           catch(ArrayIndexOutOfBoundsException e)  
	           {  
	             System.out.println(e);  
	           }  
	          
		      System.out.println("rest of the code (1)");  
		
		        try  
		        {  
		        int data=50/0; //may throw exception   
		  
		        }  
		            // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException  
		        catch(ArrayIndexOutOfBoundsException e)  
		        {  
		            System.out.println(e);  
		        }  
		        System.out.println("rest of the code(2)");  //will not be printed bc the execption is handled for diff exception class
		        
		      
	}

}
