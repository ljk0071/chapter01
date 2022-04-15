package com.javaex.practice02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		System.out.print("나이를 입려해주세요\n나이: ");
		Scanner num = new Scanner(System.in);
		int age = num.nextInt();
		if ( age >= 19 && age < 65) {
			System.out.println("1번그룹 입니다.");
		}else {
			System.out.println("2번그룹 입니다.");
		}
		num.close();
		
	}

}
