package com.iu.array;

import java.util.Scanner;

public class Array_ex3 {

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
		
		int num = 0;
		int students = 0;
		String [] names = new String[students];
		int [] numbers = new int[students];
		int [] kors = new int[students];
		int [] engs = new int[students];
		int [] maths = new int[students];
		int [] totals = new int[students];
		double [] avgs = new double[students];
		
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			System.out.println("학교 성적 프로그램");
			int select = 0;
			System.out.println("1.학생정보입력 2.학생정보조회 3. 학생정보검색 4. 학생정보삭제 5. 학생정보추가 6. 프로그램종료");
			select = sc.nextInt();
		
			if(select==1) {
				System.out.println("학생정보입력");
				System.out.println("학생 수를 입력하세요");
				students = sc.nextInt();
				names = new String[students];
				numbers = new int[students];
				kors = new int[students];
				engs = new int[students];
				maths = new int[students];
				totals = new int[students];
				avgs = new double[students];
				
				for(int i = 0 ; i<students; i++) {
					System.out.println(i+1 + "번 학생 이름 입력");
					names[i] = sc.next();
				}
				for(int i = 0; i<students; i++) {
					System.out.println(i+1 + "번 학생 번호 입력");
					numbers[i] = sc.nextInt();
				}
				for(int i = 0; i<students; i++) {
					System.out.println(i+1 + "번 학생 국어 점수");
					kors[i] = sc.nextInt();
				}
				for(int i = 0; i<students; i++) {
					System.out.println(i+1 + "번 학생 영어 점수");
					engs[i] = sc.nextInt();
				}
				for(int i = 0; i<students; i++) {
					System.out.println(i+1 + "번 학생 수학 점수");
					maths[i] = sc.nextInt();
				}
				for(int i = 0; i<names.length; i++) {
					
					totals[i] = kors[i] + engs[i] + maths[i]; 
				}
				for(int i = 0; i<names.length; i++) {
					
					avgs[i] = totals[i] / 3.0;
				}
				
				
			}else if(select == 2) {
			
				System.out.println("학생정보조회");
				for(int i = 0; i<students; i++) {
					System.out.println(i+1 + "번 학생 정보");
					System.out.println("번호 : " +  numbers[i]);
					System.out.println("국어점수 : " +  kors[i]);
					System.out.println("영어점수 : " +  engs[i]);
					System.out.println("수학점수 : " +  maths[i]);
					System.out.println("총 점수 : " +  totals[i]);
					System.out.println("평균 점수 : " +  avgs[i]);
				}
			}else if(select == 3) {
				System.out.println("학생정보검색");
				System.out.println("검색할 학생의 번호를 입력하세요");
				num = sc.nextInt();
				for(int i = 0 ; i<students; i++) {
					if(num == numbers[i]) {
						System.out.println(num + "번 학생정보");
						System.out.println("번호 : " +  numbers[i]);
						System.out.println("국어점수 : " +  kors[i]);
						System.out.println("영어점수 : " +  engs[i]);
						System.out.println("수학점수 : " +  maths[i]);
						System.out.println("총 점수 : " +  totals[i]);
						System.out.println("평균 점수 : " +  avgs[i]);
					}else if(num > numbers[i]) {
						System.out.println("없는 번호입니다.");
					}
				}
			
				
			
			}else if(select == 4) {
				System.out.println("학생정보삭제");
				System.out.println("삭제할 학생의 번호를 입력하세요 ");
				num = sc.nextInt();
				for(int i = 0; i<students; i++) {
					if(numbers[i] == num) {
						int num1 = numbers[i];
						String name1 = names[i];
						int kor1 = kors[i];
						int eng1 = engs[i];
						int math1 = maths[i];
						int total1 = totals[i];
						double avg1 = avgs[i];
					}
				}
				students = students -1 ;
				String [] names1 = new String[students];
				int [] numbers1 = new int[students];
				int [] kors1 = new int[students];
				int [] engs1 = new int[students];
				int [] maths1 = new int[students];
				int [] totals1 = new int[students];
				double [] avgs1 = new double[students];
				
				for(int i=0 ; i<students; i++) {
					names1[i] = names[i]; 
				}
			
				
				
			}else if(select == 5) {
				System.out.println("학생정보 추가");
				System.out.println("학생 이름 입력");
				String name = sc.next();
				System.out.println("학생 번호 입력");
				int number = sc.nextInt();
				System.out.println("학생 국어점수");
				int kor = sc.nextInt();
				System.out.println("학생 영어점수");
				int eng = sc.nextInt();
				System.out.println("학생 수학점수");
				int math = sc.nextInt();
				
				int total = kor + eng + math;
				double avg = total/3.0;
				
				students = students + 1;
				
				names = new String[students];
				numbers = new int[students];
				kors = new int[students];
				engs = new int[students];
				maths = new int[students];
				totals = new int[students];
				avgs = new double[students];
				
				names[students] = name;
				numbers[students] = number;
				kors[students] = kor;
				engs[students] = eng;
				maths[students] = math;
				totals[students] = total;
				avgs[students] = avg;
				
				
			}else if(select == 6) {
				
				System.out.println("프로그램 종료");
				break;
			}else {
				break;
			}
			
		}//while문 끝
		

	}

}
