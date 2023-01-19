package javaBasic3.ch06.day01;

import java.io.InputStream;
import java.util.Scanner;

public class BookPj {
	Scanner sc=Scanner(System.in);
	public static void main(String[] args) {
		// 
		System.out.println("도서관리 프로그림");
		System.out.println("로그인 화면");
		System.out.println("사서ID> ");
		String ID=sc.next();
		
		boolean ID=null;
		
		if(ID.equals("asdf")) {
			
		}
		System.out.println("패스워드> ");
		
		
	}
	private Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}


}


/*
String librarian; //사서
      int libId; //사서 아이디
      int libPwd; //사서 비번
      
      String mainEvent; //기존 행사
      String addEvent; //행사 추가
      int menu; //메뉴선택
      
      String bookName; //책이름
      String bookPos; //
      String bookAuthor;
      String bookState; //책상태   bookOut; 대출중  / bookIn; 대출X
      
      String member; //회원
      int duedate; //반납일
      int overdate; //연체일
      
      String bookPop; //인기도서


*/