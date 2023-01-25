package bookManagement;

import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year=Calendar.DAY_OF_YEAR;
		int month=Calendar.MONTH;
		int day=Calendar.DATE;
		
		System.out.println("-----------------------------------------");
		System.out.println("사서님 환영합니다.");
		System.out.println("오늘은 "+ year +"년 "+ month+ "월" + day+"일 입니다.");
	}

}
