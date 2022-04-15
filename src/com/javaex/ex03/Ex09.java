package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		System.out.print("과목을 선택하세요\n(1.자바 2.C 3.C++ 4.파이썬\n과목번호: ");
		Scanner a = new Scanner(System.in);
		int course = a.nextInt();
		if ( course == 1 ) {
			System.out.println("R101호");
		} else if ( course == 2 ) {
			System.out.println("R202호");
		} else if ( course == 3 ) {
			System.out.println("R303호");
		} else if ( course == 4 ) {
			System.out.println("R404호");
		} else {
			System.out.println("상담원에게 문의하세요");
		}
		a.close();
	}
}
