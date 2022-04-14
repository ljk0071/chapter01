package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//대입연산자
		
		int a = 7;
		int b = 2;
		
		System.out.println("산술연산자");
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println(a/b);
		System.out.println(a%b);
		
		
		System.out.println("산술 연산자 / % 자세히");
		System.out.println("==========");
		System.out.println(7/2);
		System.out.println(7.0/2.0);
		System.out.println(7%2);
		System.out.println(7.0%2.0);
		System.out.println("==========");
		
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		System.out.println(pVar);
		System.out.println(mVar);
		
		//증감 연산자
		System.out.println("증감연산자");
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b);

		
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
	}

}
