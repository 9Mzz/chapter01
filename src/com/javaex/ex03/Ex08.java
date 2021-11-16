package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("숫자를 입력하세요\n숫자:");
	int number=sc.nextInt();
	int a1;
	int a2;
	int a3;
	int a4;
	if (number>0) {
		if (number%2==0) {
			System.out.println("짝수입니다.");
		}
		else if (number%2==1) {
			System.out.println("홀수입니다.");
		}
		else if (number%5==0) {
			System.out.println("5의 배수입니다");
		}
	}
	else if (number<0) {
		System.out.println("음수입니다.");
	}
	else {
		System.out.println("0입니다.");
	}
	
	
//	System.out.println("숫자는 a1 입니다.");
	sc.close();
}	
}
