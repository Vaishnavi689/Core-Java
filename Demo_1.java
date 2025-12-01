package Control_statement_Nested_If;

import java.util.Scanner;

public class Demo_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter price of product: ");
		int productPrice=sc.nextInt();
		
		boolean isPrimeUser =false;
		
		if(productPrice>500) {
			if(isPrimeUser==true) {
				System.out.println("Extra 10% Discount");
				double discount=productPrice*0.10;
				System.out.println("Final amount to pay:"+(productPrice-discount));
			}else {	
				System.out.println("5% discount applied");
				double discount=productPrice*0.05;
				System.out.println("Final price to pay :"+(productPrice-discount));
			}
		}
		else {
			System.out.println("No discount available..");
		}
	}

}
