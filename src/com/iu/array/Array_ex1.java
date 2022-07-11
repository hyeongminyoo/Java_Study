package com.iu.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		// 키보드로부터 인원수 입력받아서
		// 인원수 만큼 이름을 입력받아서
		// 이름들을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수 입력");
		int count = sc.nextInt();
		String [] names = new String[count];
		int [] kors = new int[names.length];
		int sum = 0;
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(i+1+" 번 이름 입력");
			names[i] = sc.next();
			
		}
		
		for(int i = 0 ; i< kors.length; i++) {
			System.out.println(names[i] + " 의 국어점수 입력");
			kors[i] = sc.nextInt();
		}
		
		//반의 국어 총점을 계산하고 출력
		for(int i = 0; i<kors.length ; i++) {
			sum = sum + kors[i];
		}
		
		
		
		
		//--------------------
		for(int i = 0 ; i<names.length ; i++) {
			System.out.println(names[i]);
		}
		
		//각 학생의 이름 별로 국어 점수 입력 후 출력
		
		for(int i = 0 ; i<kors.length ; i++) {
			System.out.println(names[i] + " 국어점수 : " + kors[i]);
		}
		
		//총점
		System.out.println("반의 국어점수 총점 : " + sum);
		
		
	}

}
