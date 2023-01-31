package javaMid3.b1331;

import java.util.Scanner;

public class SaleManagerMain {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		boolean run=true;
		while(run) {
			System.out.println("--------------");
			System.out.println("판매량관리 프로젝트");
			System.out.println("--------------");
			System.out.println("1.입력 |2.출력 |3.종료");
			System.out.print("선택> ");
			
			String choose=sc.next();
			switch(choose){
			case "1": input();  break;
			case "2": output();  break;
			case "3": run=false; break;
			default: System.out.println("잘못입력");
			}
		}//end while
		System.out.println("프로그램 종료");
	}//end main

	
	static int sale=0;
	static String pro;
	static String com;
	
	public static void input() {
		System.out.print("지사선택> ");
		
		for(String com:Business.company) {
			com=sc.next();
			
			if(com.equals("서울")) {
				System.out.print("제품명> ");  //pro
				String pro=sc.next();
				System.out.println(("서울지사의 "+pro+" 판매량은?"));
				sale=sc.nextInt();
				
				
				
			}else if(com.equals("경인")) {
				System.out.print("제품명> ");  
				String pro=sc.nextLine();
				System.out.println(("경인지사의 "+pro+" 판매량은?"));
				sale=sc.nextInt();
				
			}else if(com.equals("강원")) {
				System.out.print("제품명> ");  
				String pro=sc.nextLine();
				System.out.println(("강원지사의 "+pro+" 판매량은?"));
				sale=sc.nextInt();
				
			}else if(com.equals("제주")) {
				System.out.print("제품명> ");  
				String pro=sc.nextLine();
				System.out.println(("제주지사 "+pro+" 판매량은?"));
				sale=sc.nextInt();
				
			} else {System.out.println("해당지사가 없음"); break;
			}
		System.out.println("계속 입력하시겠습니까?(y/n)");  //이거 y 대문자도 먹히게
		
		for(int i=0;i<Business.company.length;i++) {
			
		}
		for(int i=0;i<accountArr.length; i++) {
			if(accountArr[i]==null) {     //배열칸이 비어있으면 자료넣기
				accountArr[i]=new Account(account, name, first);
				
				break;
		
	} 
		
	}
	
	public static void output() {
		
		System.out.println("-----------------");
		System.out.println("각 지사별 판매 현황");
		System.out.println("---------------");
		System.out.println("지사명 제품명 제품가격 판매량 매출현황");
		System.out.println("----------------------------");
		System.out.println(com+pro+Product.price+sale+(Product.price*sale));
		
	}
}
