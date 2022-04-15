package com.javaex.practice02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		System.out.print("키와 몸무게를 입력해주세요.\n키: ");
		Scanner num = new Scanner(System.in);
		int height = num.nextInt();
		System.out.print("몸무게: ");
		int weight = num.nextInt();
		double normalWeight = (height - 100) * 0.9; 
		if ( normalWeight > weight ) {
			System.out.println("저체중 입니다.");
		}else if ( normalWeight == weight) {
			System.out.println("표준 입니다.");
		}else {
			System.out.println("과체중 입니다.");
		}
		System.out.printf("표준체중: %f", normalWeight);
		num.close();
	}

}
