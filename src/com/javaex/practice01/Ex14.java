package com.javaex.practice01;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		int width, height, area, circ;
		System.out.print("가로를 입력하세요: ");
		Scanner a = new Scanner(System.in);
		width = a.nextInt();
		System.out.print("세로를 입력하세요: ");
		height = a.nextInt();
		circ = (2*width) + (2*height);
		area = width * height;
		System.out.println("사각형의 넓이는: " + area);
		System.out.println("사각형의 둘레는: " + circ);
		a.close();
		
	}

}
