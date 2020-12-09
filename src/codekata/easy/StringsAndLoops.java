package codekata.easy;

import java.util.Scanner;

/**
 * 
 * @author AD, Day 6
 * 		Given a string S of length N that is indexed from 0 to N-1 , print
 *         its even-indexed and odd-indexed characters as 2 space-separated
 *         strings on a single line (see the Sample below for more detail).
 *         Example s = adbecf output: abc def
 *
 */
public class StringsAndLoops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < T; i++) {
			String s = scan.nextLine();
			// empty strings to store even values and odd values
			String evenVal = "", oddVal = "";
			// loop to traverse the string length
			for (int n = 0; n < s.length(); n++) {
				// check if n is odd or even
				if (n % 2 == 0) {
					//concatenate evenVal and character at even index
					evenVal = evenVal + s.charAt(n);
				} else
					//concatenate oddVal and character at odd index
					oddVal = oddVal + s.charAt(n);
			}
			// print concatenated evenVal values and oddVal values
			System.out.println(evenVal + " " + oddVal);

		}
		scan.close();

	}

}
