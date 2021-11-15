package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("근무시간: ");
	int a1 = sc.nextInt();
	int b1 = a1*10000;
	
	if (a1<=8) {
		System.out.println("임금은 "+ b1 +"원 입니다.");
	}
	else if (a1>8) {
		System.out.println("임금은 "+((a1-8)*5000 +b1)+"원 입니다." );
	}
	
	sc.close();	
	}
}
