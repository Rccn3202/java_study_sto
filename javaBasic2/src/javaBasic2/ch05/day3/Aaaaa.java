package javaBasic2.ch05.day3;

import java.util.Scanner;

public class Aaaaa {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flage =true;
		
		int scount=0;
        int scores=0;
		
		 while(flage) {
		 System.out.println("--------------------------------------------------");
         System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
         System.out.println("--------------------------------------------------");
         System.out.print("���� > ");
         String menu=sc.nextLine(); 
        
         	switch(menu) {
         		case "1" : scount=studentCount(); break;
         		case "2" : scores=input(); break;
         		case "3" : jumsulist(); break;
         		case "4" : analysis(); break;
         		case "5" : flage=false; break;
         		default:System.out.println("�޴� �߸� 1~5");
         		}
         
        
		 }

} //end main

	private static void analysis() {
		// TODO Auto-generated method stub
		
	}

	private static void jumsulist() {
		// TODO Auto-generated method stub
		
	}

	private static int input() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int studentCount() {
		System.out.println("�л���> ");
		int scount=sc.nextInt();
		return 0;
	}
}//end class
