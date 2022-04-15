package com.javaex.practice02;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력해 주세요\n숫자: ");
		Scanner num = new Scanner(System.in);
		double n1 = num.nextDouble();
		if ( n1 > 0 ) {
			System.out.printf("계산결과는 %f 입니다.", 7*n1+2);
		}else {
			System.out.printf("계산결과는 %f 입니다.", ((n1*n1*n1)+(-9*n1)+2));
		}
		
		num.close();
	}
	

}
