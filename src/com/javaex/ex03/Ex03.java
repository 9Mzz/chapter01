package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자를 입력하세요");
	System.out.print("숫자: ");
	int a1 = sc.nextInt();
	
	if(a1>0) {
		//12
		System.out.println("양수");
	}
		// -5, 0
	else if(a1<0) {
		System.out.println("음수");
	}
	else {
		System.out.println("0");
	}
	
		
	sc.close();	
	}
}
