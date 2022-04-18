package com.javaex.practice03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("숫자를 입력하세요");
		for(int i=1;i<6;i++) {
			System.out.print("숫자: ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			sum += num;
			if (i == 5) {
				System.out.printf("최대값은 %d입니다.", sum);
				sc.close();
			}
			}
		
		}
	

}
