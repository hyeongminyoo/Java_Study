package com.iu.control;

import java.util.Scanner;

public class Control4_ex1 {

	public static void main(String[] args) {
		//국어, 영어 , 수학 입력
		// 총점 평균 계산
		// 평균 90점 이상이면 A 
		// 평균 80점 이상이면 B 
		// 평균 70점 이상이면 C 
		// 평균 60점 이상이면 D 
		// 그외 나머지 F 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수");
		int kor = sc.nextInt();
		System.out.println("영어점수");
		int eng = sc.nextInt();
		System.out.println("수학점수");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		int avg = total/3;
		
		int score = avg / 10;
		
		switch(score) {
		case 10://break 생략
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}

	}

}
