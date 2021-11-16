package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택하세요.\t (1. 자바 2. C++ 4. 파이썬)\t 과목번호: ");
		int code = sc.nextInt();

		switch(code) {
		case 1: 
			System.out.println("101호입니다");
			break;
		case 2:
			System.out.println("202호입니다");
			break;
		case 3:
			System.out.println("303호입니다");
			break;
		case 4:
			System.out.println("401호입니다");
			break;
		default:
			System.out.println("상담원");
			break;
		}
		sc.close();
	}
}
