package com.iu.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random =new Random();
//		nextInt(정수) : 0부터 입력한 정수 미만 범위에서 무작위 정수를 뽑아줌
//		int num = random.nextInt(10); 
//		System.out.println(num);
		
		//0 : 가위 
		//1 : 주먹
		//2 : 보
		// 사용자가 하나를 입력
		// 컴퓨터가 하나를 뽑아 비교
		// 사용자가 이길 경우만 프로그램 종료
		// 비기거나 지면 다시 실행
		
		boolean select = true;
				
		while(select) {
			System.out.println("0(가위) 1(주먹) 2(보) 중 하나를 입력");
			int num = sc.nextInt();
			int ran = random.nextInt(3);
			
			if((num==2 && ran==1) || (num == 1 && ran == 0) || (num == 0 && ran ==2)) {
			System.out.println("내가낸것 : " + num);
			System.out.println("컴퓨터가낸것 : " + ran);
			System.out.println("승리");
			System.out.println("프로그램 종료");
			select = !select;
				}else if(num==ran) {
					System.out.println("내가낸것 : " + num);
					System.out.println("컴퓨터가낸것 : " + ran);
					System.out.println("비김");
				}else {
					System.out.println("내가낸것 : " + num);
					System.out.println("컴퓨터가낸것 : " + ran);
					System.out.println("패배");
			 }
		}
		

	}

}
