package javaBasic2.ch05.day3;

import java.util.Scanner;

public class Aaaaa {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flage =true;
		
		int scount=0;
        int scores=0;
		
		 while(flage) {
		 System.out.println("--------------------------------------------------");
         System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
         System.out.println("--------------------------------------------------");
         System.out.print("선택 > ");
         String menu=sc.nextLine(); 
        
         	switch(menu) {
         		case "1" : scount=studentCount(); break;
         		case "2" : scores=input(); break;
         		case "3" : jumsulist(); break;
         		case "4" : analysis(); break;
         		case "5" : flage=false; break;
         		default:System.out.println("메뉴 잘못 1~5");
         		}
         
        
		 }

} //end main

	private static void analysis() {
		// TODO Auto-generated method stub
		
	}

	private static void jumsulist() {
		// TODO Auto-generated method stub
		
	}

	private static int input() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int studentCount() {
		System.out.println("학생수> ");
		int scount=sc.nextInt();
		return 0;
	}
}//end class
