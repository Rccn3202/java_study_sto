package javaBasic1;

import java.util.Scanner;



public class conEx {

	public static void main(String[] args) {
		// break�� -����� ��ĭ ������ ������.

		int a=1;
		
		switch(a) {
		case 1: System.out.println("one"); break;
		case 5: System.out.println("five");break;
		case 10: System.out.println("ten"); break;
			default : System.out.println("none");
		}
				
//ȫ�浿- �� �̼���-�ٴ� ������-���� �׿�-��
		Scanner sc=new Scanner(System.in);
		String name = null;
		name=sc.next();
				switch(name) {
				
				case "��" : System.out.println("��"); break;
				case "�̼���" : System.out.println("�ٴ�");break;
				case "������" : System.out.println("����");break;
				default : System.out.println("��");
				}
				
		//if��. ���� 3�� �Է¹޾� ��� ���� �� 90�� �̻��̸� a 
				
//				Scanner sc1=new Scanner(System.in);
//				int 
//				
//						switch(n1) {
//						case a: System.out.println("a");
//						case b:System.out.println("b");
//						default : System.out.println("c");
//						
//						}
				
			//T if ���
				Scanner sc3=new Scanner(System.in);
				int cnt=0; //�Է¹��� ���� ���� �����ִ� ����
				int number1;
				int sum=0;
				while(cnt<3) {
					System.out.print("���� ");
					number1=sc.nextInt();
					sum=sum+number1;
					cnt++;
				}
						System.out.println("\n�հ� "+sum);
						int avg =sum/cnt;
						System.out.println("\n��� "+avg);
						System.out.println("\n���� ���� "+cnt);
						String g=null;
//						if(avg>=90)
//							g="A";
//						else if(avg>=80)
//							g="B";
//							else if(avg>=70)
//								g="C";
//								else
//									g="F";
//						System.out.println("������ "+g);
				//switch ���
				switch(avg/10) {
				case 10: 
				case 9:g="A"; //100���� ��� �ƹ��͵� �Ƚ������ �����ͼ� a����Ѵ�
				case 8:g="B";
				case 7:g="C";
				default:g="F";
				}
		System.out.println("������"+g);
		
	}//end main

}//end class
