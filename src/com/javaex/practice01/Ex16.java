package com.javaex.practice01;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		System.out.print("상품가격: ");
		Scanner a = new Scanner(System.in);
		double price = a.nextDouble();
		System.out.print("받은 돈: ");
		double money = a.nextDouble();
		System.out.println("===================");
		System.out.println("받은 돈: " + money);
		System.out.println("상품 가격: " + price);
		System.out.println("부가세: " + price/10);
		System.out.println("잔액: " + (money-price));
		
		a.close();
		
		
	}

}
