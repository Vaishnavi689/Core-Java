package Control_statement_Nested_If;

import java.util.Scanner;

public class Demo_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age for Movie Ticket Booking:");
        int age = sc.nextInt();

        double ticketPrice = 300; // base ticket price
        double finalPrice;

        if (age > 18 && age < 60) 
        {
            System.out.println("You are eligible to watch a movie in the theater.");

            // 20% discount
            double discount = ticketPrice * 0.20;
            finalPrice = ticketPrice - discount;

            System.out.println("You got 20% discount.");
            System.out.println("Discount Amount: " + discount);
            System.out.println("Final Ticket Price: " + finalPrice);
        } 
        else if (age >= 60) 
        {
            System.out.println("You are eligible to watch a movie in the theater.");

            // 30% discount
            double discount = ticketPrice * 0.30;
            finalPrice = ticketPrice - discount;

            System.out.println("You got 30% Senior Citizen discount.");
            System.out.println("Discount Amount: " + discount);
            System.out.println("Final Ticket Price: " + finalPrice);
        } 
        else 
        {
            System.out.println("You are NOT eligible to watch a movie in the theater.");
            System.out.println("Minimum age required is 18.");
        }

        sc.close();
	}
}

