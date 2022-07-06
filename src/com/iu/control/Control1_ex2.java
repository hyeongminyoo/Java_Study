package com.iu.control;

import java.util.Scanner;

public class Control1_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String result = "홀수 입니다.";
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		if(num%2==0) {
			result = "짝수 입니다.";
		}
		
		result = num%2==0?"짝수입니다.":"홀수입니다.";
		
		System.out.println(result);

	}

}
