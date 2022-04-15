package com.javaex.practice02;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		System.out.print("첫 번째 숫자: ");
		Scanner num = new Scanner(System.in);
		int n1 = num.nextInt();
		System.out.print("두 번째 숫자: ");
		int n2 = num.nextInt();
		if (n1 >= n2 ) {
			if ( n1%n2 == 0) {
				System.out.printf("%d 는(은) %d 의 약수입니다.", n2, n1);
			}else {
				System.out.printf("%d 는(은) %d 의 약수가 아닙니다.", n2, n1);
			}
		}else {
			if ( n2%n1 == 0) {
				System.out.printf("%d 는(은) %d 의 약수입니다.", n1, n2);
			}else {
				System.out.printf("%d 는(은) %d 의 약수가 아닙니다.", n1, n2);
			}
		num.close();
		}
	}
}

