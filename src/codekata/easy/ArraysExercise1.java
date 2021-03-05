package codekata.easy;

import java.util.Scanner;

/**
 * Make an array that holds the textual values of the days of the week.
 * User input a number corresponding to the day of the week; week stats on monday
 * Output the string that represents the day of the week
 */
public class ArraysExercise1 {
	
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
			String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

			try {
				System.out.println("Enter a number from 1 to 7: ");
				int number = scanner.nextInt();
				scanner.close();

				System.out.println(daysOfWeek[number - 1]);
				}
			catch (Exception e){
				System.out.println("Invalid Input!");
			}

	    }

	}


