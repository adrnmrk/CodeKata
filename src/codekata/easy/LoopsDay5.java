package codekata.easy;

import java.util.Scanner;
//Given an integer n, print its first 10 multiples. Each multiple n x 1 (where 1<=1 <=10) should be printed on a new line in the form: n x i = result.


public class LoopsDay5 {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
        for (int i=1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
        
        scanner.close();
    }

}
