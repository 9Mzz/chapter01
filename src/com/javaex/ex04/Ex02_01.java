package com.javaex.ex04;

import java.util.Scanner;

public class Ex02_01 {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	int dan=1;
	int i=1;

	while(dan<10) {
			i=1;
			System.out.print(dan+"단 시작 : ");
			
			while(i<10) {
			  System.out.print(dan + "*" + i + "=" + (dan*i) + "\t");
		      i++;
			}
			
			System.out.println();
			dan++;
}
	
	

	sc.close();
}
}
