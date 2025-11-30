package Control_Statements_IF_else;

import java.util.Scanner;

public class Demo_2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number :");
	int num =sc.nextInt();
	
	if(num>0) {
		System.out.println("Number is Positive..");
	}
	else {
		System.out.println("Number is Negative");
	}
	if(num%2==0) {
		System.out.println("Number is Even & Divisible by 2");
	}
	else {
		System.out.println("Number is Odd");
	}
	
}
}
