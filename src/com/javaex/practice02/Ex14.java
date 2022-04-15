package com.javaex.practice02;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		System.out.print("수익을 입력해 주세요(기본단위:만원)\n금익: ");
		Scanner sc = new Scanner(System.in);
		double money = sc.nextDouble();
		if ( money >= 0 && money <= 1000) {
			System.out.printf("소득세는 %f 입니다.", money*0.09);
		}else if ( money > 1000 && money <= 4000) {
			System.out.printf("소득세는 %f 입니다.", (1000*0.09)+(0.18*(money-1000)));
		}else if ( money > 4000 && money < 8000) {
			System.out.printf("소득세는 %f 입니다.", (1000*0.09)+((3000*0.18)+(0.27*(money-4000))));
		}else if ( money >= 8000 ) {
			System.out.printf("소득세는 %f 입니다.", (1000*0.09)+((3000*0.18)+(4000*0.27)+(0.36*(money-8000))));
		}else {
			System.out.println("잘 못 입력했습니다.");
		}
		sc.close();
	}

}
