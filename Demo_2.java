package com.Control_Statements_If;

import java.util.Scanner;

public class Demo_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();  // reads full name

        if (name.length() < 3) {
            System.out.println("Name should be at least 3 characters!");
        } else {
            System.out.println("Valid name: " + name);
        }

        sc.close();
	}

}
