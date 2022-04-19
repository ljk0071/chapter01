package com.javaex.practice03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int sum ;
		sum=0 ;
		int [] array = new int[] {1,2,3,4,5};
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int max = array[0];
		for(int i=1;i<6;i++) {
			System.out.print("숫자: ");
			sum += sc.nextInt();
			switch (i) {
				case 1:
					array[0] = sum;
				case 2:
					array[1] = sum-array[0];
				case 3:
					array[2] = sum-array[0]-array[1];
				case 4:
					array[3] = sum-array[0]-array[1]-array[2];
				case 5:
					array[4] = sum-array[0]-array[1]-array[2]-array[3];
				}
			if ( i ==5 ) {
				for (int j=0;j<array.length; j++) {
					if (array[j]>max) {
						max = array[j];
					}
				}
				System.out.printf("최대값은 %d입니다",max);
			}
			
		}
		
		sc.close();
	}
}
