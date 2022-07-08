package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {
		
		//0분0초 부터 59분 59초까지
		//분과 초를 입력받음
		// ex) 1 , 15 
		//     1분 15초가 되면 전체 종료 
		// 안쪽 for에서 break 사용 시 해당 반복문만 종료
		
		Scanner sc = new Scanner(System.in);
		System.out.println("분을 입력하세요");
		int inm = sc.nextInt();
		System.out.println("초를 입력하세요");
		int ins = sc.nextInt();
	
		boolean flag = false;

		for(int m=0; m<60; m++) {

			for(int s=0; s<60; s++) {
				System.out.println("현재 시간은 " + m + "분" + s + "초");
				if(s==ins && m==inm) {
					m = 60;
					flag = !flag;
					break;
				}
			}
			
			
//			if(flag) {
//				break;
//			}
			
//			if(m==inm) {
//				break;
//			}
			
			}
		}

	}

