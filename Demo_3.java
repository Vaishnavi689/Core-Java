package Control_Statements_IF_else;

import java.util.Scanner;

public class Demo_3 {
	public static void main(String[] args) {
		//int n = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n= sc.nextInt();
        if (n > 5) {
            System.out.println("The number is greater than 5.");
        } else {
            System.out.println("The number is 5 or less.");
        }
	}

}
