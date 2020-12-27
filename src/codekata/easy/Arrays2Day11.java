package codekata.easy;

import java.util.Arrays;
import java.util.Scanner;
//Calculate the hourglass sum for every hourglass in a 6/6 array, then print the maximum hourglass sum.


public class Arrays2Day11 {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		scanner.close();
		
		int sum[] = new int[16]; //number of possible hourglasses in 6x6 array
		int hour = 0;
		//iterate thru the 6x6 array
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j < arr.length - 2; j++) {
				//formula to get the first hourglass, starting at arr[0,0]
				sum[hour] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
				//increment to check the next hourglass
				hour++;
			}
		}
		//sort the array low to high
		Arrays.sort(sum);
		//print the highest total sum
		System.out.print(sum[15]);
	}
}
