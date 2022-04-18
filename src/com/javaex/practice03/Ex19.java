package com.javaex.practice03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		int value = 0;
		int withdraw = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.print("----------------------------\n선택>");
			int a = sc.nextInt();
			if  ( a == 1) {
				System.out.print("예금액>");
				value = sc.nextInt();
			}else if ( a == 2 ) {
				System.out.print("출금액>");
				withdraw = sc.nextInt();
			}else if ( a == 3) {
				System.out.printf("잔고액>%d\n", value-withdraw);
			}else if ( a == 4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("다시입력해주세요");
			}
		}
		sc.close();
	}

}
