package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("숫자를 입력하세요\n숫자:");
	int a1 = sc.nextInt();
	if (a1/2==0) {
		System.out.println("짝수입니다.");
	}
	else if (a1/2==1) {
		System.out.println("짝수입니다.");
	}
	
//	System.out.println("숫자는 a1 입니다.");
	sc.close();
}	
}
