package javaBasic1

import java.util.Scanner;

public class homework_23016 {

	public static void main(String[] args) {
		
//		//문제1. 숫자 변수에 50을 입력하고 25이상이면 "포인트대상" 아니면 "포인트 대상이 아닙니다"라고 출력하기
//		//숫자변수 int, 삼항연산자 이용
//		int var1 = 50; //숫자변수에 50 입력
//		System.out.println((var1>=25)? "Eligible for point payment":"Ineligible for point payment");
//		//선생님 답안
////		int n=50;
////		if(n>=25)
////			System.out.println("efp");
////		else
////			System.out.println("ine");
////		
//		
//		
//		//문제2. 문자형 변수에 "자바"라고 입력하고 자바가 아니면 "B교실,C교실입니다." 자바이면 "A교실입니다"라고 출력하기
//		//문자형 변수 입력, 삼항연산자 이용, 결과값 출력
//		String var="java";
//		System.out.println(var.equals("java")? "A Class":"BnC Class");
//		//선생님 답안
////		String word="java"
////				if(word.equals("java"))
////					System.out.println("a");
////				else
////					System.out.println("b,c");
//		
//		//문제3. 숫자 2개를 입력 받아서 큰 숫자를 출력하기 삼항연산자 사용하기
//		//숫자변수 int, Scanner 클래스로 콘솔에 입력, 삼항연산자 이용
//		int num1,num2; //숫자 변수 num1,num2 선언
//		Scanner q3 = new Scanner(System.in); //콘솔에서 숫자 입력 받을 q3객체 생성
//		
//		System.out.println("write first number ");
//		num1 = q3.nextInt(); //q3 객체에 입력받은 숫자를 num1에 저장
//		System.out.println("write second number ");
//		num2 = q3.nextInt();
//		System.out.printf("%d ",(num1>num2)? num1:num2); //(삼항연산자)%d(십진수)로 나타내기, num1>num2? 맞으면 : 앞의 것 출력
//
//		
//		System.out.println(" "); //이건 그냥 문제3과 문제4 줄 분리하려고 넣음
//		//선생님 답안
////		String word="java"
//////				if(word.equals("java"))
//////				System.out.println("a");
//////			else
//////				System.out.println("b,c");
////				String result = (word.equals("java"))? "a:b,c";
////		System.out.println(result);
//		
////		Scanner sc=new Scanner(System.in)
////				System.out.print("num1-->");
////		number1=sc.nextInt();
////		System.out.print("num2--->");
////		int number3=sc.nextInt();
////				
////		int maxNumber=(number1>=number2) ? number1:number2;
////		System.out.println(maxNumber);
//		
//		//문제4. 숫자3개를 입력받아서 작은 숫자를 출력하기 삼항연산자 사용하기
//		//숫자변수 int, *int result1를 추가로 규정해서 이용*, 삼항연산자
//		int num3,num4,num5; //숫자 변수 선언
//		int result1; //1차 비교
//		
//		Scanner q4 = new Scanner(System.in); //콘솔에서 숫자 입력 받을 sc객체 생성
//		
//		System.out.println("write first number ");
//		num3 = q4.nextInt(); //sc 객체에 입력받은 숫자를 num1에 저장
//		System.out.println("write second number ");
//		num4 = q4.nextInt();
//		System.out.println("wirte third number ");
//		num5 = q4.nextInt();
//
//		result1 = (num3>num4)? num3:num4; //n3과 n4 비교 후 저장
//		int result2 = (num5>result1)? num5:result1; //result1과 num5 비교, 저장
//		System.out.println(result2); //결과 출력
//		
		//선생님 답안
//		Scanner sc=new Scanner(System.in);
//				
//		System.out.print("num1-->");
//		number1=sc.nextInt();
//		System.out.print("num2--->");
//		number2=sc.nextInt();
//		System.out.print("num3--->");
//		int number3=sc.nextInt();
//				
//		maxNumber=(number1>=number2) ? number1:number2;
//		maxNumber =(maxNumber>=number3) ? maxNumber:number3;
//		System.out.println(maxNumber);

		
		////문제 숫자3개를 입력받아서 중간 숫자를 출력하기 /
		//maxNumber MinNumber 둘다 아니면 중간 숫자
		Scanner sc=new Scanner(System.in);
		
				
				System.out.print("num1-->");
				int number1=sc.nextInt();
				System.out.print("num2--->");
				int number2=sc.nextInt();
				System.out.print("num3--->");
				int number3=sc.nextInt();
				
				
				int maxNumber=(number1>=number2) ? number1:number2;
				maxNumber =(maxNumber>=number3) ? maxNumber:number3;
				System.out.println(maxNumber);
				
				int minNumber=(number1<=number2) ? number1:number2;
				minNumber =(minNumber<=number3) ? minNumber:number3;
				System.out.println(minNumber);
				
				
						
				
		
		
		
		
	}

}

