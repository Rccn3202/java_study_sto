package javaBasic2.ch05.day2;

import java.util.Scanner;

public class ProjectEx01_T {

	public static void main(String[] args) {
		// //��������
		//1. Ŭ������ �ʵ忡 ���� ���� �־��ش�.
		Banchan p1=new Banchan(); //���� �޼ҵ�
		inputM(p1);//�Է´�� ȣ��->static void inputM()���� ����
		Banchan p2=new Banchan();
		inputM(p2);
		Banchan p3=new Banchan();
		inputM(p3);
		
//		//���ȸ� ����
//		String best=null;
//		//���ȸ� ����
//		String worst=null;
		
		//���� ���� �޼ҵ� ȣ��
		int last=p1.getlast(p1.make,p1.sale);
		
//		
		//���
		System.out.println("��������");
		System.out.println();
		System.out.println("����   ���簹��   �ǸŰ���   ��������");
		System.out.println(p1.kind+" "+p1.make+" "+p1.sale+" "+p1.last);
		System.out.println(p2.kind+" "+p2.make+" "+p2.sale+" "+p2.last);
		System.out.println(p3.kind+" "+p3.make+" "+p3.sale+" "+p3.last);
		
//		System.out.println("Best "+best);
//		System.out.println("Worst "+worst);
	
		
	} //���� �޼ҵ�

	static void inputM(Banchan p1) {
		//�Է� ��� �޼ҵ�
		System.out.println("-------------");
		System.out.println("��������");
		System.out.println("-------------");
		System.out.println();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println();
		System.out.println("����> ");
		p1.kind=sc1.next();
		System.out.println("���� ����> ");
		p1.make=sc1.nextInt();
		System.out.println("�Ǹ� ����> ");
		p1.sale=sc1.nextInt();
		System.out.println("���� ����> "+p1.last);
		
	}
	
} //end ClassEx01

class Banchan {
	String kind; //����
	int make=0;  //���� ����
	int sale=0; //�Ǹ� ����
	int last=0;  //���� ����
	
	
	//�޼ҵ�
	String getkind ( String kind ) { //���� �Է¹޴´�, ���� kind ������
		return null; }
	int getmake ( int make ) { //���� ���� ���Ѵ�, ���簹�� make ������
		return make;}

	int getsale ( int sale ) { //�ǸŰ��� ���Ѵ�
		return sale; }

	int getlast ( int make, int sale ) {  //�������� ���Ѵ�
		return make-sale;}
	


	String best() {//���� �� �ȸ� ����
		
//		a=sale/make;
//	if(p1>p2) return p1;
//	else if(p2>p3) return p2;
//		return p3;
			
		
		return kind; 
	}
	String worst() { //���� ���ȸ� ����
		return null;
	}

	}//class Banchan2

	 
	   

	}

}
