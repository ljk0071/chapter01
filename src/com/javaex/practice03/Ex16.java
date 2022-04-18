package com.javaex.practice03;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int b =0;
		int sum = 0;
		for (int i=1; i<=a;i++) {
			if(i%5 == 0) {
				b++;
				sum += i;
			}
		}
		System.out.printf("5의 배수의 개수: %d\n", b);
		System.out.printf("5의 배수의 합: %d", sum);
		sc.close();
	}

}
