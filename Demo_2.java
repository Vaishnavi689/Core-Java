package Control_statement_Nested_If;

import java.util.Scanner;

public class Demo_2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age :");
	int age=sc.nextInt();
	System.out.println("Enter Marks:");
	int marks =sc.nextInt();
	System.out.println("Enter your cast (GEN/SC/ST/OBC):");
	String cast =sc.next();
	
	if(age>=18 && age<=25) {
		if(marks>60) {
			if(marks>=85) {
				System.out.println("Admission Grannted under merit seat..");
			}
			else if(marks>=60 && marks<85) {
				if(cast.equals("SC")|| cast.equals("ST")) {
					System.out.println("Admission Granted under reservation seat");
				}
				else {
					System.out.println("Admission granted under general seat...");
				}
				
			}
		}
		else {
			System.out.println("Admission Denied,marks less than 60");
		}
		
	}
	else {
		System.out.println("Admission Denied..Age must be greater than 18 and less than 25");
	}
	
	
}
}
