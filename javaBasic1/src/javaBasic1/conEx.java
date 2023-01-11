package javaBasic1;

import java.util.Scanner;



public class conEx {

	public static void main(String[] args) {
		// break문 -제어문의 한칸 앞으로 빠진다.

		int a=1;
		
		switch(a) {
		case 1: System.out.println("one"); break;
		case 5: System.out.println("five");break;
		case 10: System.out.println("ten"); break;
			default : System.out.println("none");
		}
				
//홍길동- 산 이순신-바다 강감찬-평지 그외-집
		Scanner sc=new Scanner(System.in);
		String name = null;
		name=sc.next();
				switch(name) {
				
				case "후" : System.out.println("산"); break;
				case "이순신" : System.out.println("바다");break;
				case "강감찬" : System.out.println("평지");break;
				default : System.out.println("집");
				}
				
		//if문. 숫자 3개 입력받아 평균 구한 후 90점 이상이면 a 
				
//				Scanner sc1=new Scanner(System.in);
//				int 
//				
//						switch(n1) {
//						case a: System.out.println("a");
//						case b:System.out.println("b");
//						default : System.out.println("c");
//						
//						}
				
			//T if 사용
				Scanner sc3=new Scanner(System.in);
				int cnt=0; //입력받은 점수 갯수 세어주는 변수
				int number1;
				int sum=0;
				while(cnt<3) {
					System.out.print("점수 ");
					number1=sc.nextInt();
					sum=sum+number1;
					cnt++;
				}
						System.out.println("\n합계 "+sum);
						int avg =sum/cnt;
						System.out.println("\n평균 "+avg);
						System.out.println("\n과목 갯수 "+cnt);
						String g=null;
//						if(avg>=90)
//							g="A";
//						else if(avg>=80)
//							g="B";
//							else if(avg>=70)
//								g="C";
//								else
//									g="F";
//						System.out.println("학점은 "+g);
				//switch 사용
				switch(avg/10) {
				case 10: 
				case 9:g="A"; //100점인 경우 아무것도 안써놓으면 내려와서 a출력한다
				case 8:g="B";
				case 7:g="C";
				default:g="F";
				}
		System.out.println("학점은"+g);
		
	}//end main

}//end class
