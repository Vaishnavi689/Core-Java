package com.Looping_Statement_ForLoop;

// sum of all even numbers from 1 to 100
public class Demo_for_4 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}

		}
		System.out.println(sum);
	}

}
