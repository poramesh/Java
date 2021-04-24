package String;

public class StringBufferAndStringBuilder {

	public static void main(String args[]) {
		
		//StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
		//StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
		
		long startTime = System.currentTimeMillis();  
        StringBuffer sb = new StringBuffer("Java");  
        for (int i = 0; i < 10000; i++){  
            sb.append("Tpoint");  
        }  
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        
        startTime = System.currentTimeMillis();  
        StringBuilder sb2 = new StringBuilder("Java");  
        for (int i=0; i<10000; i++){  
            sb2.append("Tpoint");  
        }  
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
	}
}
