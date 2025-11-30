package Control_Statements_IF_else;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Name:");
	String name= sc.next();
	if(name.length()<3) {
		System.err.println("You need atleast above 3 character letter");
		}
	else {
		System.out.println("Your  Name is:"+name);
	}
	System.out.println("Enter Your Password :");
	String password=sc.next();
	if(password.length()<3) {
		System.err.println("You need atleast 3 char length of password...");	
	}
	else {
		System.out.println("Your Password is:"+password);
	}
	if(name.equals("Ram")&& password.equals("1212")) {
		System.out.println("Login Sucess..");
		
	}
	else {
		System.out.println("Login False..");
	}
	
	
}
}
