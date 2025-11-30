package Control_Statements_IF_else;

import java.util.Scanner;

public class Demo_1 {
public static void main(String[] args) {
	double Bankbalance=4000.0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter amount...");
	double amount= sc.nextDouble();
	if(amount<=Bankbalance) {
		Bankbalance-=amount;
		System.out.println("Remaining Balance is: "+Bankbalance);
		
	}
	else {
		System.err.println("Insufficient Balance..");
	}
	
}
}
