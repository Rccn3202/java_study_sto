package javaBasic2.ch05.day2;

import java.util.Scanner;

public class ClassEx01 {
	// Product product; //이 변수를 메인 밖에 설정해주면 메인 메소드 외의 메소드도 사용 가능
	public static void main(String[] args) {
		//카페 자바 연습하기 : 선물세트 판매
		//필드 : 입력해야 하는 자료(상품명, 코드, 가격, 갯수..)
		//메소드 : 동작( 출력하기, 계산하기 ..)
		
		//1. 클래스의 필드에 직접 값을 넣어준다.
				Product product=new Product(); //메인 메소드
				
				inputM(product);//입력담담 호출->static void inputM()으로 간다
				
				Product product1=new Product(); //2번째 실행
				inputM(product1);
				
				Product product2=new Product(); //3번째 실행
				inputM(product2);
	
				//판매금액 구하기
				int salePrice=product.salePriceMethod(product.proPrice, product.proCnt);
				
				//달성 구하기
				String attainMent=product.attainMentMethod(salePrice); //달성함수 attainMentMethod
				
				//출력
				System.out.println("출력하기");
				System.out.println("상품코드  상품명  가격  갯수  판매금액  달성");
				System.out.println(product.proID+" "+product.proName+" "+product.proPrice+" "+product.proCnt+" "+salePrice+" "+attainMent);
				
				salePrice=product1.salePriceMethod(product1.proPrice, product1.proCnt);
				attainMent=product1.attainMentMethod(salePrice); //달성함수 attainMentMethod
				System.out.println(product1.proID+" "+product1.proName+" "+product1.proPrice+" "+product1.proCnt+" "+salePrice+" "+attainMent);

				salePrice=product2.salePriceMethod(product2.proPrice, product2.proCnt);
				attainMent=product2.attainMentMethod(salePrice); //달성함수 attainMentMethod
				System.out.println(product2.proID+" "+product2.proName+" "+product2.proPrice+" "+product2.proCnt+" "+salePrice+" "+attainMent);

				
				
	} //메인 메소드 

			static void inputM(Product product) {
				//입력 담당 메소드
				System.out.println("-------------");
				System.out.println("선물세트 판매");
				System.out.println("-------------");
				System.out.println();
				
				System.out.println("입력화면");
				
				// 입력 언제까지? : 3개 받기
				
				Scanner sc=new Scanner(System.in);
				
//				while(endIf.equals("y")) { //이렇게 입력하면 y치면 계속하고 다른거면 종료됨
				System.out.println();
				System.out.print("상품코드> ");
				product.proID=sc.next(); //proID에 담아야함. product가 주소를 아니까 호출.(Product product의 pro-)
										 //1. inputM(product);   static void inputM(Product product)로 전달전달
										 //2. 메인 메소드 밖에 변수 선언해서 다같이 쓸 수 있도록
				System.out.print("상품명> ");
				product.proName=sc.next();
				System.out.print("가격> ");
				product.proPrice=sc.nextInt();
				System.out.print("갯수> ");
				product.proPrice=sc.nextInt();
				
					
				
			}   
		
		
		
//		int salePrice;//판매금액
//		
//		
//		salePrice=proPrice*proCnt;//판매금액
//		if(salePrice>=100000)//달성{
//			System.out.println("잘함"); 
//		else System.out.println("노력"); }
//			
//		
//		System.out.println("입력화면");
//		System.out.println("상품코드> ");
//		System.out.println("상품명> ");
//		System.out.println("가격> ");
//		System.out.println("갯수> ");
//		System.out.println();
//		System.out.println("출력화면");
//		System.out.println("");
		
		
		
	}



class Product{
	String proID; //상품코드
	String proName; //상품명
	int proPrice;//가격
	int proCnt;//개수
	
	int salePriceMethod(int proPrice, int proCnt) {
		return proPrice*proCnt; //일단 0으로 씀 //판매금액 구하기
	}
	String attainMentMethod(int salePrice) {
		if (salePrice>=100000) return "잘함";
		else return "노력";
	 } // 달성 구하기
}