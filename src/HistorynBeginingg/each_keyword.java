package HistorynBeginingg;

public class each_keyword {
	
	public static void main(String args[]) {
		
		//When we compile Java program using javac tool, the Java compiler converts the source code into byte code.
		//here, each_keyword.java program is converted to each_keyword.class
		
		/* CLASS keyword is used to declare a class in java.
		 * PUBLIC is an access modifier that represents visibility. it means it is visible to all.
		 * STATIC is a keyword, if we declare any method as static, it is known as static method. The core advantage of the static method
		 * is that there is no need to create an object to invoke the static method. the main() method is executed by the jvm. 
		 * so it doesnt require creating an object to invoke the main() method. so it saves memory. 
		 * VOID is the return type of the method. it means it doenst return value. 
		 * MAIN represents the starting point of the program.
		 * String[] args or String args[] is used for command line argument.
		 * The java command-line argument is an argument i.e. passed at the time of running the java program.
		 * 
		 * In this example, we are receiving only one argument and printing it. To run this java program, you must pass at least one argument from the command prompt.
           class CommandLineExample{  
           public static void main(String args[]){  
           System.out.println("Your first argument is: "+args[0]);  
           }  
           }  
           compile by > javac CommandLineExample.java  
           run by > java CommandLineExample sonoo  
		   Output: Your first argument is: sonoo

		 */	
		
		
			for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);    
			}
		  /* System.out.println() is used to print statement. Here, System is a class, out is an object of the PrintStream class, 
		   * println() is a method of the PrintStream class.	
		   */
			
		/* At compile time, the Java file is compiled by Java Compiler (It does not interact with OS) and converts the Java code into bytecode.
		 * 	
		 * At run time, following steps are performed: class file -> class loader -> Bytecode verified -> interpreter -> runtime -> hardware..
		 * 
		 * Classloader - it is the subsystem of jvm that is used to load class files.
		 * bytecode verifier - it checks the code fragments for illegal code that can violate access rights to objects.
		 * interpreter - read bytecode stream then execute the instructions. 
		 */
			
			/* a class can have multiple classes, 
			 * class a{} class b{} class c{} .. and this can be saved as class d.java, during compile time it will be saved as a.class, b.class, c.class
			 */
	}
}
	