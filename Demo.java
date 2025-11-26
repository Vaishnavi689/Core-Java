package com.Datatype;

public class Demo {
	// Type of data called as data types
	// 2 types i.e -----> 1 Primitive and 2. Non primitive
	// Primitive Data Type: byte,short,int,long,float,double,char,boolean
	// Non-primitive: Class,Interface,Array,String,Enum

	public static void main(String[] args) {
		byte b = 100; // RAM-1byte storage (Range -127 - 128)
		System.out.println(b);
		short s = 30000; // 2Byte 32767- 32768
		System.out.println(s);
		int i = 1000000000; // 10 digit value store 4 byte
		System.out.println(i);
		long l = 500000000L; // upto 10 digit after number L is mendatory to write 8 byte data store
		System.out.println(l);
		float f = 400877.567f; // here is no limit to write number range before digit or after digit but writ f
		System.out.println(f);
								// at last is very imp
		double d = 346.09876; // in double not mendatory to write d at last
		System.out.println(d);

		char gender = 'V';
		System.out.println(gender);
		boolean ismarried = true; // required 1 bit value
		System.out.println(ismarried);

		// Rules to defined variables
		// 1. variable name should be start with character e.g int age
		// 2. variable name can not be contain space e.g int student marks wrong int
		// studentMarks -- correct
		// 3. variable name can contain $ (doller) and _ (underscore ) as a special
		// charactor only e.g int student_Mark , int _abc , int $abc
		// 4.variables can start from number we can used number in between at end but
		// not at starting
		// 5.class name 1st letter should be capital
		//6. Reserved Java keywords (e.g., int, class, if) cannot be used as variable names.
		//7.Case Sensitive: age and Age are treated as different variables.
		//8.Typically, use camelCase for variable names in Java (e.g., totalMarks).
		//9. we created all variables in main method i.e called local variable , local variable does not have any default value
		//10. Global variables declared inside class & its has specific default values
		//11. we cant directy access instance variable in main methods its required to create Object of that class
		//12. default value of char is single space
		//13. boolean having False as a default value
		//14. null is default value of String
		String name = "Vaishnavi"; // required 18 byte bzz every char required 2 byte
		System.out.println(name);
		// memory sized of non primitive data type not fixed
		
		
        
	}

}
