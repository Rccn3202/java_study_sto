package javaBasic1;

import java.util.Scanner;

public class ContinueEx2 {

	public static void main(String[] args) {
//		// 1~100 for문으로 출력해보기
//		
//		for(int a=1;a<=100;a++) {
//			System.out.print(a+" ");
//		
//		}
//		System.out.println();
//		for(int i=1;i<=10;i++) {
//			for(int a=1;a<=100;a++) {
//				
//				System.out.print(a+" ");
//	}
//			System.out.println();
//		}		
//		
//		
//		//홍길동 20번 출력
//		for(int c=1;c<=10;c++) {
//			System.out.println();
//		for(int b=1;b<20;b++) {
//			System.out.print("홍길동 ");
//		}
//		}

		//1~50 출력 //1~50 합 구하기 //합이 500 이상이면 a 값은?
		int sum=0;
		int a=1;
		for(;a<=50;a++) {
		System.out.print(a+" ");
		sum=sum+a;
		if(sum>=500) break; }
		System.out.println("합" +sum+ ","+"a"+a);
		
		System.out.println("//1~100출력, 55일 떄 break 탈출");
		
		//1~100출력, 55일 떄 break 탈출
		int b=1;
		for( ;b<=100;b++) { 
		System.out.print(b+ " ");
		if(b==55) break;  //b==50
		}
		
		System.out.println();
		System.out.println("//10,20, ...1000반복하면서 갯수가 20번째 일때 탈출, 출력");
		//10,20, ...1000반복하면서 갯수가 20번째 일때 탈출, 출력
		int c=1;
		for(int d=1;d<=20;d++) {
		for(;c<=10;c++) {
			System.out.print(c+"0 ");
			}	
		
		}
		System.out.println();
		System.out.println("---------------");
		
		//while문 이용 정수로 입력 받다가 0 입력되면 반복 끝
		Scanner c1=new Scanner(System.in);
		String name=null;
		boolean r = true;
		while(r) {    //*while(true) 이용
			System.out.println("입력 ");
			name=c1.next();
			if(name.equals("0")) {   //*if(number==0) break; 이용
				System.out.println("끝"); break;
			}
		}

		//문 do~while문 이용
	     //문자로 단어를 계속 입력 받다가 no 또는 NO가 입력 되면 반복문 끝나기
		do {
			String word =c1.next();
			if(word.equals("no")||word.equals("NO")||word.equals("No"))
			//no 문자를 모두 대문자로 바꿔라, 모두 소문자로 바꿔라 이렇게 하면 no 여러번 안써도 됨
				//문자열을 모두 대문자로 변환 자바 검색
				//if(word.toLowerCase().equals("no")) 이용
				System.out.println("end");
			
		}while(true);
		
		
		
		}//end main
}//end class
