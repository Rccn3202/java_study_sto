package bookManagement;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Menu {

	
		static void run() {   //Q �������̶� static�� ����ϴ� ��?
			/*
			- ��¥��� & ���Ȯ��(6��������) / �̳�����Ȯ��(4��������) 
			- �޴����(���̽� ������ ȣ���ɱ�����)
		    int menu; //�޴�����
			*/
			
			int year=Calendar.DAY_OF_YEAR;
			int month=Calendar.MONTH;
			int day=Calendar.DATE;
			
			System.out.println("-----------------------------------------");
			System.out.println("�缭�� ȯ���մϴ�.");
			System.out.println("������ "+ year +"�� "+ month+ "��" + day+"�� �Դϴ�.");
			// ��� , �̳����� ��� ����
			// ��ǻ���� ���� ��¥ ���
			
			//��ĳ��
			Scanner sc=new Scanner(System.in);
			
			//�ʵ�
			int menu;
			boolean flage=true; //Q flage ����?
			
			//���(�ݺ�)-true fales �ݺ��̹Ƿ� while�� ���
			while(flage) {   
			System.out.println("-----------------------------------------");
			System.out.println("1.�˻� | 2.�űԵ����߰� | 3.ȸ������ | 4.�̳�����Ȯ��");
			System.out.println("5.�ְ��α⵵�� | 6.������ | 7.���� ");
			System.out.println("-----------------------------------------");
			System.out.print("�޴�����>");
			menu=sc.nextInt(); //��ȣ����
			
			//��ȣ���� switch��
			switch(menu) {
			case 1 : //search class�� �̵�
				Search.run();  //Q search class�� run void ���� ���ٴ� �̾߱�?
				break;	
			case 2 :  //addnew
				AddNew.run();
				break;
			case 3 :  //member
				Member.run();
				break;
			case 4 :   //defaultlist
				DefaultList.run();
				break;
			case 5 :   //bookpop
				BookPop.run();
				break;
			case 6 :   //event
				Event.run();
				break;
			case 7 :  //����
				System.out.println("���α׷��� �����մϴ�.");
				flage=false;
				break;
			default :  //��ȣ �ٽ� �Է�
				System.out.println("�޴���ȣ�� �ٽ� �Է����ּ���.");
			}
			
			
			}
			
	/*		LocalDate now = LocalDate.now(); //Q �̰� local date import�ؾ��ϴ°ǰ�? -����..?
			int year = now.getYear();
			int month = now.getMonthValue();
			int day = now.getDayOfMonth();

			System.out.println("-----------------------------------------");
			System.out.println("�缭�� ȯ���մϴ�.");
			System.out.println("������ "+ year +"�� "+ month+ "��" + day+"�� �Դϴ�.");
			// ��� , �̳����� ��� ����

			Scanner sc = new Scanner(System.in);
			int menu;
			boolean flage = true;
			while (flage) {
			System.out.println("-----------------------------------------");
			System.out.println("1.�˻� | 2.�űԵ����߰� | 3.ȸ������ | 4.�̳�����Ȯ��");
			System.out.println("5.�ְ��α⵵�� | 6.������ | 7.���� ");
			System.out.println("-----------------------------------------");
			System.out.print("�޴�����>");
			menu= sc.nextInt();
				switch (menu) {
				case 1: 
					Search.run();
					break;

				case 2: 
					AddNew.run();
					break;	

				case 3: 
					Member.run();
					break;

				case 4: 
					DefaultList.run();
					break;

				case 5: 
					BookPop.run();
					break;	

				case 6: 
					Event.run();
					break;	

				case 7: 
					System.out.println("���α׷��� �����մϴ�.");
					flage = false;
					break;

				default : System.out.println("�޴���ȣ�� �ٽ� �Է����ּ���.");	
				}

			}
			*/

	}

}
