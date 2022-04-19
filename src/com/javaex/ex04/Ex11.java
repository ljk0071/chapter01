package com.javaex.ex04;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		int sum,i ;
		sum=i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.[0]이면 종료");
//		do {
//			i = sc.nextInt();
//			sum += i;
//			System.out.printf("합계: %d\n", sum);
//		} while(i != 0);
		while(true) {
			i = sc.nextInt();
			sum += i;
			System.out.printf("합계: %d\n", sum);
			if ( i==0 ) {
				System.out.println("종료");
				break;
			}
		}
		sc.close();
	}

}
