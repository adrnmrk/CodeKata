package codekata.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//Data Types Day 1
public class DataTypes {

	public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

            String a = scan.nextLine();
            int x = Integer.parseInt(a);
            
            String b = scan.nextLine();
            Double y = Double.parseDouble(b);
            
            String z = scan.nextLine();
            
            int sumInt = x + i;
            double sumDouble = d + y;
            /* Read and save an integer, double, and String to your variables.*/
            // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
            
            /* Print the sum of both integer variables on a new line. */
            System.out.println("sum of int: " + sumInt);
            /* Print the sum of the double variables on a new line. */
            System.out.println("sum of doubles: " + sumDouble);
            /* Concatenate and print the String variables on a new line; 
                the 's' variable above should be printed first. */
            System.out.println(s + z);
        scan.close();
    }
	    
}
