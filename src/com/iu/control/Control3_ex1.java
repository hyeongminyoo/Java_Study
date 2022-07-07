package com.iu.control;

import java.util.Scanner;

public class Control3_ex1 {

	public static void main(String[] args) {
		//국어, 영어 , 수학 입력
		// 총점 평균 계산
		// 평균 90점 이상이면 A 
		// 평균 80점 이상이면 B 
		// 평균 70점 이상이면 C 
		// 평균 60점 이상이면 D 
		// 그외 나머지 F 
		
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		System.out.println("국어점수 입력");
		kor = sc.nextInt();
		System.out.println("영어점수 입력");
		eng = sc.nextInt();
		System.out.println("수학점수 입력");
		math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = total/3.0;
		
		if(avg>=90) {
			System.out.println("A");
		}else if(avg>=80) {
			System.out.println("B");
		}else if(avg>=70) {
			System.out.println("C");
		}else if(avg>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		
	}

}
