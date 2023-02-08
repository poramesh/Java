package VariableOperatorDataTypesKeywords;

public class Variables {
	
	static int m = 100; //static variable
	
	void methid() {
		int n =90; //local variable 
	}
	
	public static void main(String args[]) {
		
		/*A variable is a container which holds the value while the Java program is executed. A variable is assigned with a data type.

           Variable is a name of memory location. There are three types of variables in java: local, instance and static.

               There are two types of data types in Java: primitive and non-primitive.
               
        */     
		
		/*A variable declared inside the body of the method is called local variable. You can use this variable only within
		 *  that method and the other methods in the class aren't even aware that the variable exists.
            A local variable cannot be defined with "static" keyword.
            */
		/* A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as static.
            It is called an instance variable because its value is instance-specific and is not shared among instances.
		    */
		/*A variable that is declared as static is called a static variable. It cannot be local. You can create a 
		 * single copy of the static variable and share it among all the instances of the class. 
		 * Memory allocation for static variables happens only once when the class is loaded in the memory.
		 */
		
		
		
		int data = 50; //instance varibale 
		int a=10, b=20;
		int c= a+b;
		System.out.println(c); //adding two numbers =30
		
		float f = c;
		
		System.out.println(f); // widening = 30.0 
		
		float x = 151.4f;
		
		//int c = x; //compile time error
		
		int y = (int)x; //narrowing or typecasting
		
		
		byte z = (byte)y; //Java Variable Example: Overflow
		
		System.out.println(y + " " + " " + z); //151 -105
		
		byte z1 =15;
		byte z2 = 11;
		
		//byte xyz = z1+z2;  //compile error - because a+b = 20 will be int. 
		
		byte xyz = (byte)(z1+z2);
		
		System.out.println(xyz);
		
		
		
		
	}

}
