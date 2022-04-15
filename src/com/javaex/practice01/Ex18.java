package com.javaex.practice01;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		System.out.print("화씨: ");
		Scanner f = new Scanner(System.in);
		double c = f.nextDouble();
		double celcius = (double)5/9*(c-32.0);
		System.out.println("화씨" + c +"의 섭씨 온도는 " + celcius + "입니다.");
		f.close();
		
	}

}
