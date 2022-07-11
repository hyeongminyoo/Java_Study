package com.iu.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		// 몬스터 기본정보
		String [] monsterNames = {"고블린", "오크", "트롤", "골렘"};
		int [] monsterHps = {5, 7, 10, 15};
		
		// 캐릭터 이름 설정(마법사)
		System.out.println("캐릭터 이름 입력");
		String name = sc.next();
		
		//파이어볼
		int magicPower = 6;
		
		// 몬스터 파티 생성
		// 몬스터의 수 입력( 1 - 4 ) 
		// 입력한 수 만큼 몬스터를 랜덤하게 뽑고 출력
		
		System.out.println("몬스터의 수 입력(1-4)");
		int count = sc.nextInt();
		String[] monsterPartyNames = new String[count];
		int [] monsterPartyHps = new int[count];
		
		for(int i = 0 ; i<monsterPartyNames.length; i++) {
			int index = random.nextInt(4);
			monsterPartyNames[i] = monsterNames[index];
			monsterPartyHps[i] = monsterHps[index];
		}
		
		// 1 회성 
		// 0-6미만의 랜덤한 데미지로 몬스터 공격
		// 몬스터 각각의 데미지 따로 
		// 각각 남은 hp 출력
	
		for(int i = 0 ; i<monsterPartyNames.length; i++) {
			System.out.println(monsterPartyNames[i] + " : " + monsterPartyHps[i]);
		}
		
		//1. 사냥 2. 도망 
		// 1번은 계속 공격 2번누르기전까지 계속 사냥
		
		System.out.println("===========================================");
	
		
		boolean check = true;
		
		// 죽으면 death가 1 올라가도록
		
		while(check) {
			int death = 0;
			System.out.println("1. 사냥 2. 도망");
			int select = sc.nextInt();
			if(select==1) {
				for(int i = 0 ; i<monsterPartyNames.length; i++) {
					 int damage = random.nextInt(magicPower); 
					 monsterPartyHps[i] = monsterPartyHps[i] - damage;
					 System.out.println("데미지 : " + damage);
					 if(monsterPartyHps[i]<1) {
						 death++;
					 }
				}
			}else {
				System.out.println("도망쳤습니다");
				break;
			}
			System.out.println("사냥한 몬스터 수 :  "+ death);
		}

		
		// 
		
		
		
	}

}
