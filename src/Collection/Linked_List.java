package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {

	public static void main(String args[]) {
		
		
		//The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.
        //The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface.
		//This means that you can add items, change items, remove items and clear the list in the same way.
		//However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.
		
		/*How the Arraylist works:: The ArrayList class has a regular array inside it. When an element is added, it is placed into the array.4
	    If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.*/

	    /* How the LinkedList works:: The LinkedList stores its items in "containers."
		  The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list,
		  the element is placed into a new container and that container is linked to one of the other containers in the list. */
		
		//ArrayList is better for storing and accessing data and LinkedList is better for manipulating data.
				
		
		LinkedList<String> list = new LinkedList<String>();  
        list.add("Ravi");  
        list.add("Vijay");  
        list.add("Ajay");  
        list.addFirst("Lokesh");  
        list.addLast("Harsh");  
        list.add(1, "handi"); 
        list.add("handi");
        
        System.out.print(list); //[Lokesh, handi, Ravi, Vijay, Ajay, Harsh, handi]

        list.removeFirstOccurrence("handi");
        list.removeLastOccurrence("handi");
        
        
        String a = list.getFirst();
        System.out.println(" \nthe first element in the array is: " + a); //Lokesh


        //Traversing the list of elements in reverse order  
        Iterator<String> i = list.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.print(i.next());  //harsh,ajay,vijay,tavi,lokesh
        }  
	}
	
}
