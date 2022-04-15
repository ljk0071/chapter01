package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요 : ");
		Scanner a = new Scanner(System.in);
		int score = a.nextInt();
		if ( score >= 90 ) {
			System.out.println("A등급");
		} if ( 80<=score && score<90 ) {
			System.out.println("B등급");
		} if ( 70<=score && score<80) {
			System.out.println("C등급");
		} if ( 60<=score && score<70) {
			System.out.println("D등급");
		} if ( score < 60 ) {
			System.out.println("F등급");
		}
		a.close();
	}

}
