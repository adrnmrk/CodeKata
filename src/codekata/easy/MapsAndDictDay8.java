package codekata.easy;
import java.util.*;
import java.io.*;

public class MapsAndDictDay8 {
	//Complete this code or write your own from scratch
	
	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        
	        Map<String, Integer> myMap;
	        myMap = new HashMap<String, Integer>();
	        
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            // Write code here
	            myMap.put(name, phone);
	            	            
	        }
	        while(in.hasNext()){
	            String s = in.next();
	            // Write code here
	            if (myMap.containsKey(s)) {
	            System.out.print(s + "=" + myMap.get(s));
	            
	            } else {
	            	System.out.println("Not Found");
	            }
	        } in.close();
	    
	}
}

