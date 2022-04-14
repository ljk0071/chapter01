package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2+3.5);
		
		
		double var01 = 2+3.5;
		System.out.println(var01);
		
		long var02 = 12345L;
		float var03 = 1.1F;
		
		System.out.println(var02 + var03);
		
		float result = var02 + var03;
		System.out.println(result);
		
///////////////////////////////////////////////////////////////////////
		//강제 형 변환
		
		float var04 = 1111.2345f;
		int var05 = (int)var04;
		System.out.println(var05);
		
		//축소변환 정상
		int v01 = 10;
		byte v02 = (byte)v01;
		System.out.println(v02);
		
		//축소변환 비정상
		int v03 = 103029770;
		byte v04 = (byte)v03;
		System.out.println(v04);
		
		//확대변환
		byte v05 = 10;
		int v06 = (int)v05;
		System.out.println(v06);
		
		//실수--->정수
		
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//정수--->실수
		
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v10);
		
	}

}
