package com.javaex.helloworld;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("당신의 이름은 무엇인가요?");
		String a = sc.nextLine();
		

		sc.close();
	}

}
