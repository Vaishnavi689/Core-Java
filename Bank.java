package Control_statement_Nested_If;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double balance = 10000.00;
		System.out.println("Enter amount for withdraw :");
		int amount = sc.nextInt();

		if (amount > 0) {

			if (amount <= balance) {
				if (amount % 100 == 0) {
					balance -= amount;
					System.out.println("Withdraw success..");
				}
				else {
					System.out.println("Enter amount in multiple of 100");
				}

			} else {
				System.out.println("Insufficient Balance..");
			}
		} else {
			System.out.println("Invalid Amount..");
		}
	}

}
