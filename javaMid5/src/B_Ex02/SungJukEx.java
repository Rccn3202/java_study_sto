package B_Ex02;

import java.util.Scanner;

public class SungJukEx {
	
static Scanner sc=null;  //��������


static SungJukBusiness sb;

	public static void main(String[] args) {
		SungJuk e1=new ElementarySturdent();
		SungJuk m1=new MiddleSchooler();
		SungJuk h1=new HighSchoolStudent();
		
		sc=new Scanner(System.in);
		sb=new SungJukBusiness();
		 boolean end=false;
		 int menu;
		
		
		do {
			System.out.println("-----------------------------");
			System.out.println("1.�ʵ��б� 2.���б� 3.����б� 4.����");
			System.out.println("------------------------------");
			System.out.println("����> ");
			menu=sc.nextInt();
			switch(menu) {
			case 1: ElementarySturdent(e1);break;
			case 2: MiddleSchooler(m1);break;
			case 3: HighSchoolStudent(h1); break;
			case 4: end=true; break;
			default :System.out.println("�޴��� �߸���(1~3)");
				
			}
		}
		while(!end);  //�ݺ� ����.

	}

	private static void  HighSchoolStudent(SungJuk h1) {
		int menu=0;
		boolean end=false;
				do {
					System.out.println("-------------------");
					System.out.println("����л� �������� ���α׷�");
					System.out.println("--------------------");
					System.out.println("1.�Է� 2.��� 3.����");
				    System.out.println();
					System.out.println("����> ");
					menu=sc.nextInt();
					switch(menu) {
						case 1: sb.input( h1 ); break; 
						case 2: sb.print( h1 ); break;
						case 3:end=true;break;
					}
				} while(!end ); 
		
	}

	private static void MiddleSchooler(SungJuk m1) {
		int menu=0;
		boolean end=false;
				do {
					System.out.println("-------------------");
					System.out.println("���л� �������� ���α׷�");
					System.out.println("--------------------");
					System.out.println("1.�Է� 2.��� 3.����");
				    System.out.println();
					System.out.println("����> ");
					menu=sc.nextInt();
					switch(menu) {
						case 1: sb.input( m1 ); break; 
						case 2: sb.print( m1 ); break;
						case 3:end=true;break;
					}
				} while(!end ); 
	}

	private static void ElementarySturdent(SungJuk e1) {
		// �޴��� ���� �Է� �ޱ�
		int menu=0;
		boolean end=false;
				do {
					System.out.println("-------------------");
					System.out.println("�ʵ��л� �������� ���α׷�");
					System.out.println("--------------------");
					System.out.println("1.�Է� 2.��� 3.����");
				    System.out.println();
					System.out.println("����> ");
					menu=sc.nextInt();
					switch(menu) {
					case 1: sb.input( e1 ); break;  //���������Ͻ�Ŭ������ ��ǲ�̶�� �޼ҵ忡 e1�� �ʵ��б� �ڷ� ������.
					case 2: sb.print( e1 ); break;
					case 3:end=true;break;
					}
					
				} while(!end );  //end�� false
		
	}

}
