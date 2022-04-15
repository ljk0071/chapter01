package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		System.out.print("근무시간: ");
		Scanner num = new Scanner(System.in);
		int time = num.nextInt();
		double payment;
		if (time < 8) {
			payment = time * 10000;
		} else {
			payment = 80000 + ( (10000 * (double)1.5) * (time - 8));
		 }
		System.out.printf("임금은 %d입니다", (int)payment);
		num.close();
	}

}
