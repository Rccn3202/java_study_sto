package javaBasic1;

import java.util.Scanner;

public class ContinueEx3 {

	public static void main(String[] args) {
		//1~50 //10,20,30 ..���� ����ϰ� �ʹ�
		int a=1;
		for(;a<=50;a++){
			//���1
//			if(a%10!=0)  
//				System.out.print(a+" ");
		if(a%10==0) continue; //a�� 1�̸� �����̴ϱ� ���, a�� 10�̸� continue�� ���� �� �ڵ尡 �ƴ� �ݺ��� ������ �ٽ� �ö�
		System.out.print(a+" ");
		}
		
		System.out.println();
		System.out.println("-----");
		
		
		//100~1 //�հ谡 500, 1000,���� ��)585, 96  �̷������� ���
//		int b=100;
//		int sum1=0;
//		int c=
//		
//		for(;b>=1;b--) {  //100~1
//			sum1=sum1+b;  //100~1 ��
//			if(500<=sum1 && sum1<=1000)
//				System.out.println("��"+sum1+"������"+b); 
		int sum3=0;
		boolean p=false; //500�� �Ѵ� ���� 1���� ����ؾ���, ����Ʈ �ߴ��� üũ�ϴ� ����
		int basu = 500; //
		for(int i=100; i>=0;i--) {
			sum3=sum3+i;
			if(basu%500==0) {
				p=false;
			}
			if(sum3>=basu && !p) {
				System.out.print("�� "+sum3+"���� "+i);
			p=true;		//p�� �ѹ� �������ϱ� ������
			
		}
		}
		
		System.out.println();
		System.out.println("6----");
		
		//6.
		
		for(int a6=1;a6<=5;a6++) {
			
			for(int a7=0;a7<a6;a7++) {
				System.out.print("*");
			}
				System.out.println(); }
				
			
		
		System.out.println();
		System.out.println("----");
		
		
		
		System.out.println((int)(Math.random()*49)+1);
		
		
		
		System.out.println();
		System.out.println("--7---");
		boolean k=null;
		while(k) {
		System.out.println("�޴�");
		
	
		Scanner v1 =new Scanner(System.in);
		System.out.println("����1> ");
		if(v1.equals("1")) {
			System.out.println("�Ϲ�");
		} else if(v1.equals("2")) {
			System.out.println("2��");
		} else if(v1.equals("3")) {
			System.out.println("3��");
		} else if (v1.equals("0")){
		System.out.println("����");	break;
		
		}
		}
			
	
		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println("-----");
		
		
		
	}//end main

}//end class
