package javaMid3.b1331;

import java.util.Scanner;

public class SaleManagerMain {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		boolean run=true;
		while(run) {
			System.out.println("--------------");
			System.out.println("�Ǹŷ����� ������Ʈ");
			System.out.println("--------------");
			System.out.println("1.�Է� |2.��� |3.����");
			System.out.print("����> ");
			
			String choose=sc.next();
			switch(choose){
			case "1": input();  break;
			case "2": output();  break;
			case "3": run=false; break;
			default: System.out.println("�߸��Է�");
			}
		}//end while
		System.out.println("���α׷� ����");
	}//end main

	
	static int sale=0;
	static String pro;
	static String com;
	
	public static void input() {
		System.out.print("���缱��> ");
		
		for(String com:Business.company) {
			com=sc.next();
			
			if(com.equals("����")) {
				System.out.print("��ǰ��> ");  //pro
				String pro=sc.next();
				System.out.println(("���������� "+pro+" �Ǹŷ���?"));
				sale=sc.nextInt();
				
				
				
			}else if(com.equals("����")) {
				System.out.print("��ǰ��> ");  
				String pro=sc.nextLine();
				System.out.println(("���������� "+pro+" �Ǹŷ���?"));
				sale=sc.nextInt();
				
			}else if(com.equals("����")) {
				System.out.print("��ǰ��> ");  
				String pro=sc.nextLine();
				System.out.println(("���������� "+pro+" �Ǹŷ���?"));
				sale=sc.nextInt();
				
			}else if(com.equals("����")) {
				System.out.print("��ǰ��> ");  
				String pro=sc.nextLine();
				System.out.println(("�������� "+pro+" �Ǹŷ���?"));
				sale=sc.nextInt();
				
			} else {System.out.println("�ش����簡 ����"); break;
			}
		System.out.println("��� �Է��Ͻðڽ��ϱ�?(y/n)");  //�̰� y �빮�ڵ� ������
		
		for(int i=0;i<Business.company.length;i++) {
			
		}
		for(int i=0;i<accountArr.length; i++) {
			if(accountArr[i]==null) {     //�迭ĭ�� ��������� �ڷ�ֱ�
				accountArr[i]=new Account(account, name, first);
				
				break;
		
	} 
		
	}
	
	public static void output() {
		
		System.out.println("-----------------");
		System.out.println("�� ���纰 �Ǹ� ��Ȳ");
		System.out.println("---------------");
		System.out.println("����� ��ǰ�� ��ǰ���� �Ǹŷ� ������Ȳ");
		System.out.println("----------------------------");
		System.out.println(com+pro+Product.price+sale+(Product.price*sale));
		
	}
}
