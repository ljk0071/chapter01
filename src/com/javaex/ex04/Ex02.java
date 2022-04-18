package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		System.out.print("단을 입력해주세요\n단: ");
		Scanner num = new Scanner(System.in);
		int i = num.nextInt();
		int x = 1;
		switch (i) {
			case 1:
				while(x<10) {
					System.out.printf("%d * %d = %d\n",i,x,i*x);
					x++;
					}
				break;
			case 2:
				while(x<10) {
					System.out.printf("%d * %d = %d\n",i,x,i*x);
					x++;
					}
				break;
			case 3:
				while(x<10) {
					System.out.printf("%d * %d = %d\n",i,x,i*x);
					x++;
					}
				break;
			case 4:
				while(x<10) {
					System.out.printf("%d * %d = %d\n",i,x,i*x);
					x++;
					}
				break;
			case 5:
				while(x<10) {
					System.out.printf("%d * %d = %d\n",i,x,i*x);
					x++;
					}
				break;
			case 6:
				while(x<10) {
					System.out.printf("%d * %d = %d\n",i,x,i*x);
					x++;
					}
				break;
			case 7:
				while(x<10) {
					System.out.printf("%d * %d = %d\n",i,x,i*x);
					x++;
					}
				break;
			case 8:
				while(x<10) {
					System.out.printf("%d * %d = %d\n",i,x,i*x);
					x++;
					}
				break;
			case 9:
				while(x<10) {
					System.out.printf("%d * %d = %d\n",i,x,i*x);
					x++;
					}
				break;
			default: 
				System.out.println("1부터 9까지 사이의 숫자를 입력해 주세요");
				break;
		}
		num.close();
	}

}
