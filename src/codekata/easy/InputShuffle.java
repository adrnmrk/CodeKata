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

		for (int i = 0; i < n; i++) {

			int arrItem = Integer.parseInt(arrItems[i]);
			int arrItem2 = Integer.parseInt(arrItems[n - 1]);
			arr[i] = arrItem;
			arr[n - 1] = arrItem2;
			//update arrVal, add values of arrItem and arrItem2
			arrVal = arrVal + arrItem + arrItem2;
			n--;
		}
		System.out.println(arrVal);
		scanner.close();
	}
	}


