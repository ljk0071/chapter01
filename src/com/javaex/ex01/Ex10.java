package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 7;
		
		System.out.println("&& 연산자");
		System.out.println( true && true );
		System.out.println( true && false );
//		System.out.println( false && true );
//		System.out.println( false && false );
//		
//		System.out.println( true || true );
//		System.out.println( true || false );
		System.out.println( false || true );
		System.out.println( false || false );
		
		System.out.println("응용");
		System.out.println((a>b)&&(a<b));
		System.out.println((a>b)&&(a>b));
		
		System.out.println((a>b)||(a<b));
		System.out.println(a>b);
		System.out.println(!(a>b));
		
		System.out.println(a<b);
		System.out.println(!(a<b));
	}

}
