package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.14;
		double result01 = pi*5*5;
		System.out.println(result01);
		
		pi = 3.1415926;
		double result02 = pi*5*5;
		System.out.println(result02);
		
		// 상수는 대문자로, 변수는 소문자로
		final double PI = 3.14;
		double result03 = PI*5*5;
		System.out.println(result03);
		
//		// 상수의 값을 변경하려고 할 때
//		PI = 3.1415926; // PI가 상수로 선언되어 변경되지 않음
//		double result04 = PI*5*5;
//		System.out.println(result04);
	}

}
