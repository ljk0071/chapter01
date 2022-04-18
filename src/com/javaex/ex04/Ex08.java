package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		int a = 1;
		while(true) {
			a++;
			if (a%6 == 0 && a%14 == 0) {
				System.out.println(a);
				break;
			}
		}
	}

}
