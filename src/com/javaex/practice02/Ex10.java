package com.javaex.practice02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		System.out.print("사번(정수)를 입력해주세요\n사번: ");
		Scanner num = new Scanner(System.in);
		int cid = num.nextInt();
		if (cid%3 == 0 && cid > 0) {
			System.out.println("A팀 입니다.");
		}else if (cid%3 == 1 && cid > 0) {
			System.out.println("B팀 입니다.");
		}else if( cid%3 == 2 && cid > 0) {
			System.out.println("C팀 입니다.");
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		num.close();
	}

}
