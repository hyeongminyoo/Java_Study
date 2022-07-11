package com.iu.array;

import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] nums = new int[4];
		
		for(int i=0 ; i<nums.length ; i++) {
			System.out.println(i+ " 번 인덱스 값 입력");
			nums[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i<nums.length ; i++) {
			System.out.println(nums[i]);
		}

	}

}
