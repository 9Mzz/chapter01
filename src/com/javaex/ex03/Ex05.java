package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("근무시간: ");
	int hour = sc.nextInt();
	int a1;
	
	if (hour>8) {
		a1 = (hour-8)*5000+hour*10000;
	}
	else {
		a1 = hour*10000;
	}
	
	System.out.println("임금은 "+a1+"입니다.");
	sc.close();	
	}
}
