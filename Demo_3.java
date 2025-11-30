package com.Control_Statements_If;

import java.util.Scanner;

public class Demo_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name:");
		String name=sc.next();
		if(name.length()<3) {
			System.err.println("Name should be atleast greater than 3 Character.."); // err used to get output in red colour
		}
		System.out.println("Your Name is :"+name);
		System.out.println("Enter your Password:");
		String password=sc.next();
		if(password.length()<3) {
			System.err.println("Password should be atleast 3 number..");
		}
		System.out.println("Your password is:"+password);
			}

}
