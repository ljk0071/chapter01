package com.javaex.ex03;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		System.out.print("상품가격: ");
		Scanner price = new Scanner(System.in);
		double a = price.nextDouble();
		System.out.print("받은 돈: ");
		Scanner cash = new Scanner(System.in);
		double b = cash.nextDouble();
		System.out.println("===================");
		System.out.println("받은 돈: " + b);
		System.out.println("상품 가격: " + a);
		System.out.println("부가세: " + a/10);
		System.out.println("잔액: " + (b-a));
		
		price.close();
		cash.close();
		
	}

}
