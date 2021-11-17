package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int dan =8;
		int i = 1;

		
		System.out.print("단을 입력해주세요. \n단: ");
		

	
		while (i<10) {
			int value = dan*i;
			System.out.println(dan + " * " + i +"=" + value);
			i++;
		}
		
		
		
		sc.close();
	}

}
