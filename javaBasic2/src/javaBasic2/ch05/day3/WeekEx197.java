package javaBasic2.ch05.day3;

import java.util.Calendar;

public class WeekEx197 {

	public static void main(String[] args) {
		// 열거형 사용하기
		Week today=null; //today 변수
		Calendar cal =Calendar.getInstance(); //Calender 유틸리티-도와주는 패키지, 달력관련 클래스 사용할 수 있다.
		int week=cal.get(Calendar.DAY_OF_WEEK); //오늘날짜의 요일을 숫자료 반환
		System.out.println(week); //4 --->나라별로 요일 이름이 다르므로 숫자로 표현함 일요일은 1
		
		today=Week.SUNDAY; //Enum Week에 쓰여있는 sunday
		System.out.println(today); //열거형 enum week에 들어있는 sunday 넣는다
		
		today=Week.WEDNESDAY;
		System.out.println(today);
		
		if(week==4) {
			today=Week.WEDNESDAY;
			System.out.println(today);
		}
		
		//토요일은 외식하는 날
		if(week==7) {
			System.out.println("외식하는 날");
		today=Week.SATURDAY;
			if(today == Week.SATURDAY) {
			System.out.println("외식하는 날");
			
			LoginResult loginR = null;
			
			loginR=LoginResult.LOGIN_SUCCESS;
			loginR=LoginResult.LOGIN_FAILED;
			
			
			
			}
		}
		
		
		
		
	}

}
