package com.javaex.practice03;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		System.out.println("====================");
		System.out.println(" [숫자 맞추기 게임 시작]");
		System.out.println("====================");
		Scanner sc = new Scanner(System.in);
		int myNumber = 120;
		String answer ;
		boolean status = true;
		while(status) {
			System.out.print(">>");
			int a = sc.nextInt();
			if ( a < myNumber ) {
				System.out.println("더 높게");
			}else if ( a > myNumber ) {
				System.out.println("더 낮게");
			}else {
				System.out.print("맞았습니다.\n게임을 종료하시겠습니까?(y/n) >>");
				answer = sc.next();
				switch (answer) {
					case "y" :
						System.out.println("====================");
						System.out.println(" [숫자 맞추기 게임 종료]");
						System.out.println("====================");
						sc.close();
						status = false;
					case "n" :
						continue;
				}
			}
		}
	}
}

