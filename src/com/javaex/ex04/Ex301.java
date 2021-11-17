package com.javaex.ex04;

import java.util.Scanner;

public class Ex301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int a1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int a2 = sc.nextInt();
		
		for (int n = a1; n<=a2; n++ ) {
			a1 = a1+n;
		}
			System.out.println("값은 : "+a1);
		
	    
		sc.close();
	}
}