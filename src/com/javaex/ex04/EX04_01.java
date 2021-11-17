package com.javaex.ex04;

import java.util.Scanner;

public class EX04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			int a1;
			int a2;
			System.out.println("숫자를 입력해주세요.");
			a1 = sc.nextInt();
			System.out.println("숫자를 입력해주세요.");
			a2 = sc.nextInt();

			for( int n = a1; n<=a2; n++) {
				a1 = a1+n;
				System.out.println(a2+"까지 합은 "+a1);
			}
				
				
				
		
		sc.close();		
	}

}
