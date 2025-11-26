package com.TypeCasting;

public class Demo {
	public static void main(String[] args) {
		// Convert one data type into another data type is called typecasting
		// Implicit:
		// Convert smaller data type into larger data type is called
		// byte--short---int---long---flooat---double
		// compiler will responsible for implicit type casting
		// there is no any data loss in implicit

		byte b = 100;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		System.out.println("Short value of b" + s); // the value of b goes to s that means b is not byte at its short
													// i.e reassign
		System.out.println("int value of s" + i);
		System.out.println(d);

		// Explicit: convert large data type into smaller
		// double--float--long--int--short---byte
		// developer will perform explicit type casting as per requirements
		// there is more chances to loss data
		double salary = 5500.45;
		float f1 = (float) salary;
		long l1 = (long) f;
		int i1 = (int) l1;
		short s1 =(short)i1;
		System.out.println("F1 :" + f1);
		System.out.println("l1 :" + l1);
		System.out.println(i1);

	}

}
