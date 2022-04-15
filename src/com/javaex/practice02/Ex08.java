package com.javaex.practice02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		System.out.print("숫자 3개를 입력해 주세요\n숫자1: ");
		Scanner num = new Scanner(System.in);
		int n1 = num.nextInt();
		System.out.print("숫자2: ");
		int n2 = num.nextInt();
		System.out.print("숫자3: ");
		int n3 = num.nextInt();
		if ( n1 <= n2 && n1 <= n3) {
			System.out.printf("가장 작은 수는 %d 입니다.", n1);
		}else if (n2 <= n1 && n2 <= n3) {
			System.out.printf("가장 작은 수는 %d 입니다.", n2);
		}else {
			System.out.printf("가장 작은 수는 %d 입니다.", n3);
		}
		num.close();
	}

}
