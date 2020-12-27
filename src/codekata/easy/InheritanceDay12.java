package codekata.easy;

import java.util.*;

/**
 * You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.
Complete the Student class by writing the following:
A Student class constructor, which has  parameters:
A string, firstName
A string, lastName
An integer, idNumber
An integer array (or vector) of test scores, scores.
A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:
**/

class Person1 {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person1(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}
}

class Student extends Person1 {
	private int[] testScores;

	Student(String firstName, String lastName, int idNumber, int[] testScores) {
		super(firstName, lastName, idNumber);
		this.testScores = testScores;
	}

	char calculate() {
		int totalScore = 0;
		// int sum=0;

		for (int i = 0; i < testScores.length; i++) {
			totalScore = testScores[i] + totalScore;
		}

		totalScore = totalScore / testScores.length;

		if (totalScore >= 90 && totalScore <= 100) {
			return 'O';
		} else if (totalScore >= 80 && totalScore < 90) {
			return 'E';
		} else if (totalScore >= 70 && totalScore < 80) {
			return 'A';
		} else if (totalScore >= 55 && totalScore < 70) {
			return 'P';
		} else if (totalScore >= 40 && totalScore < 55) {
			return 'D';
		} else {
			return 'T';
		}

	}
}

public class InheritanceDay12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}