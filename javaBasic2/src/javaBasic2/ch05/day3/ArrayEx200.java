package javaBasic2.ch05.day3;

import java.util.Scanner;

public class ArrayEx200 {

	public static void main(String[] args) {
		//200������ ���� 9��
		
		
		
		Scanner sc=new Scanner(System.in);
		boolean flage=true;
		while(flage ) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. �л��� | 2. �����Է� |3. ��������Ʈ | 4. �м� | 5.���� ");
			System.out.println("-------------------------------------------------");
			System.out.print("����> ");			
			String menu=sc.nextLine();   //����

			switch(menu) {
			case "1" : studentCount(); break;
			case "2" : input(); break;
			case "3" : score(); break;
			case "4" : anly(); break;
			case "5" : flage=false; break;
			default : System.out.println("�޴� �߸��� (1~5)");
			}
		};
		
		

		
		
	

	}

	private static void anly() {
		// �м�
		
	}

	private static void score() {
		// ��������Ʈ
		
	}

	private static void input() {
		// �����Է�
		
	}

	private static void studentCount() {
		// �л���
		
	}

}
