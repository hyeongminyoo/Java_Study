package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {
		//FPS
		//총알 :
		//탄창 : 30발, 3개

		//1. 단발 2. 점사 
		// 탄창 교체할떄 마다 질문
		
		System.out.println("Start");
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<4 ; i++) {
		System.out.println("1. 단발 2. 점사");
		int select = sc.nextInt();
		
		int inc = 3;
		String sound = "타타탕";
		if(select==1) {
			inc = 1;
			sound = "탕";
		}
		
		for(int b=0; b<30; b=b+inc) {
			System.out.println(sound);
		}
		}	
		
		
		
		
		
//		int count = 10;
//		String sound = "타타탕";
//		if(select==1) {
//			count = 30;
//			sound = "탕";
//		}
//		
//		for(int b = 0; b<count; b++) {
//			System.out.println(sound);
//		}
		
		
		
//		for(int i=1; i<4 ; i++) {
//			int k = 0;
//			System.out.println();
//			System.out.println("1. 단발 2. 점사");
//			int select = sc.nextInt();
//			for(int j=1; j<31; j++) {
//				if(select==1) {
//					System.out.println("탄창: " + i + "총알: "+(31-j)+"탕");
//				}else if(select==2) {
//					System.out.println("탄창: " + i + "총알: "+(j-k)+"탕");
//					k += 2;
//					j = j+2;
//			}
//		}
//		
//		
//	}
		System.out.println();
		System.out.println("Finish");
 }
}	
