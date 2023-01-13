package javaBasic2.ch05.day2;

import java.util.Scanner;

public class ProjectEx01 {

	public static void main(String[] args) {
		//반찬가게
		//1. 클래스의 필드에 직접 값을 넣어준다.
		Banchan p1=new Banchan(); //메인 메소드
		inputM(p1);//입력담담 호출->static void inputM()으로 간다
		Banchan p2=new Banchan();
		inputM(p2);
		Banchan p3=new Banchan();
		inputM(p3);
		
//		//잘팔린 종류
//		String best=null;
//		//안팔린 종류
//		String worst=null;
		
		//남은 갯수 메소드 호출
		int last=p1.getlast(p1.make,p1.sale);
		
//		
		//출력
		System.out.println("반찬가게");
		System.out.println();
		System.out.println("종류   만든갯수   판매갯수   남은갯수");
		System.out.println(p1.kind+" "+p1.make+" "+p1.sale+" "+p1.last);
		System.out.println(p2.kind+" "+p2.make+" "+p2.sale+" "+p2.last);
		System.out.println(p3.kind+" "+p3.make+" "+p3.sale+" "+p3.last);
		
//		System.out.println("Best "+best);
//		System.out.println("Worst "+worst);
	
		
	} //메인 메소드

	static void inputM(Banchan p1) {
		//입력 담당 메소드
		System.out.println("-------------");
		System.out.println("반찬가게");
		System.out.println("-------------");
		System.out.println();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println();
		System.out.println("종류> ");
		p1.kind=sc1.next();
		System.out.println("만든 갯수> ");
		p1.make=sc1.nextInt();
		System.out.println("판매 갯수> ");
		p1.sale=sc1.nextInt();
		System.out.println("남은 갯수> "+p1.last);
		
	}
	
} //end ClassEx01

class Banchan {
	String kind; //종류
	int make=0;  //만든 갯수
	int sale=0; //판매 갯수
	int last=0;  //남은 갯수
	
	
	//메소드
	String getkind ( String kind ) { //종류 입력받는다, 종류 kind 변수로
		return null; }
	int getmake ( int make ) { //만든 갯수 구한다, 만든갯수 make 변수로
		return make;}

	int getsale ( int sale ) { //판매갯수 구한다
		return sale; }

	int getlast ( int make, int sale ) {  //남은갯수 구한다
		return make-sale;}
	


	String best() {//제일 잘 팔린 종류
		if
		
//		a=sale/make;
//	if(p1>p2) return p1;
//	else if(p2>p3) return p2;
//		return p3;
			
		
		return kind; 
	}
	String worst() { //제일 안팔린 종류
		return null;
	}

	}//class Banchan2

	 
	   
	  
	   
