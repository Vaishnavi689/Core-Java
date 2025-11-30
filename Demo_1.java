package com.Control_Statements_If;

import java.util.Scanner;

public class Demo_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age...");
		int age = sc.nextInt();
		if (age<18) {
			System.out.println("You are child..");
		}
		if (age>=18 && age<40) {
			System.out.println("You are Young...");
			
		}
		if (age>=40 && age<=60) {
			System.out.println("You are Old...");
			
		}
		if(age>60) {
			System.out.println("You are citizenship..");
			
		}
		
		String name="Vaishnavi";
		System.out.println("Length of Name:"+name.length()); // Method to check the length of string
		
		String name1="Pooja";
		String name2="Vaishnavi";
		System.out.println("Comparison :"+ name.equals(name1));
		System.out.println("Compare name & name2:"+name.equals(name2));
	}
	
	

}
