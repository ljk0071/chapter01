package com.javaex.ex03;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		System.out.print("500원 갯수: ");
		Scanner five = new Scanner(System.in);
		int a = five.nextInt();
		System.out.print("100원 갯수: ");
		Scanner hund = new Scanner(System.in);
		int b = hund.nextInt();
		System.out.print("50원 갯수: ");
		Scanner fifty = new Scanner(System.in);
		int c = fifty.nextInt();
		System.out.print("10원 갯수: ");
		Scanner ten = new Scanner(System.in);
		int d = ten.nextInt();
		int result = (a*500) + (b*100) + (c*50) + (d*10);
		System.out.println("동전의 총합은 "+ result +" 원 입니다.");
		
	}

}
