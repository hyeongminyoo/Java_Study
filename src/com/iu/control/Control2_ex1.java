package com.iu.control;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		//월급을 입력 400만원
		//1. 정규직 2. 계약직
		//정규직 - 국민연금 1%, 건강보험 1.4%, 고용보험 0.5%, 산재보험 0.7%
		//계약직 - 3.3% 공제
		
		int num = 4000000;
		String sel = null;
		double real = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번과 2번 중 하나를 입력");
		sel = sc.next();
		
		if(sel.equals("1번")) {
			real = num - (num*(0.01 + 0.014 + 0.005 + 0.007));
		}else{
			real = num - (num*0.033);
		}
		
		System.out.println("실수령액은 " + real + " 원 입니다.");
		
		
		
		
	}

}
