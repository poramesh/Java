package VariableOperatorDataTypesKeywords;

public class Datatype {
	
	public static void main(String args[]) {
	
	
	/*Data types specify the different sizes and values that can be stored in the variable. There are two types of data types in Java:

       Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
       Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays..
       
    */
	/*
       The Boolean data type is used to store only two possible values: true and false.
       This data type is used for simple flags that track true/false conditions.

       The Boolean data type specifies one bit of information, but its "size" can't be defined precisely.
     */
	
		Boolean one = false;
		
		System.out.println(one);
		
	 /*	
	 The byte data type is an example of primitive data type. It is an 8-bit signed two's complement integer. 
	 Its value-range lies between -128 to 127 (inclusive). It's minimum value is -128 and maximum value is 127. Its default value is 0.	 
	 
	 The byte data type is used to save memory in large arrays where the memory savings is most required.
	 It saves space because a byte is 4 times smaller than an integer. It can also be used in place of "int" data type.
	 */
		
		byte a = 10; byte b = -20  ;
		
		System.out.println(a + " " + b);
		
	 /* 
	 The short data type is a 16-bit signed two's complement integer. Its value-range lies between -32,768 to 32,767 (inclusive).
	 Its minimum value is -32,768 and maximum value is 32,767. Its default value is 0.
	 
	 The short data type can also be used to save memory just like byte data type. A short data type is 2 times smaller than an integer.
	  */
		
		short s = 10000; short r = -5000;
		
		System.out.println(s+ " " + r);
		
	 /*
	  The int data type is a 32-bit signed two's complement integer. Its value-range lies between - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1)
	  (inclusive). Its minimum value is - 2,147,483,648and maximum value is 2,147,483,647. Its default value is 0.

      The int data type is generally used as a default data type for integral values unless if there is no problem about memory. 
	  */
		
		int a_int = 100000; int b_int = -200000;
		
		System.out.println(a_int + " " + b_int);

	  /*
	   The long data type is a 64-bit two's complement integer. Its value-range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)
	   (inclusive). Its minimum value is - 9,223,372,036,854,775,808and maximum value is 9,223,372,036,854,775,807. Its default value is 0.
	   The long data type is used when you need a range of values more than those provided by int.	 
	   */
		
		long a_long = 100000L, b_long = -200000L; 
		
		System.out.println(a_long + " "+ b_long);
		
		/*
		The float data type is a single-precision 32-bit IEEE 754 floating point.Its value range is unlimited.
		It is recommended to use a float (instead of double) if you need to save memory in large arrays of floating point numbers.
		The float data type should never be used for precise values, such as currency. Its default value is 0.0F.
		 */
		
		float f_float = 234.5f;

		System.out.println(f_float);
		
		/*
		The double data type is a double-precision 64-bit IEEE 754 floating point. Its value range is unlimited. 
		The double data type is generally used for decimal values just like float. 
		The double data type also should never be used for precise values, such as currency. Its default value is 0.0d.
		 */

		double d_double = 232.23232d;
		
		System.out.println(d_double);
		
		/*
		The char data type is a single 16-bit Unicode character. Its value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive).
		The char data type is used to store characters.
		 */
		
		char c_char = 'A';
		
		System.out.println(c_char);

	}

}
