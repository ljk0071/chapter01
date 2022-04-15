package com.javaex.practice01;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		System.out.print("반지름: ");
		Scanner radius = new Scanner(System.in);
		double a = radius.nextDouble();
		double b = (double)4 / 3 * (3.14*a*a*a);
		System.out.print("구의 부피는: " + b);
		radius.close();
	}

}
