package com.javaex.ex05;

public class Ex03 {
	public static void main(String[] args) {
		//만들어진걸 메모리로 올린다 = new
		
		int[] intArray = new int[3];

		
		intArray[0] = 3;
		intArray[1] = 73;
		intArray[2] = 13;
		
		for (int i=0; i<3; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("=============================");
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		
		System.out.println("================================");

		int[] intb = new int[]{3,73,13}; 
		
		for (int o=0; o<intb.length; o++) {
			System.out.println(intb[o]);
		}
//		--> int intArray[] = new int[], 0,1,2와 같다.

		

//		System.out.println("==================");
//		char[] charArray = new char[3];
//		
//		charArray[0] ='안';
//		charArray[1] ='한';
//		charArray[2] ='z';
//		
//		for (int i=0; i<3; i++) {
//			System.out.println(charArray[i]);
//			
//		}
		
		//new라 해야 메모리가 잡힌다.

		
		
		
	}
}
