package codekata.easy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//given a base-10 integer, convert it to binary and count the maximum number of consecutive 1s in the binary form.
public class BinaryDay10 {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String toBinary = Integer.toBinaryString(n);
		int oneCounter = 0;
		int largest = 0;

		for (int i = 0; i < toBinary.length(); i++) {

			if (toBinary.charAt(i) == '1') {
				oneCounter = oneCounter + 1;
			} else {
				oneCounter = 0;
			}
			if (largest < oneCounter) {
				largest = oneCounter;
			}
		}
		System.out.println(largest);

		scanner.close();
	}

}
