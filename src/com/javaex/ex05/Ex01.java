package com.javaex.ex05;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int n01 = ((int)(Math.random()*45))+1;
		int n02 = ((int)(Math.random()*45))+1;
		int n03 = ((int)(Math.random()*45))+1;
		int n04 = ((int)(Math.random()*45))+1;
		int n05 = ((int)(Math.random()*45))+1;
		int n06 = ((int)(Math.random()*45))+1;
		int n07 = ((int)(Math.random()*45))+1;
		
		System.out.println(n01);
		System.out.println(n02);
		System.out.println(n03);
		System.out.println(n04);
		System.out.println(n05);
		System.out.println(n06);
		System.out.println(n07);
		
		System.out.println("======================================");

		int ball[] = new int[6];
		
		for ( int i=0; i<6; i++) {
			ball[i] = ((int)(Math.random()*45))+1;
		}
		
		for(int i=0; i<6; i++) {
			System.out.println(ball[i]);
		}
		
		System.out.println("=====================================");
		
		int a1[] = new int[8];
		for ( int b=0; b<8; b++) {
			a1[b] = ((int)(Math.random()*50))+1;
		}

		for (int c=0; c<8; c++) {
			
			System.out.println(a1[c]);
		}
		
				
	}
		
}

