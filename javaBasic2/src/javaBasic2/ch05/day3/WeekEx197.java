package javaBasic2.ch05.day3;

import java.util.Calendar;

public class WeekEx197 {

	public static void main(String[] args) {
		// ������ ����ϱ�
		Week today=null; //today ����
		Calendar cal =Calendar.getInstance(); //Calender ��ƿ��Ƽ-�����ִ� ��Ű��, �޷°��� Ŭ���� ����� �� �ִ�.
		int week=cal.get(Calendar.DAY_OF_WEEK); //���ó�¥�� ������ ���ڷ� ��ȯ
		System.out.println(week); //4 --->���󺰷� ���� �̸��� �ٸ��Ƿ� ���ڷ� ǥ���� �Ͽ����� 1
		
		today=Week.SUNDAY; //Enum Week�� �����ִ� sunday
		System.out.println(today); //������ enum week�� ����ִ� sunday �ִ´�
		
		today=Week.WEDNESDAY;
		System.out.println(today);
		
		if(week==4) {
			today=Week.WEDNESDAY;
			System.out.println(today);
		}
		
		//������� �ܽ��ϴ� ��
		if(week==7) {
			System.out.println("�ܽ��ϴ� ��");
		today=Week.SATURDAY;
			if(today == Week.SATURDAY) {
			System.out.println("�ܽ��ϴ� ��");
			
			LoginResult loginR = null;
			
			loginR=LoginResult.LOGIN_SUCCESS;
			loginR=LoginResult.LOGIN_FAILED;
			
			
			
			}
		}
		
		
		
		
	}

}
