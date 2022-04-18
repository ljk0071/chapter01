package com.javaex.practice03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		for(int i=1;i<=max;i++) {
			for (int j=1;j<=i;j++) {
					System.out.print(i);
			}
			System.out.println();
		}
		sc.close();
	}

}
