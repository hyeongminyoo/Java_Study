package com.iu.loop;

import java.util.Scanner;

public class Loop5_ex1_re {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yId = 1234;
		int yPw = 5678;
		
		//ID입력, PW 입력
		//로그인 판단 , 로그인 성공 시 종료
		// 실패 시 다시 입력

		boolean check = true;
		boolean check2 = false;
		
		while(check) {
			System.out.println("1. 로그인 시도   2. 종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("ID 입력");
				int id = sc.nextInt();
				System.out.println("PW 입력");
				int pw = sc.nextInt();
				if(id==yId && pw == yPw) {
					System.out.println("로그인 성공");
					check = !check;
					check2 = !check2;
				}else {
					System.out.println("로그인 실패");
				}
				break;
			case 2:
				System.out.println("프로그램 종료");
				check = !check;
				break;
			default :
				check = !check;
				break;
			}
			
			
			
		}//while 끝
		
		//------------------------------------
		//로그인을 안했으면 프로그램이 종료 
		//로그인 성공했으면 게임 시작
		//RPG
		//시작레벨 1
		// 만랩  15
		// gold   : 1000
		// 
		// 모든 몬스터의 경험치는 동일
		// 1->2 : 3마리 잡아야함
		// 2->3 : 6마리 잡아야함
		// 3->4 : 9
		// 4->5 : 12마리
		// ....
		// 14 -> 15 : 42마리
		// 몬스터 사냥해서 레벨이 오르면 레벨 프린트
		// 사냥 한마리할때마다 프린트
		
		// 5레벨 달성 시 축하금으로 1000골드 지급
		// 10레벨 달성 시 축하금 2000골드 지급
		// 15레벨 달성 시 축하금 3000골드 지급
		
		int lev = 1;
		int gold = 1000;
		int mop = 0;
		int plus = 0;
		
		if(check2) {
			System.out.println("게임시작");
			
			for(lev = 1; lev < 15 ; lev++) {
				System.out.println("레벨 : " + lev);
				
				if(lev%5==0) {
					gold = gold + (lev/5)*1000;
					System.out.println("획득골드 : " + gold);
				}
				
				for(mop = 1 ; mop < lev*3 ; mop++ ) {
					System.out.println(mop + "마리 사냥 ");
				}
			}
			
			System.out.println("최종 획득골드 : " + (gold + 3000));
			System.out.println("레벨 : "  + lev);
			
			
		}
		

	
		
		
	}

}
