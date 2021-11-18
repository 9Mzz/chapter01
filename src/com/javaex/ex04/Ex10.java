package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=20; i++) {
		
			//2의 배수 이면서 3의 배수이냐?? --> 6인가?
			if ( i%2==0 && i%3==0 ) {
				continue;
			}
			
			System.out.println( i );
		}
		
		
		
		
		
	}
}
