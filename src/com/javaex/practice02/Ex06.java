package com.javaex.practice02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		System.out.print("숫자 2개를 입력해 주세요\n숫자1: ");
		Scanner num  = new Scanner(System.in);
		int num1 = num.nextInt();
		System.out.print("숫자2: ");
		int num2 = num.nextInt();
		if (num1 > num2) {
			System.out.printf("큰 수: %d \t 작은 수: %d", num1, num2);
		}else if (num2 > num1) {
			System.out.printf("큰 수: %d \t 작은 수: %d", num2, num1);
		}else {
			System.out.printf("큰 수: %d \t 작은 수: %d", num2, num1);
		}
		num.close();
		
		
	}

}
