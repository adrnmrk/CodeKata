package codekata.easy;

public class ConditionsDay3 {
	public static void main(String[] args) {

		int N = 22;

		firstSolution(N);
		secondSolution(N);
	}

	private static void firstSolution(int N) {
		if (N % 2 == 0) {
			if (N >= 2 && N <= 5)
				System.out.println("Not Weird");
			else if (N >= 6 && N <= 20)
				System.out.println("Weird");
			else if (N > 20)
				System.out.println("Not Weird");
		} else
			System.out.println("Weird");
	}
	
	private static void secondSolution(int N) {
		String str = "Weird";
		if ((N >= 2 && N <= 5) || (N > 20))
			str = "Not " + str;		
		
		System.out.println(str);
	}

}
