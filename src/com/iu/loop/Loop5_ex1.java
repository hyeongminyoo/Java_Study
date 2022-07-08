package com.iu.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yId = 1234;
		int yPw = 5678;
		
		//ID입력, PW 입력
		//로그인 판단 , 로그인 성공 시 종료
		// 실패 시 다시 입력
		
		boolean check = true;
		while(check) {
			System.out.println("1. 로그인 시도   2. 종료");
			int select = sc.nextInt();
			int start = 1;
			
			//로그인 시도
			switch(select) {
			case 1:
				System.out.println("ID 입력");
				int id = sc.nextInt();
				System.out.println("PW 입력");
				int pw = sc.nextInt();
				if(id == yId &&  pw == yPw) {
					System.out.println("로그인 성공");
					check = !check;
					start = 1;
					break;
				}else if(id != yId || pw != yPw) {
					System.out.println("로그인 실패");
					start = 2;
				}
				break;
				
			case 2:
				System.out.println("종료합니다.");
				start = 2;
				check = !check;
				break;
			default :
				System.out.println("종료합니다.");
				start = 2;
				check = !check;
				break;
			}
			
			if(start==1) {
				System.out.println("===게임 시작===");
				
				int gold = 1000;
				int plus = 0;
				int mop = 0;
				int inc = 1;
				boolean check2 = true;
				int lev = 1;
				int total = 0;
				
				while(check2) {
					System.out.println("사냥하려면 1을 입력하세요");
					int atk = sc.nextInt();
					
					if(atk==1) {
						System.out.println(lev + "Level");
						System.out.println("");
						for(mop = 1 ; mop <= (total+1); mop++) {
							total = total + mop;
							System.out.println(total + " 마리 사냥했습니다.");
							
							if(total==3*lev) {
								lev++;
								System.out.println("");
								System.out.println(lev+" Level ");
								System.out.println("");
							}
							
							if(lev == inc*5 ) {
								inc++;
								plus++;
								gold = gold + plus*1000;
								System.out.println("");
								System.out.println("현재 획득 골드 : " + gold);
								System.out.println("");
							}
							if(lev==15) {
								System.out.println("");
								System.out.println("만렙달성");
								System.out.println("");
								
								check2 = !check2;
								
								break;
							}
							
						}
						
					}
				}
					
				}else if(start==2) {
					System.out.println();
					} 
		
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
		
		

		}

	}
}	
