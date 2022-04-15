package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름:");
		Scanner a = new Scanner(System.in);
		String name = a.next();
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름:");
		String name2 = a.next();
		System.out.println("나이를 입력해 주세요");
		System.out.print("나이:");
		int age = a.nextInt();
		System.out.println("당신의 이름은 " + name2 + " 나이는 " + age + "입니다.");
		a.close();
		
	}

}
