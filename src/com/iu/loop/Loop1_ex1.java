package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex1 {

	public static void main(String[] args) {
		//0-9 출력하는 반복문
		//단, 출력은 짝수만 출력하세요
		
		for(int i=0; i<10 ; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("==========================");
		//0-9 사이의 짝수만 출력
		// 단, if 문을 사용하지않고
		
		for(int i=0; i<10 ; i+=2) {
			System.out.println(i);
		}
		System.out.println("==========================");
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("==========================");
		//멍멍 출력
		//출력 횟수를 입력 받아서 그 횟수만큼 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력 횟수를 입력");
		int num = sc.nextInt();
		
		
		for(int i = 1; i<=num; i++) {
			System.out.println("멍멍");
		}
		
		
	}

}
