package VariableOperatorDataTypesKeywords;

public class operator {
	
	public static void main(String args[]) {
		
		//Operator in Java is a symbol that is used to perform operations. For example: +, -, *, / etc.
		
		/* unary operator, arithmetic operator, shift operator, relational operator, bitwise operator
		 * logical operator, ternary operator & assignment operator.
		 */
		
		//unary : postfix(exp++, exp--) and prefix(++exp. --exp, +exp, -exp, ~exp, !exp)
		//Arithmetic : multiplicative (*,/,%) , additive (+,-)
		//Shift : <<,>>,>>>
		//Relational : comparison (<,>,<=,>=, instanceOf), equality (==,!=)
		//Bitwise : AND (&), exclusive OR(^), inclusive OR(|)
		//Logical : AND (&&), OR(||)
		//Ternary : ternary (? :)
		//Assignment : =,+=,-=,*=,/=,%=,&=,^=,|=,<<=,>>=,>>>=
		
		
		/*
		 The Java unary operators require only one operand. Unary operators are used to perform various operations i.e.
         incrementing/decrementing a value by one
         negating an expression
         inverting the value of a boolean
		 */
		
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		
		int a=10;  
		int b=10;  
		System.out.println(a++ + ++a);//10+12=22  
		System.out.println(b++ + b++);//10+11=21  
		
		int a1=18;  
		int b1=-19;  
		boolean c=true;  
		boolean d=false;  
		System.out.println(~a1);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b1);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!c);//false (opposite of boolean value)  
		System.out.println(!d);//true
		
	}

}
