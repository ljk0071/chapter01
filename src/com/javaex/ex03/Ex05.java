package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		System.out.print("근무시간: ");
		Scanner num = new Scanner(System.in);
		int time = num.nextInt();
		if (time < 8) {
			int payment = time * 10000;
			System.out.println(payment);
		} else {
			double payment = 80000 + ( (10000 * (double)1.5) * (time - 8));
			System.out.println((int)payment);
		}
		num.close();
	}

}