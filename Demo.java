package Control_statement_Nested_If;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks: ");
		int marks = sc.nextInt();
		if (marks >= 35) // outer IF
		{
			if (marks >= 75) {
				System.out.println("Distinction");

			} else if (marks < 75 && marks >= 60) {

				System.out.println("First Class");
			} else {
				System.out.println("Pass");
			}
		} else {
			System.out.println("Fail");
		}
	}

}
