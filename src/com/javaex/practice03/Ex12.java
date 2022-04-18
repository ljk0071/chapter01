package com.javaex.practice03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int factorial = 1;
		for (int i=a;i>=1;i--) {
			factorial *= i; 
		}
		System.out.printf("결과값: %d", factorial);
		sc.close();
	}

}
