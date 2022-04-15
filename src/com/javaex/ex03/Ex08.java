//package com.javaex.ex03;
//
//import java.util.Scanner;
//
//public class Ex08 {
//
//	public static void main(String[] args) {
//		System.out.print("숫자를 입력하세요\n숫자: ");
//		Scanner a = new Scanner(System.in);
//		int num = a.nextInt();
//		if ( num % 2 == 0 && num > 0) {
//			System.out.println("짝수입니다.");
//		}
//		if ( num % 2 != 0 && num > 0) {
//			System.out.println("홀수입니다.");
//		} if ( num < 0 ) {
//			System.out.println("음수입니다.");
//		}
//		a.close();
//	}
//
//}
package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요\n숫자: ");
		Scanner a = new Scanner(System.in);
		int num = a.nextInt();
		if ( num > 0) {
			 if ( num % 2 == 0 ) {
				System.out.println("짝수입니다.");
			}
			if ( num % 2 != 0 ) {
				System.out.println("홀수입니다.");
			}
		} if ( num < 0 ) {
			System.out.println("음수입니다.");
		}
		a.close();
	}

}
