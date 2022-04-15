package com.javaex.practice01;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		System.out.print("월급을 입력하세요: ");
		Scanner salary = new Scanner(System.in);
		int a;
		a = salary.nextInt();
		int b = a * 120;
		System.out.println("10년동안 최데 저축액은 "+ b + "원 입니다.");
		salary.close();
		
	}

}
