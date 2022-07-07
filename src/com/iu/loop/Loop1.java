package com.iu.loop;

public class Loop1 {

	public static void main(String[] args) {
		System.out.println("Start");
		
		//for(초기식 ; 조건식 ; 증감식){}
		
		for(int i = 0; i<5; i++) {
			System.out.println("hello world");
		}
		
		// for문의 int i 는 지역변수 for문 내에서만 사용하므로 다시 선언
		int count = 0;
		for(int i = 0; i<10 ; i++) {
			System.out.println(i);
			//count++;
		}
		
		System.out.println("Finish");

	}

}
