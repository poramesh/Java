package Collection;

import java.util.HashMap;

public class Hash_map {
	
	public static void main(String args[]) {
		//A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type
		//One object is used as a key (index) to another object (value). It can store different types: 
		//String keys and Integer values, or the same type, like: String keys and String values
		
		// Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	   //To access a value in the HashMap, use the get() method and refer to its key:
	   // System.out.print(capitalCities.get("England")); //London
	    
	   //To remove an item, use the remove() method and refer to the key:
       //capitalCities.remove("England");
		
       //Use the keySet() method if you only want the keys, and use the values() method if you only want the values:
       for(String c : capitalCities.keySet()) {
    	   System.out.println(c); //USA, NORWAY, ENGLAND, GERMANY
       }
       
       // Print values
       for (String i : capitalCities.values()) {
    	   System.out.print(i); //Washington DC Oslo London Berlin
    	 }
       
       System.out.print("\n");
       //print both keys and value
       for (String i : capitalCities.keySet()) {
    	      System.out.println("key: " + i + " value: " + capitalCities.get(i));
    	    }

       
       
	}

}
