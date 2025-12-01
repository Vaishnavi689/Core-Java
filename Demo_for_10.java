package com.Looping_Statement_ForLoop;

public class Demo_for_10 {
	public static void main(String[] args) {
		for(int i=1,j=1;j<=10;i++) {
			System.out.println(j);
			// here get infinite loop because we not increment to j++ 
			
		}
	}

}
