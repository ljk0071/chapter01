package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요\n숫자: ");
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		if ( a > 0 ) {
			System.out.println("양수입니다");
		}
		if ( a < 0) {
			System.out.println("음수입니다.");
		} if ( a == 0 ) {
			System.out.println("0 입니다.");
		}
		num.close();
	}

}
