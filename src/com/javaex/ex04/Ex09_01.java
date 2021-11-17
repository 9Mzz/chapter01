package com.javaex.ex04;

import java.util.Scanner;

public class Ex09_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num;

		boolean action = true;
		
		while(action) {
		
			System.out.println("숫자를 입력하세요");
			 num=sc.nextInt();
			
			 if (num==0) {
				 System.out.println("종료");
				 action=false;
			 }
			 else if (num%3==0) {
				 System.out.println("3의 배수입니다");
			 }
			 else {
				 System.out.println("3의 배수가 아닙니다.");
			 }

		}
		sc.close();
	}
}
