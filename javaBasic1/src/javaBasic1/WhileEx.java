package javaBasic1;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		//제어문
		//while문
//		int n=5;
//		while(n<=10) {
//			//위의 조건이 참이면 이곳을 수행
//			System.out.println(n); //숫자 출력
//			n++; //n=n+1;
//		}//end while

//		int a=10;
//		while(a>=5) {   //참
//		System.out.print(a+ " " );  //10
//		a--; //조건이 끝나야 되니까 언젠가는 거짓이 되게 만들어야 한다.
//		}
		
//		//문제1  1 2 3 4 5 ~10
//		//ME (Correct)
//		int a1=1;
//		while(a1<=10) {
//			System.out.print(a1+ "\t"); // \t: 탭키
//			a1++;
//		}
//		
//		//문제2 0 5 10 15 20 ... 100
//		//ME
//		int a2=0;
//		while(a2<=100 ) {
//		System.out.print(a2+"\t");
//		a2= a2+5;
//		}
		
		//문제3 -100 -50 0 50 100
		int a3=-100;
		while(a3<=100) {
			System.out.print(a3+"\t");
		a3=a3+50;
		}
		
		//문제4 ABCDEF...Z까지 출력
		//생각: A는 유니코드로 65
		char a4='A';//''(문자 한글자)저장용은 char
		while(a4<='Z') {
			System.out.print(a4+ " "); //a4를 char로 정의했기 때문에 66 67 ..로 안찍힘
			a4++;
		}
		//방법2
		char a5='A';
		while(a5<=90) {
			System.out.print(Character.toChars(a5));
			a5++;
		}
		
		
		//학생이름을 3번 반복해서 입력 받고 출력하세요 (몇번째 입력된 이름인지도 표시)
		Scanner sc=new Scanner(System.in);
//		System.out.print("name ");
//		String name=sc.next();
//		System.out.println(name);
//		
//		System.out.print("name ");
//		name=sc.next();
//		System.out.println(name);
//		
//		System.out.print("name ");
//		name=sc.next();
//		System.out.println(name);
			
		//이것을 반복문으로 고치면 1최 처리한 것을 세어주는 변수가 필요함, 그 변수(cnt)가 3이 되면 그만
		//조건문을 무엇으로 할까 고민 ->조건식을 생각cnt 변수가 3이면 끝, 처리할 내용?
		
//		int cnt=1; //갯수 세는 변수
//		String name=null; 
//		while(cnt<=3) {
//			System.out.print("name ");
//			name=sc.next();
//			System.out.println(name);
//			cnt++;
//		}
		//반 인원수 만큼 이름 입력
//		int cnt=1; //갯수 세는 변수
//		int classcnt=14; //반 인원수
//		String name=null; 
//		while(cnt<=classcnt) {
//			System.out.print("name ");
//			name=sc.next();
//			System.out.println(name);
//			cnt++;
//		}
		
		//
		
	}//end main()

}//end class
