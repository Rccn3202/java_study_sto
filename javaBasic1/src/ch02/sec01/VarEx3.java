package ch02.sec01;

import java.util.Scanner;

public class VarEx3 {

	public static void main(String[] args) {
		/* 아래와 같이 입력합니다.
		이름은==> 홍길동
		국어점수==> 100
		영어점수==> 80
		수학점수==> 90
		
		출력화면
		
		-------------------------
		이젠 학교 성적표
		-------------------------
		홍길동 100 80 90 270 90 1등
        -------------------------- */
		
		//키보드 입력하는 스캐너 객체 사용
		
	
		Scanner sc = new Scanner(System.in);
		//입력하기
		
	
		
		
		System.out.print("이름은==>");
		String name = sc.next();
		
		
		System.out.print("국어==>");
		int kor = sc.nextInt();
		
		
		System.out.print("영어==>");
		int eng = sc.nextInt();
		
		
		System.out.print("수학==>");	
		int math = sc.nextInt();
		
		
		
		//합계 계산하기
		int total =kor+eng+math;
		//System.out.println(total);
		
		//평균
		double avg=total/3.0; //만약 소숫점 2까지 표시면 double avg, 단 정수-정수 계산하면 정수값만 나옴. 3을 3.0으로 바꾼다.
		//System.out.printf("%.2f",avg);
		
		
		
		
		System.out.println("-------------------------");
		
		System.out.println("       이젠 학교 성적표      ");
		
		System.out.println("-------------------------");
		
		System.out.println(name+ " "+ kor+" "+eng+" "+math+" "+total+" "+avg+" "+"1등");
		System.out.println("-------------------------");
		
		
		
		
		
		
		
		
		
		
		
		//
		
		
	}

}
