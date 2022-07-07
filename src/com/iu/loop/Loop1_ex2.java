package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {
		//1. 1번 대문자, 2번 소문자
		//   1번 A - Z 출력
		//   2번 a - z 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1번 : 대문자  2번 : 소문자 ");
		int num = sc.nextInt();
		
		int i = 97;
		int j = 123;
		
		if(num==1) {
			i = 65;
			j=91;
		}
		for(int c=i;c<j;c++) {
			System.out.println((char)c);
		}
		
		
		
//		if(num==1) {
//			for(int i = 0; i<26 ; i++ ) {
//				int cap = i + 65;
//				System.out.println((char)cap);	
//			}
//		}else if(num==2) {
//				for(int i = 0; i<26 ; i++) {
//					int small = i+97;
//					System.out.println((char)small);
//				}
//			}

		System.out.println("=========================================");
		
		
		//2. 1 - 10 까지 합을 구하기
		
		int sum = 0;
		for(int f = 1; f<11 ; f++) {
			sum = sum + f;
		}
		System.out.println(sum);
		System.out.println("=========================================");
		
		
		//3. ID, PW를 입력해서 로그인 판단 
		//  최대 5번까지 시도 가능
		//  로그인 성공하면 그 즉시 종료
		
		int yId = 1234; //회원가입 시 입력한 ID
		int yPw = 5678; //회원가입 시 입력한 PW
		
		boolean check = false;
		int g = 0;
		for(g = 1; g<6 ; g++) {
			System.out.println("ID를 입력하세요");
			int idinput = sc.nextInt();
			System.out.println("PW를 입력하세요");
			int pwinput = sc.nextInt();
			
			if (idinput == yId && pwinput == yPw) {
				System.out.println("로그인 성공");
				check= !check;
				g = 7;
				// break; 
			}else if(idinput != yId || pwinput != yPw) {
				System.out.println( g + "번 틀렸습니다.");
			}
			switch(g) {
			case 5:
				System.out.println("5번 잘못입력하셨습니다.");
				break;
			}
		}// for 끝

		if(check) {
			System.out.println("은행방문");
		}else {
			System.out.println("게임시작");
		}
		
		
		
//		if(g==5) {
//			System.out.println("은행 방문");
//		}else {
//			System.out.println("게임 시작");
//		}
		// 1. 로그인 성공
		// 2. 로그인 5번 전부 실패
		
		
			System.out.println("Finish");
		
	}

}
