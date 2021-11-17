package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("단을 입력해주세요. \n단: ");
		int dan = sc.nextInt();

		for ( int i=1; i<10; i++ ) {
			int value = dan*i;
			System.out.println(dan+"*"+i+"="+value);
		}
		sc.close();
	}	
}
