package javaBasic2.ch05.day3;

import java.util.Scanner;

public class ArrayEx200 {

	public static void main(String[] args) {
		//200페이지 예제 9번
		
		
		
		Scanner sc=new Scanner(System.in);
		boolean flage=true;
		while(flage ) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 |3. 점수리스트 | 4. 분석 | 5.종료 ");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");			
			String menu=sc.nextLine();   //선택

			switch(menu) {
			case "1" : studentCount(); break;
			case "2" : input(); break;
			case "3" : score(); break;
			case "4" : anly(); break;
			case "5" : flage=false; break;
			default : System.out.println("메뉴 잘못됨 (1~5)");
			}
		};
		
		

		
		
	

	}

	private static void anly() {
		// 분석
		
	}

	private static void score() {
		// 점수리스트
		
	}

	private static void input() {
		// 점수입력
		
	}

	private static void studentCount() {
		// 학생수
		
	}

}
