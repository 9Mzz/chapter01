package com.javaex.ex04;

public class Ex07 {
	public static void main(String[] args) {
		int x;
		int y;
		//////////////////////////////////////////////////////////
		for (y=1; y<=6; y++) {
			for(x=1; x<=y; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		//////////////////////////////////////////////////////////
		String star = "*";

		for ( y=1; y<=6; y++) {

			System.out.println(star);
			star = star + "*";
		}
		
		
	}	
}
