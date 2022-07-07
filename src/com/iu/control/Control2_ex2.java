package com.iu.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		//1

		
		Scanner sc = new Scanner(System.in);
		System.out.println("1-5사이의 숫자 입력"); 
		int num = sc.nextInt(); // 1-5 숫자
		System.out.println("알파벳을 입력");
		char ch = sc.next().charAt(0);
		
		
		if(ch=='z') {
			ch = (char)(ch - 26);
		}
		if(ch=='Z') {
			ch = (char)(ch - 26);
		}
		
		ch = (char)(ch+num);
		
		
		System.out.println("ch:"+ch);

		//Home edition
	}

}

