package com.javaex.practice01;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		System.out.print("반지름을 입력하세요: ");
		Scanner radio = new Scanner(System.in);
		double a;
		a = radio.nextInt();
		double b = a * a * 3.14;
		System.out.println("원의 넓이는 "+ b);
		radio.close();
		
	}

}
