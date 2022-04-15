package com.javaex.practice01;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		System.out.print("마일을 입력하세요: ");
		Scanner mile = new Scanner(System.in);
		double a = mile.nextDouble();
		double b = a * 1.6093;
		System.out.println(a + "마일은 " + b + "킬로미터 입니다.");
		mile.close();
	}

}
