package com.javaex.practice03;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i=a;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				if (i == 1) {
					continue;
				}else {
					System.out.print("*");
				}
			}
			if (i == 1) {
				continue;
			}else {
			System.out.println();
		}
		sc.close();
	}
	}
}
