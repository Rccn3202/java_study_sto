package ch02.sec01;

import java.util.Scanner;

public class VarEx4 {

	public static void main(String[] args) {
		
		/*
		 * 체질량지수는
		 * 자신의 몸무게(kg)를
		 * 키의 제곱(m)으로 나눈 값입니다.
		 * 입력화면
		 * ----------------------------
		 * 체질량지수를 구하는 프로그램
		 * ----------------------------
		 * 당신의 몸무게는? 50(입력)
		 * 당신의 키는? 160 (입력)
		 * 당신의 성별은? (남:true, 여:false) true
		 * -----------------------
		 * 당신의 체질량 지수는? 000.00입니다.
		 * 
		 * 판단은 하실 수 있는 사람 해보기
		 * 저체중입니다 또는 정상입니다, 과체중,비만입니다.
		 * 
		 * 참고 판단의 기준
		 * 저체중 18.5 미만
		 * 정상 18.5이상~23미만
		 * 과체중 23이상~25.0미만
		 * 비만 25.0 이상
		 */
		
		System.out.println("-----------------------------");
		System.out.println("    체질량지수를 구하는 프로그램    ");
		System.out.println("-----------------------------");
		
		//키보드 입력 받는 객체 Scanner를 사용하기
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 몸무게는? ");
		double weight =sc.nextDouble(); //실수(소수점 표시)는 double아니면 float인데 double이 기본이므로..
		
		System.out.print("당신의 키는? ");
		double height = sc.nextDouble(); //정수 중 기본 int로 씀, 정수 자리에 실수 치면 에러난다(inputmismatch).
		
		//System.out.print("당신의 성별은 (남 true, 여 false) ");
		//boolean gender = sc.nextBoolean();
		
		System.out.println(weight+ " " + height+" ");
		//체질량지수
		double bmi=weight/(height*height);
		System.out.println(bmi);
		
	}
}
		
	
