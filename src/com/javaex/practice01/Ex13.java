package com.javaex.practice01;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		System.out.print("환전할 원화를 입력하세요: ");
		Scanner money = new Scanner(System.in);
		double a;
		a = money.nextInt();
		double b = a / 1225;
		System.out.println("받으실 달러는 "+ b);
		money.close();
		
	}

}
