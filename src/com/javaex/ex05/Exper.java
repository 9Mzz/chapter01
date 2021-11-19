package com.javaex.ex05;

public class Exper {
	public static void main(String[] args) {
		
		int[] lefta = new int[] {10,20,30};
		int[] righta = new int[] {10,20,30};
		
		if (lefta.length == righta.length) {
			
			for(int i=0; i<lefta.length; i++) {
				if(lefta[i] == righta[i]) {
					System.out.println(i+"번째 배열이 다릅니다");
				}
			}
			
		}
 		
		else {
			System.out.println("배열의 크기가 다릅니다.");
		}
		
	}
}
