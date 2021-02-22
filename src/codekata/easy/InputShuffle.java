package codekata.easy;

import java.util.Scanner;

/**
 * ask the user for 2 inputs, 1: length of int, 2: actual int
 * then shuffle the values by displaying the first value, then the last value, until the int is fully shuffled
 * For example: if int = 1234, display 1423
 */
public class InputShuffle {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		//create empty string arrVal to store array, outside the  loop
		String arrVal = "";

		String[] arrItems = scanner.nextLine().split("");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		//count from L to R
		int counterForward = 0;
		//count from R to L, using N as default value
		int counterBackward = n;

		for (int i = 0; i < n; i++) {
			//check if the index is EVEN, then increment
			if (i % 2 == 0){
				arrVal = arrVal + Integer.parseInt(arrItems[counterForward]);
				counterForward++;
			}
			//check if the index is ODD, then decrement
			else {
				arrVal = arrVal + Integer.parseInt(arrItems[counterBackward-1]);
				counterBackward--;
			}
		}
		System.out.println(arrVal);
		scanner.close();
	}
}




