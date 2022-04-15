package com.javaex.practice02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		System.out.print("첫번째 숫자: ");
		Scanner num = new Scanner(System.in);
		int num1 = num.nextInt();		
		System.out.print("두번째 숫자: ");
		int num2 = num.nextInt();
		if ( num1 > num2) {
			System.out.printf("몫: %d\n나머지: %d", (num1/num2), (num1%num2));
		}else if (num2 > num1) {
			System.out.printf("몫: %d\n나머지: %d", (num2/num1), (num2%num1));
		}else {
			System.out.printf("몫: 1\n나머지: 0");
		}
		num.close();
	}

}
