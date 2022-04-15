package com.javaex.practice02;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		System.out.print("알파벳 1글자(소문자)를 입력하세요\n알파벳: ");
		Scanner a = new Scanner(System.in);
		String alphabet = a.next();
		switch (alphabet) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println("모음입니다.");
				break;
			default : 
				System.out.println("자음입니다.");
		}
		a.close();
		
	}

}
