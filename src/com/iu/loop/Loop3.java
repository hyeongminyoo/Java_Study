package com.iu.loop;

public class Loop3 {

	public static void main(String[] args) {
		
		for(int i = 0; i<10 ; i++ ) {
			System.out.println("1. 대문자   2. 소문자   3. 종료 ");
			int select = 1;
			switch(select) {
			case 1:
				System.out.println("대문자");
				break; //스위치 케이스 break이므로 for문은 계속 돌아감
			case 2:
				System.out.println("소문자");
				break; //스위치 케이스 break이므로 for문은 계속 돌아감
			default :
				System.out.println("프로그램을 종료합니다.");
				break; //스위치 케이스 break이므로 for문은 계속 돌아감
			}
			
			
			
		}

	}

}
