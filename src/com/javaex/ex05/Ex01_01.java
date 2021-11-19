package com.javaex.ex05;

public class Ex01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ball[] = new int[7];
		
		for (int i=0; i<7; i++) {
			ball[i] = ((int)(Math.random()*45))+1;
		}
		for (int i=0; i<4; i++) {
			System.out.println(ball[i]);
		}
		
		
		
	}

}
