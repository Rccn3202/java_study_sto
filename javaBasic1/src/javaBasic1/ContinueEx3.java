package javaBasic1;

import java.util.Scanner;

public class ContinueEx3 {

	public static void main(String[] args) {
		//1~50 //10,20,30 ..���� ����ϰ� �ʹ�
//		int a=1;
//		for(;a<=50;a++){
//			//���1
////			if(a%10!=0)  
////				System.out.print(a+" ");
//		if(a%10==0) continue; //a�� 1�̸� �����̴ϱ� ���, a�� 10�̸� continue�� ���� �� �ڵ尡 �ƴ� �ݺ��� ������ �ٽ� �ö�
//		System.out.print(a+" ");
//		}
//		
//		System.out.println();
//		System.out.println("-----");
//		
//		
//		//100~1 //�հ谡 500, 1000,���� ��)585, 96  �̷������� ���
////		int b=100;
////		int sum1=0;
////		int c=
////		
////		for(;b>=1;b--) {  //100~1
////			sum1=sum1+b;  //100~1 ��
////			if(500<=sum1 && sum1<=1000)
////				System.out.println("��"+sum1+"������"+b); 
//		int sum3=0;
//		boolean p=false; //500�� �Ѵ� ���� 1���� ����ؾ���, ����Ʈ �ߴ��� üũ�ϴ� ����
//		int basu = 500; //
//		for(int i=100; i>=0;i--) {
//			sum3=sum3+i;
//			if(basu%500==0) {
//				p=false;
//			}
//			if(sum3>=basu && !p) {
//				System.out.print("�� "+sum3+"���� "+i);
//			p=true;		//p�� �ѹ� �������ϱ� ������
//			
//		}
//		}
//		
//		System.out.println();
//		System.out.println("6----");
//		
//		//6.
//		
//		for(int a6=1;a6<=5;a6++) {
//			
//			for(int a7=0;a7<a6;a7++) {
//				System.out.print("*");
//			}
//				System.out.println(); }
//				
//			
//		
//		System.out.println();
//		System.out.println("----");
//		
//		
//		
//		System.out.println((int)(Math.random()*49)+1);
//		
//		
//		
//		System.out.println();
//		System.out.println("--7---");
//		
//		while(true) {
//		System.out.println("�޴�");
//		
//	
//		Scanner v1 =new Scanner(System.in);
//		System.out.println("����1> ");
//		if(v1.equals("1")) {
//			System.out.println("�Ϲ�");
//		} else if(v1.equals("2")) {
//			System.out.println("2��");
//		} else if(v1.equals("3")) {
//			System.out.println("3��");
//		} else if (v1.equals("0")){
//		System.out.println("����");	
//		}
//		break;
//		}
		 Scanner sc = new Scanner(System.in);
String choice=null;
String num=null; //���¹�ȣ
int money=0; //�Է¹޴� �� ����
int balance=0; //�ܾ�
int minu=0; //��ݾ�
while(true) {
	System.out.println("----------------------------------------");
    System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4 ��ü | 0 ���� ");
    System.out.println("----------------------------------------");

    System.out.print("����> ");
    choice=sc.nextLine();	

    switch(choice) {
    
    case "1":{System.out.print("���ݾ�> ");
    money=sc.nextInt();
    sc.nextLine();
    balance=balance+money;
    System.out.println("�ܰ�> "+balance);
    
    
    ///�߰�
   
//    if(choice.equals("1")) { //if ���
//    	System.out.println("�����մϴ�");
//    } else if(choice.equals("2"))
    
    System.out.println("�ٸ����� 1/���� 2");
    choice=sc.nextLine();
    
    if(choice.equals("1")) {
    	System.out.println("�ٸ�����");
    }
    else if(choice.equals("2"))
    else  {
    	System.out.println("�߸��Է�");
    }
    
//    switch(choice) {  //switch ���?
//   
//    
//    
//    case "1":{System.out.println();break;
//    }
//    
//    
//    case "2":{System.out.println("����"); break;
//    	
//    }
//    default : System.out.println("�߸� �Է�");
//    
//    }
    }//end switch
    
    
    
    ////�߰�
    
    break;
//    }
    
    case "2":{ System.out.print("��ݾ�> ");
    money=sc.nextInt();
    sc.nextLine();
    if(balance<money) {
    	System.out.println("�ܾ׺���");
    }else {
    	minu=balance-minu;
    }
    break;}
    
    case "3":{System.out.println("�ܰ�> "+balance);
    sc.nextLine();

    break;}
    
    case "4" : { System.out.println("�ܰ�> "+balance); //��ü�� ���¹�ȣ �Է¹ް�(����) ��ü�� �ݾ�
    System.out.println("��ü�� ���¹�ȣ �Է�> ");
    num=sc.nextLine();
    System.out.println("��ü�� �ݾ�> ");
    money=sc.nextInt();
    sc.nextLine();
    if(balance<money) {
    	System.out.println("�ܾ׺���");
    } else {
    	balance=balance-money;
    	System.out.println(num+"���·� "+money+"�ݾ��� ��ü�Ǿ����ϴ�. �ܾ��� "+balance+"�Դϴ�");
    	System.out.println("�ܰ�> "+balance);
    } break;
    }

    case "0": System.out.println("����"); break;
    
    default : System.out.println("�߸� �Է�");

    }
    
    if(choice.equals("0")) break;
}
		
	
		
		
		
		
		
		
		
		
	}//end main

}//end class
