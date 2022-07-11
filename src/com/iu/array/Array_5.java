package com.iu.array;

public class Array_5 {

	public static void main(String[] args) {
		int [] nums1 = {1,2,3};
		System.out.println(nums1.length);
		//얕은 복사 (주소만 복사하므로 같은 주소)
		int [] nums2 = nums1;
		System.out.println(nums2.length);
		
		//깊은 복사 ( 새로운 배열 생성후 값을 복사 )
		int [] nums3 = new int[3];
		for(int i = 0 ; i < nums1.length; i++) {
			nums3[i] = nums1[i];
		}
		nums2[0] = 9;
		System.out.println(nums1[0]); 
		
		System.out.println(nums3.length); //3
		
		
		nums3[0] = 100;
		System.out.println(nums1[0]); 
		
		// 
		nums3 = new int[5]; // nums3 길이는 5칸으로 바뀜
		System.out.println(nums3[0]);
		
		
	}

}
