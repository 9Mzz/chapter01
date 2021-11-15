package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("근무시간: ");
		int a1 = sc.nextInt();
		if(a1>8) {
			System.out.println("임금은 "+ ((a1-8)*2000+a1*10000) +"원 입니다.");
		}
		else if(a1<=8){
			System.out.println("임금은 "+a1*10000+"원 입니다.");
		}
		
	
	sc.close();
}	
}
