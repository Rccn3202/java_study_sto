package B_Ex02;

import java.util.Scanner;

public class SungJukEx {
	
static Scanner sc=null;  //전역변수


static SungJukBusiness sb;

	public static void main(String[] args) {
		SungJuk e1=new ElementarySturdent();
		SungJuk m1=new MiddleSchooler();
		SungJuk h1=new HighSchoolStudent();
		
		sc=new Scanner(System.in);
		sb=new SungJukBusiness();
		 boolean end=false;
		 int menu;
		
		
		do {
			System.out.println("-----------------------------");
			System.out.println("1.초등학교 2.중학교 3.고등학교 4.종료");
			System.out.println("------------------------------");
			System.out.println("선택> ");
			menu=sc.nextInt();
			switch(menu) {
			case 1: ElementarySturdent(e1);break;
			case 2: MiddleSchooler(m1);break;
			case 3: HighSchoolStudent(h1); break;
			case 4: end=true; break;
			default :System.out.println("메뉴가 잘못됨(1~3)");
				
			}
		}
		while(!end);  //반복 돈다.

	}

	private static void  HighSchoolStudent(SungJuk h1) {
		int menu=0;
		boolean end=false;
				do {
					System.out.println("-------------------");
					System.out.println("고등학생 성적관리 프로그램");
					System.out.println("--------------------");
					System.out.println("1.입력 2.출력 3.메인");
				    System.out.println();
					System.out.println("선택> ");
					menu=sc.nextInt();
					switch(menu) {
						case 1: sb.input( h1 ); break; 
						case 2: sb.print( h1 ); break;
						case 3:end=true;break;
					}
				} while(!end ); 
		
	}

	private static void MiddleSchooler(SungJuk m1) {
		int menu=0;
		boolean end=false;
				do {
					System.out.println("-------------------");
					System.out.println("중학생 성적관리 프로그램");
					System.out.println("--------------------");
					System.out.println("1.입력 2.출력 3.메인");
				    System.out.println();
					System.out.println("선택> ");
					menu=sc.nextInt();
					switch(menu) {
						case 1: sb.input( m1 ); break; 
						case 2: sb.print( m1 ); break;
						case 3:end=true;break;
					}
				} while(!end ); 
	}

	private static void ElementarySturdent(SungJuk e1) {
		// 메뉴를 띄우고 입력 받기
		int menu=0;
		boolean end=false;
				do {
					System.out.println("-------------------");
					System.out.println("초등학생 성적관리 프로그램");
					System.out.println("--------------------");
					System.out.println("1.입력 2.출력 3.메인");
				    System.out.println();
					System.out.println("선택> ");
					menu=sc.nextInt();
					switch(menu) {
					case 1: sb.input( e1 ); break;  //성적비지니스클래스의 인풋이라는 메소드에 e1에 초등학교 자료 보낸다.
					case 2: sb.print( e1 ); break;
					case 3:end=true;break;
					}
					
				} while(!end );  //end가 false
		
	}

}
