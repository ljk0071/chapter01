package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		System.out.print("근무시간: ");
		Scanner num = new Scanner(System.in);
		int time = num.nextInt();
		int payment;
		if (time < 8) {
			payment = time * 10000;
		} else {
			payment = 80000 + (12000* (time - 8));
		}
		System.out.printf("임금은 %d입니다", payment);
		num.close();
	}

}
