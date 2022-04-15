package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		System.out.print("과목을 선택하세요\n(1.자바 2.C 3.C++ 4.파이썬\n과목번호: ");
		Scanner a = new Scanner(System.in);
		int course = a.nextInt();
		
		switch (course) {
			case 1 : 
				System.out.println("R101호");
				break;
			case 2 : 
				System.out.println("R202호");
				break;
			case 3 : 
				System.out.println("R303호");
				break;
			case 4 : 
				System.out.println("R404호");
				break;
			default :
				System.out.println("상담원에게 문의하세요");
				break;
		}
		a.close();
	}

}
