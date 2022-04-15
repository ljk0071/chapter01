package com.javaex.practice01;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		System.out.print("500원 갯수: ");
		Scanner coin = new Scanner(System.in);
		int five = coin.nextInt();
		System.out.print("100원 갯수: ");
		int hund = coin.nextInt();
		System.out.print("50원 갯수: ");
		int fifty = coin.nextInt();
		System.out.print("10원 갯수: ");
		int ten = coin.nextInt();
		int result = (five*500) + (hund*100) + (fifty*50) + (ten*10);
		System.out.println("동전의 총합은 "+ result +" 원 입니다.");
		coin.close();

	}
}
