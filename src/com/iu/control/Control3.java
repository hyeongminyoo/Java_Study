package com.iu.control;

import java.util.Scanner;

public class Control3 {

	public static void main(String[] args) {
		int num = 10; //메소드 안에 선언된 변수 : 지역변수 ( 라이프사이클 : 메인 메소드 종료 시 까지 )
		// 메모리 : 메소드, 스택, 힙
		// 스택에 선언 : 지역변수
		// 메소드 : 클래스 변수
		// 힙에 선언 : 인스턴스 변수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1-3 사이의 숫자를 입력하세요");
		int select = sc.nextInt();
		
		
		if(select == 1) {
			int count = 1; //중괄호 안에서 선언된 메소드 지역변수 ( 라이프사이클이 짧은것 )
			System.out.println(num);
			System.out.println("1 선택");
		}else if(select == 2) {
			int count = 1; //지역변수
			System.out.println("2 선택");
		}else {
			int count = 1;
			System.out.println("3 선택");
		}
		System.out.println(num);
		
	} 
		
}
