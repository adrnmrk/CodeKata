package codekata.easy;

public class SimpleArraySum {
	public static void main(String[] args) {

	}

	static int simpleArraySum(int[] ar) {
		/*
		 * Write your code here.
		 */
		int sum = 0;

		for (int x = 0; x < ar.length; x++) {
			sum = ar[x] + sum;
		}
		return sum;

	}
}