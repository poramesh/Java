package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Array_List {
	
	public static void main(String args[]) {
		
		//collection is used to store and manipulate group of objects. and it aloows us to perform
		//searching, sorting, insertion, manipulation, and deletion.
		
		//ArrayList implements list interface where it inhibits list type ds in which data aer stored in ordered collection of objects
		//and it can have dupicate values. The ArrayList class is a resizable array
		
		//ArrayList class maintains the insertion order and is non-synchronized. 
		//The elements stored in the ArrayList class can be randomly accessed
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(23); //inserting an element or we can add
		num.add(22);
		num.add(40);
		num.add(4);
		num.add(1);
		
		//Intializing using arrays.asList 
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		System.out.println(list);
		
		/*Another way of adding elements to the list.
		ArrayList<String> list = new ArrayList<String>() {{
			add("A");add("B");add("C");add("D");add("E");
		}}; */
		
		
		//iterating through iterator
		Iterator<Integer> itr = num.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//looping through for each 
		for(String li : list) {
			System.out.print(li); //ABCDE
		}
		
		//Collections.ncopies method can be used when we need to initialize the ArrayList with the same value for all of its elements. 
		ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));
        System.out.println("\n" + intlist);//5,5,5,5,5,5,5,5,5,5
        
        //to access an item we use get() method
        System.out.println(list.get(0)); //A
        
        //to modify an item we use set(index, item)
        list.set(0, "a");
        System.out.println(list);//a,B,C,D,E
    
        //To remove an element, we use the remove() method and refer to the index number:
        //list.remove(1);
        //list.remove("B");
        list.removeIf(str -> str.contains("B"));//using lamba exp
        System.out.println(list);// [a, C, D, E]

        
        //list.add(0,"A")
        list.add(0,"P");
        System.out.println(list);
        
        //To find out how many elements an ArrayList have, use the size method:
        System.out.println(list.size());
        
        //Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run
        for(int i =0;i<list.size();i++) {
        	System.out.print(list.get(i));
        }

        //sort() method for sorting lists alphabetically or numerically:
        Collections.sort(list);
        System.out.println("\n" + list);//B,C,D,E,P
        Collections.sort(num);
        System.out.println(num);//1,4,22,23,40
        
        //AddAll()
       /* list.addAll(list);
        System.out.println(list);
        
        list.addAll(2, list);   //[B, C, D, E, P, B, C, D, E, P]
        System.out.println(list); // [B, C, B, C, D, E, P, D, E, P] */
        
        
        //Traversing list through forEach() method:
        list.forEach(a->{ //Here, we are using lambda expression  
            System.out.print(a);  
          });  
        
        System.out.println();
        //Here, element iterates in reverse order  
        ListIterator<String> list1 = list.listIterator(list.size());  
        while(list1.hasPrevious())  
        {  
            String str=list1.previous();  
            System.out.print(str);  
        }  

	}

}
