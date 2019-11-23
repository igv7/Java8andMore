package javaStringVsStringBufferVsStringBuilder;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

//StringBuilder is not Thread Safe
//Why StringBuilder is not Thread Safe
public class Test3 {

	static StringBuilder sb1 = new StringBuilder();
	static StringBuffer sb2 = new StringBuffer();
	static final String orderedCollection = "abcdefghijklmnopqrstuvwxyz";
	 
	public static void main(String[] args) {
	    Runnable r = () -> {
	    	
	    	for (char c : orderedCollection.toCharArray()) {
				sb1.append(c);
				sb2.append(c);
			}
	        
	    };
	    
	    Thread t[] = new Thread[25];
	    
	    for (int i = 0; i < t.length; i++) {
	        t[i] = new Thread(r);
	        t[i].start();
	    }
	    for (int i = 0; i < t.length; i++) {
	        try {
	            t[i].join();
	        } catch (InterruptedException ex) {
	            Logger.getLogger(Test3.class.getName())
	            	  .log(Level.SEVERE, null, ex);
	        }
	    }
	    System.out.println(sb1);
	    System.out.println(sb1.length());
	    System.out.println(sb2);
	    System.out.println(sb2.length());
	}

}