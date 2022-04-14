package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름:");
		Scanner name = new Scanner(System.in);
		String a = name.next();
		System.out.println("당신의 이름은 " + a + "입니다.");
		name.close();
		
	}

}
