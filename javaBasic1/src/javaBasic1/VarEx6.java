package javaBasic1;

import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class VarEx6 {

	public static void main(String[] args) {
		// 이름, 년도 입력 받는다. 나이 출력하시오
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("-----------------");
		 System.out.println("나이 계싼하는 프로그램");
		 System.out.println("-----------------");
		 
		 System.out.print("이름은==> ");
		 String name = sc.next();
		 
		 System.out.print("당신의 태어난 년도는==> " );
		 int birthYear = sc.nextInt();
		 int age = 2023 - birthYear;
	
		 System.out.println("귀하 "+name+"의 나이는 "+age+"세 이십니다.");
		 //조건 나이 0~7살 유아 8~13 어린이 14~19 청소년 20~50 어른 61~노인
		 
	/*	 if(0<=age && age <=7) {
			 System.out.println("유아=>100");
			 System.out.println("지원금 100만원");
		 }
		 else if(8<=age && age <=13 ) {
		 System.out.println("어린이=>50");
		 System.out.println("지원금 50");
		 }
		 else if (14<=age && age <=19) {
		 System.out.println("청소년=>30");
		 System.out.println("지원금 30");
		 }
		 else if(20<=age && age <=60 ) {
		 System.out.println("어른=>-20");
		 System.out.println("20만원 내세요");
		 }
		 else if(61<=age ) {
		 System.out.println("노인=>50");
		 System.out.println("지원금 50");}}
		 
		 //조건 유아인 경우는 지원금 100만원을 받으세요 /어린이 50만원, 노인 30만원
		 */
		 
		 
		 //agetype : 나이별 타입(유아, 어린이,..) subsidy=100 -20 ...//지원금 받는 것+내는 것
		 String ageType=null;  //나이별 타입 null 아직 값을 넣지 않았다
		 int subsidy=0; //지원금

		 if(0<=age && age <=7) {
			 ageType="유아";
			 subsidy=100;
		 } else if(8<=age && age <=13 ) {
			 ageType="어린이";
			 subsidy=50;
		 } else if (14<=age && age <=19) {
			 ageType="청소년";
			 subsidy=20;
		 }else if(20<=age && age <=60 ) {
			 ageType="어른";
			 subsidy= -20;
		 } else if(age>=61 ) {     //마지막은 else if 안하고 else만 해도 됨
			 ageType="노인";
			 subsidy=30;
		 }
		 
		 
		 if(subsidy>=0)
			 System.out.println("111당신은"+ageType+"입니다. 정부지원금 "+subsidy+ " 받으세요");
		 else
			 System.out.println("111당신은"+ageType+"입니다. 정부지원금 "+Math.abs(subsidy)+ " 내세요"); //정수 처리 되어서 20 내세요 라고 나옴

		 //ageType "어른"이면 내세요 라고 출력하게 만들기
//		 if(subsidy=="어른")
//			 System.out.println("222당신은"+ageType+"입니다. 정부지원금 "+subsidy+ " 받으세요");
//		 else
//			 System.out.println("222당신은"+ageType+"입니다. 정부지원금 "+subsidy+ " 내세요");
///틀린문장, 문자열의 같다는 변수명.equals("문자열") 쓴다.
		 if(ageType.equals("어른"))
				 System.out.println("222당신은"+ageType+"입니다. 정부지원금 "+subsidy+ " 내세요");
		 else
				System.out.println("222당신은"+ageType+"입니다. 정부지원금 "+subsidy+ " 받으세요"); //정수 처리 안되서 그냥 -20 내세요 라고 나옴

		 //어른과 노인만 대상 집이 있습니까?
		 //집이 있으면 true 없으면 false
		 //어른이 집이 있는 사람은 10% 더 내고 노인이 집이 있으면 10% 덜 받기
		 
		 
		 ///내가 짜본 것 -문제 있음
//		 if(ageType.equals("어른"))
//	System.out.print("당신은 집이 있습니까 (예 true, 아니오 false) ");
//		boolean home1 = sc.nextBoolean();
//		 if(true)
//			 System.out.println("10% 더 내세요");
//		 if(false)
//			System.out.println("ㅇㅇ");  
//		 
//		if  (ageType.equals("노인"))
// System.out.print("당신은 집이 있습니까 (예 true, 아니오 false) ");
//			boolean home2 = sc.nextBoolean();
//			 if(true)
//				 System.out.println("10% 감면");
//		if(false)
//				System.out.println("ㅇㅇ");  //정수 처리 안되서 그냥 -20 내세요 라고 나옴
//	 
//		 
//	/*	System.out.print("당신의 성별은 (남 true, 여 false) ");
//		boolean gender = sc.nextBoolean();
//		 
//		 boolean home = Boolean.parseBoolean(home); //집 있는지
//			System.out.println(home);
//			if(home)
//				System.out.println("남자");
//			else
//				System.out.println("여자");
//			*/
			 
		 //선생님
		 boolean house=false; //집 유무 변수
		 if(ageType.equals("어른")|| ageType.equals("노인"))
			 System.out.println("집이 있으면 true, 없으면 false 입력해 주세요 ");
		 	house = sc.nextBoolean();
		 	if( ageType.equals("어른") && house) { //어른이고 집이 있으면
		 	subsidy = subsidy + (int) (subsidy * 0.1);
		 	}else if( ageType.equals("노인") && house) //노인이면서 집이 있으면
		 	subsidy = subsidy - (int) (subsidy*0.1);

		 	 if(subsidy>=0)
				 System.out.println("111당신은"+ageType+"입니다. 정부지원금 "+subsidy+ " 받으세요");
			 else
				 System.out.println("111당신은"+ageType+"입니다. 정부지원금 "+Math.abs(subsidy)+ " 내세요"); //정수 처리 되어서 20 내세요 라고 나옴

		 if(ageType.equals("어른"))
					 System.out.println("222당신은"+ageType+"입니다. 정부지원금 "+subsidy+ " 내세요");
			 else
					System.out.println("222당신은"+ageType+"입니다. 정부지원금 "+subsidy+ " 받으세요"); //정수 처리 안되서 그냥 -20 내세요 라고 나옴
 	
		 
	}//end main

}//end class
