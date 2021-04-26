package Collection;

import java.util.HashSet;

public class Hash_Set {
	
	public static void main(String args[]) {
		
		//A HashSet is a collection of items where every item is unique, and it is found in the java.util package
		//HashSet allows null value. HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
		//HashSet is the best approach for search operations.
        
		
		HashSet<Integer> numbers = new HashSet<Integer>();
	    numbers.add(10);
	    numbers.add(2);
	    numbers.add(3);
	    numbers.add(5);
	    numbers.add(10);
	    System.out.println(numbers);
	    //In the example above, even though 10 is added twice it only appears once in the set because every item in a set has to be unique.
	  
	
	    for(int i = 1; i <= 10; i++) {
	        if(numbers.contains(i)) {
	          System.out.println(i + " was found in the set.");
	        } else {
	          System.out.println(i + " was not found in the set.");
	        }
	    }
	    
	    
	    //--------------
	                    
        HashSet<String> set = new HashSet<String>();  
        set.add("Ravi");  
        set.add("Vijay");  
        set.add("Arun");  
        set.add("Sumit");  
        System.out.println("An initial list of elements: "+set);  //[Vijay, Ravi, Arun, Sumit]
         
        //Removing specific element from HashSet  
        set.remove("Ravi");  
        System.out.println("After invoking remove(object) method: "+set); //[Vijay, Arun, Sumit] 
        
        HashSet<String> set1=new HashSet<String>();  
        set1.add("Ajay");  
        set1.add("Gaurav");  
        set.addAll(set1);  
        System.out.println("Updated List: "+set);  //[Vijay, Arun, Gaurav, Sumit, Ajay]
        
        //Removing all the new elements from HashSet  
        set.removeAll(set1);  
        System.out.println("After invoking removeAll() method: "+set); //[Vijay, Arun, Sumit] 
       
        //Removing elements on the basis of specified condition  
        set.removeIf(str->str.contains("Arun"));   
        System.out.println("After invoking removeIf() method: "+set); //[Vijay, Sumit] 
        
        //Removing all the elements available in the set  
        set.clear();  
        System.out.println("After invoking clear() method: "+set);  //[]
        

        
	}

}
