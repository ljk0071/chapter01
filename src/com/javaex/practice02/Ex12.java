package com.javaex.practice02;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		System.out.print("출력되는 내용을 입력하세요\n기호: ");
		Scanner sc = new Scanner(System.in);
		String mark = sc.next();
		System.out.print("숫자1: ");
		double n1 = sc.nextDouble();
		System.out.print("숫자2: ");
		double n2 = sc.nextDouble();
		switch ( mark ) {
		case "+" :
			System.out.printf("결과는: %f", (n1 + n2));
			break;
		case "-" :
			System.out.printf("결과는: %f", (n1-n2));
			break;
		case "*" :
			System.out.printf("결과는: %f", (n1*n2));
			break;
		case "/" :
			if ( n2 != 0) {
				System.out.printf("결과는: %f", (n1 / n2));
				break;
			}else {
				System.out.println("계산할 수 없습니다.");
			}
		default :
			System.out.println("계산할 수 없는 기호입니다.");
		}
		sc.close();
	}

}
