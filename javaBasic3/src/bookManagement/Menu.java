package bookManagement;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Menu {

	
		static void run() {   //Q 고정값이라서 static을 사용하는 듯?
			/*
			- 날짜출력 & 행사확인(6번과연결) / 미납도서확인(4번과연결) 
			- 메뉴출력(케이스 나누고 호출명령까지만)
		    int menu; //메뉴선택
			*/
			
			int year=Calendar.DAY_OF_YEAR;
			int month=Calendar.MONTH;
			int day=Calendar.DATE;
			
			System.out.println("-----------------------------------------");
			System.out.println("사서님 환영합니다.");
			System.out.println("오늘은 "+ year +"년 "+ month+ "월" + day+"일 입니다.");
			// 행사 , 미납도서 목록 연결
			// 컴퓨터의 오늘 날짜 출력
			
			//스캐너
			Scanner sc=new Scanner(System.in);
			
			//필드
			int menu;
			boolean flage=true; //Q flage 머임?
			
			//출력(반복)-true fales 반복이므로 while문 사용
			while(flage) {   
			System.out.println("-----------------------------------------");
			System.out.println("1.검색 | 2.신규도서추가 | 3.회원관리 | 4.미납도서확인");
			System.out.println("5.주간인기도서 | 6.행사관리 | 7.종료 ");
			System.out.println("-----------------------------------------");
			System.out.print("메뉴선택>");
			menu=sc.nextInt(); //번호선택
			
			//번호선택 switch문
			switch(menu) {
			case 1 : //search class로 이동
				Search.run();  //Q search class에 run void 으로 간다는 이야기?
				break;	
			case 2 :  //addnew
				AddNew.run();
				break;
			case 3 :  //member
				Member.run();
				break;
			case 4 :   //defaultlist
				DefaultList.run();
				break;
			case 5 :   //bookpop
				BookPop.run();
				break;
			case 6 :   //event
				Event.run();
				break;
			case 7 :  //종료
				System.out.println("프로그램을 종료합니다.");
				flage=false;
				break;
			default :  //번호 다시 입력
				System.out.println("메뉴번호를 다시 입력해주세요.");
			}
			
			
			}
			
	/*		LocalDate now = LocalDate.now(); //Q 이거 local date import해야하는건가? -뭔데..?
			int year = now.getYear();
			int month = now.getMonthValue();
			int day = now.getDayOfMonth();

			System.out.println("-----------------------------------------");
			System.out.println("사서님 환영합니다.");
			System.out.println("오늘은 "+ year +"년 "+ month+ "월" + day+"일 입니다.");
			// 행사 , 미납도서 목록 연결

			Scanner sc = new Scanner(System.in);
			int menu;
			boolean flage = true;
			while (flage) {
			System.out.println("-----------------------------------------");
			System.out.println("1.검색 | 2.신규도서추가 | 3.회원관리 | 4.미납도서확인");
			System.out.println("5.주간인기도서 | 6.행사관리 | 7.종료 ");
			System.out.println("-----------------------------------------");
			System.out.print("메뉴선택>");
			menu= sc.nextInt();
				switch (menu) {
				case 1: 
					Search.run();
					break;

				case 2: 
					AddNew.run();
					break;	

				case 3: 
					Member.run();
					break;

				case 4: 
					DefaultList.run();
					break;

				case 5: 
					BookPop.run();
					break;	

				case 6: 
					Event.run();
					break;	

				case 7: 
					System.out.println("프로그램을 종료합니다.");
					flage = false;
					break;

				default : System.out.println("메뉴번호를 다시 입력해주세요.");	
				}

			}
			*/

	}

}
