package codekata.easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayDay7 {
	
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[n];
	        //create empty string arrVal to store array, outside the  loop
	        String arrVal = "";
	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	            //update arrVal, add value from right to left to reverse the order
	            arrVal = arrItem + " " + arrVal;
	            
	        }
	        System.out.println(arrVal);

	        scanner.close();
	    }
	}


