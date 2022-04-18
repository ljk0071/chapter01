package com.javaex.ex04;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("숫자를 입력하세요.[0]이면 종료");
			
			int i = sc.nextInt();
			if ( i!= 0 ) {
				sum += i;
				System.out.printf("합계: %d\n", sum);
			}else {
				System.out.println("종료");
				sc.close();
				break;
			}
			
			
		} while(true);
		
	}

}
