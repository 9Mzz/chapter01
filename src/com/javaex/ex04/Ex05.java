package com.javaex.ex04;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dan;
		int b1;

		for (dan = 1;  dan<=9; dan++ ) {
			for (b1 = 1; b1<=9; b1++) {
			int value = dan*b1;
			System.out.println( dan+"단 시작 : " + dan + "*" + b1 + "=" +value+"\t" );
			}
		}
		
		
		
		sc.close();
	}
}
