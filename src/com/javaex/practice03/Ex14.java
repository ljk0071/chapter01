package com.javaex.practice03;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		for (int i=1;i<=a;i++) {
			System.out.print(i);
			if (i != a) {
				System.out.print("+");
			}
			sum += i;
		}
		System.out.printf("\n합계: %d", sum);
		sc.close();
	}

}
