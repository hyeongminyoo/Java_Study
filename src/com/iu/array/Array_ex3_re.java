package com.iu.array;

import java.util.Scanner;

public class Array_ex3_re {

	public static void main(String[] args) {
		//학교 성적 프로그램
		// 1번을 무조건 누르고 2,3,4,5 
		//1. 학생정보입력
		//	- 학생 수를 입력하세요
		//	- 이름, 번호, 국어, 영어, 수학 입력 후 계산 총점, 평균 
		//2. 학생정보조회
		//	- 모든 학생의 이름, 번호, 총점, 평균 출력
		//3. 학생 정보 검색
		//	- 검색할 학생의 번호를 입력
		//	- 입력한 번호와 일치하는 학생의 모든 정보를 출력 
		//	- 일치하는 번호가 없으면 없는번호라고 출력
		//4. 학생 정보 삭제
		//	- 삭제할 학생의 번호 입력
		//	- 입력한 번호와 일치하는 학생의 정보를 삭제 ( 배열을 한칸 줄임)
		//	- 일치하는 번호가 없으면 없는번호라고 출력
		//5. 학생 정보 추가
		//	- 학생 이름 번호 국어 영어 수학 입력 후 총점 평균 계산한 값 추가
		//	- 배열 한칸 추가 
		//6. 프로그램 종료
		// 6번 누를때까지 반복
		
		Scanner sc = new Scanner(System.in);
		int students = 0;
		boolean check = true;
		String [] names = null; 
		int [] nums = null;
		int [] kors = null;
		int [] engs = null;
		int [] maths = null;
		int [] totals = null;
		int [] avgs = null;
		
		while(check) {
			System.out.println("학교성적 프로그램");

			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생정보조회");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 학생정보삭제");
			System.out.println("5. 학생정보추가");
			System.out.println("6. 프로그램종료");
			//1. 학생정보입력
			//	- 학생 수를 입력하세요
			//	- 이름, 번호, 국어, 영어, 수학 입력 후 계산 총점, 평균
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("학생수 입력");
				students = sc.nextInt();
				names = new String[students]; 
				nums = new int[students];
				kors = new int[students];
				engs = new int[students];
				maths = new int[students];
				totals = new int[students];
				avgs = new int[students];
				
				for(int i = 0; i<students; i++) {
					System.out.println(i+1+"번째 학생 이름 입력");
					names[i] = sc.next();
					System.out.println(i+1+"번째 학생 번호 입력");
					nums[i] = sc.nextInt();
					System.out.println(i+1+"번째 학생 국어점수");
					kors[i] = sc.nextInt();
					System.out.println(i+1+"번째 학생 영어점수");
					engs[i] = sc.nextInt();
					System.out.println(i+1+"번째 학생 수학 점수");
					maths[i] = sc.nextInt();
					
					totals[i] = kors[i] + engs[i] + maths[i];
					avgs[i] = totals[i] / 3;
				}
			}else if(select == 2) {
					
				if(names != null) {
					for(int i = 0; i < students ; i++) {
					System.out.println("이름\t번호\t총점\t평균");
					System.out.println(names[i]+"\t"+nums[i]+"\t"+totals[i]+"\t"+avgs[i]);
					}
				}else {
					System.out.println("학생 정보가 없습니다.");
				}
			}else if(select == 3) {
				System.out.println("학생 번호를 입력하세요");
				int id = sc.nextInt();
				for(int i = 0; i<students ; i++) {
					if(id==nums[i]) {
						System.out.println("이름\t번호\t총점\t평균");
						System.out.println(names[i]+"\t"+nums[i]+"\t"+totals[i]+"\t"+avgs[i]);
						break;
					}
					if(false) {
						System.out.println("학생 정보가 없습니다.");
						break;
					}
				}	
					
			}else if(select == 4) {
				System.out.println("삭제할 학생 번호 입력");
				int id = sc.nextInt();
				boolean flag = false;
				String [] namesCopy = null; 
				int [] numsCopy = null;
				int [] korsCopy = null;
				int [] engsCopy = null;
				int [] mathsCopy = null;
				int [] totalsCopy = null;
				int [] avgsCopy = null;
				int i = 0;
				for(i = 0 ; i<students; i++) {
					if(id == nums[i]) {
						flag = !flag;
						break;
					}
				}
				if(flag) {
					namesCopy = new String[students-1]; 
					numsCopy = new int[students-1];
					korsCopy = new int[students-1];
					engsCopy = new int[students-1];
					mathsCopy = new int[students-1];
					totalsCopy = new int[students-1];
					avgsCopy = new int[students-1];
					int index = 0;
					for(int j = 0; j<students; j++) {
						if(j==i) {
							index--;
							continue;
						}
						namesCopy[index]=names[j];
						numsCopy[index]=nums[j];
						korsCopy[index]=kors[j];
						engsCopy[index]=engs[j];
						mathsCopy[index]=maths[j];
						totalsCopy[index]=totals[j];
						avgsCopy[index]=avgs[j];
						index++;
					}
					
					names=namesCopy;
					nums=numsCopy;
					kors=korsCopy;
					engs=engsCopy;
					maths=mathsCopy;
					totals=totalsCopy;
					avgs=avgsCopy;
					
				}else {
					System.out.println("일치하는 학생정보 없음");
				}
			}else if(select == 5) {
				students = students + 1;
				String [] namesCopy = new String [students]; //학생 이름 배열
				int [] numsCopy = new int [students];     //학생 번호 배열 
				int [] korsCopy = new int [students];     //국어 점수 배열
				int [] engsCopy = new int [students];     //수학 점수 배열
				int [] mathsCopy = new int [students];    //영어 점수 배열
				int [] totalsCopy = new int [students];    //총점 배열
				int [] avgsCopy = new int [students];    //평균 배열
				
				for(int i=0;i<students;i++) {
					namesCopy[i]=names[i];
					numsCopy[i]=nums[i];
					korsCopy[i]=kors[i];
					engsCopy[i]=engs[i];
					mathsCopy[i]=maths[i];
					totalsCopy[i]=totals[i];
					avgsCopy[i]=avgs[i];
				}
				
				System.out.println("추가 학생 이름 입력");
				namesCopy[students]=sc.next();
				System.out.println("추가 학생 번호 입력");
				numsCopy[students]=sc.nextInt();
				System.out.println("추가 학생 국어 입력");
				korsCopy[students]=sc.nextInt();
				System.out.println("추가 학생 영어 입력");
				engsCopy[students]=sc.nextInt();
				System.out.println("추가 번째 학생 수학 입력");
				mathsCopy[students]=sc.nextInt();
				totalsCopy[students]=korsCopy[students]+engsCopy[students]+mathsCopy[students];
				avgsCopy[students]=totalsCopy[students]/3;
				
				names=namesCopy;
				nums=numsCopy;
				kors=korsCopy;
				engs=engsCopy;
				maths=mathsCopy;
				totals=totalsCopy;
				avgs=avgsCopy;
				System.out.println("====== 학생 추가 끝 ======");
				
			}else {
				break;
			}
			
				
		}//while문 끝	
				
				
				
			
			
			
	}
		
		
		
}


