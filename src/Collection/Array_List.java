package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Array_List {
	
	public static void main(String args[]) {
		
		//collection is used to store and manipulate group of objects. and it aloows us to perform
		//searching, sorting, insertion, manipulation, and deletion.
		
		//ArrayList implements list interface where it inhibits list type ds in which data aer stored in ordered collection of objects
		//and it can have dupicate values
		
		//ArrayList class maintains the insertion order and is non-synchronized. 
		//The elements stored in the ArrayList class can be randomly accessed
		
		/*List<String> list = new ArrayList<String>();
		list.add("A"); //inserting an element or we can add
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");*/
		
		//Intializing using arrays.asList 
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		/*Another way of adding elements to the list.
		ArrayList<String> list = new ArrayList<String>() {{
			add("A");add("B");add("C");add("D");add("E");
		}}; */
		
		
		//iterating through iterator
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//looping through for each 
		for(String li : list) {
			System.out.print(li); //ABCDE
		}
		
     ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));

     System.out.print("\n" + intlist);//5,5,5,5,5,5,5,5,5,5
		
	}

}
