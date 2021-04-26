package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inbuild_Array {
	
	
	public static void main(String args[]) {
		
		//The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified 
		//(if you want to add or remove elements to/from an array, you have to create a new one).
		//While elements can be added and removed from an ArrayList whenever you want.
		
		String[] array = {"Java","Python","PHP","C++"};  
		
		for(int i =0;i<array.length-1;i++) {
			System.out.println(array[i]);
		}
		System.out.println("Printing Array: "+ Arrays.toString(array)); 
		
		//converting string to arraylist
		List<String> list=new ArrayList<String>();  
		for(String lang : array){  
		list.add(lang);  
		}  
		
		System.out.println("Printing List: "+list);  

		 //Converting ArrayList to Array again
		 String[] array1 = list.toArray(new String[list.size()]);    
		 System.out.println("Printing Array: " + Arrays.toString(array1));  
		 System.out.println("Printing List: " + list);  
		 
	}
}
