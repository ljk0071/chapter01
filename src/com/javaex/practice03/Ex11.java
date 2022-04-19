package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int evenSum = 0;
		int oddSum = 0;
		for (int i=0; i<=a; i++) {
			if (i%2 == 0) {
				evenSum += i;
			}else if (i%2 != 0) {
				oddSum += i;
			}
		}
		if ( a%2 == 0) {
			System.out.printf("결과값: %d", evenSum);
	}else {
		System.out.printf("결과값: %d", oddSum);
		
	}
		sc.close();
	}
}
