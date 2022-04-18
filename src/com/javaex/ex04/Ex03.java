package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		System.out.print("단을 입력해주세요\n단: ");
		Scanner num = new Scanner(System.in);
		int i = num.nextInt();
		
		switch (i) {
		case 1:
			for (int x=1;x<10;x++) {
				System.out.printf("%d * %d = %d\n",i,x,i*x);
			}
			break;
		case 2:
			for (int x=1;x<10;x++) {
				System.out.printf("%d * %d = %d\n",i,x,i*x);
			}
			break;
		case 3:
			for (int x=1;x<10;x++) {
				System.out.printf("%d * %d = %d\n",i,x,i*x);
			}
			break;
		case 4:
			for (int x=1;x<10;x++) {
				System.out.printf("%d * %d = %d\n",i,x,i*x);
			}
			break;
		case 5:
			for (int x=1;x<10;x++) {
				System.out.printf("%d * %d = %d\n",i,x,i*x);
			}
			break;
		case 6:
			for (int x=1;x<10;x++) {
				System.out.printf("%d * %d = %d\n",i,x,i*x);
			}
			break;
		case 7:
			for (int x=1;x<10;x++) {
				System.out.printf("%d * %d = %d\n",i,x,i*x);
			}
			break;
		case 8:
			for (int x=1;x<10;x++) {
				System.out.printf("%d * %d = %d\n",i,x,i*x);
			}
			break;
		case 9:
			for (int x=1;x<10;x++) {
				System.out.printf("%d * %d = %d\n",i,x,i*x);
			}
			break;
		default: 
			System.out.println("1부터 9까지 사이의 숫자를 입력해 주세요");
			break;
		}
		num.close();
	}

}
