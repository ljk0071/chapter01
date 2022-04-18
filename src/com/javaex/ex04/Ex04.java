package com.javaex.ex04;

public class Ex04 {

	public static void main(String[] args) {
		int b = 0;
		for (int i=1;i<11;i++) {
			b += i;
			System.out.printf("%d 까지의 합은 %d\n", i, b);
		}
		System.out.println("1부터 10까지의 정수의 합은 55 입니다.");
	}

}
