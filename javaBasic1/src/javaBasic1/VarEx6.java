package javaBasic1;

import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class VarEx6 {

	public static void main(String[] args) {
		// �̸�, �⵵ �Է� �޴´�. ���� ����Ͻÿ�
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("-----------------");
		 System.out.println("���� ����ϴ� ���α׷�");
		 System.out.println("-----------------");
		 
		 System.out.print("�̸���==> ");
		 String name = sc.next();
		 
		 System.out.print("����� �¾ �⵵��==> " );
		 int birthYear = sc.nextInt();
		 int age = 2023 - birthYear;
	
		 System.out.println("���� "+name+"�� ���̴� "+age+"�� �̽ʴϴ�.");
		 //���� ���� 0~7�� ���� 8~13 ��� 14~19 û�ҳ� 20~50 � 61~����
		 
	/*	 if(0<=age && age <=7) {
			 System.out.println("����=>100");
			 System.out.println("������ 100����");
		 }
		 else if(8<=age && age <=13 ) {
		 System.out.println("���=>50");
		 System.out.println("������ 50");
		 }
		 else if (14<=age && age <=19) {
		 System.out.println("û�ҳ�=>30");
		 System.out.println("������ 30");
		 }
		 else if(20<=age && age <=60 ) {
		 System.out.println("�=>-20");
		 System.out.println("20���� ������");
		 }
		 else if(61<=age ) {
		 System.out.println("����=>50");
		 System.out.println("������ 50");}}
		 
		 //���� ������ ���� ������ 100������ �������� /��� 50����, ���� 30����
		 */
		 
		 
		 //agetype : ���̺� Ÿ��(����, ���,..) subsidy=100 -20 ...//������ �޴� ��+���� ��
		 String ageType=null;  //���̺� Ÿ�� null ���� ���� ���� �ʾҴ�
		 int subsidy=0; //������

		 if(0<=age && age <=7) {
			 ageType="����";
			 subsidy=100;
		 } else if(8<=age && age <=13 ) {
			 ageType="���";
			 subsidy=50;
		 } else if (14<=age && age <=19) {
			 ageType="û�ҳ�";
			 subsidy=20;
		 }else if(20<=age && age <=60 ) {
			 ageType="�";
			 subsidy= -20;
		 } else if(age>=61 ) {     //�������� else if ���ϰ� else�� �ص� ��
			 ageType="����";
			 subsidy=30;
		 }
		 
		 
		 if(subsidy>=0)
			 System.out.println("111�����"+ageType+"�Դϴ�. ���������� "+subsidy+ " ��������");
		 else
			 System.out.println("111�����"+ageType+"�Դϴ�. ���������� "+Math.abs(subsidy)+ " ������"); //���� ó�� �Ǿ 20 ������ ��� ����

		 //ageType "�"�̸� ������ ��� ����ϰ� �����
//		 if(subsidy=="�")
//			 System.out.println("222�����"+ageType+"�Դϴ�. ���������� "+subsidy+ " ��������");
//		 else
//			 System.out.println("222�����"+ageType+"�Դϴ�. ���������� "+subsidy+ " ������");
///Ʋ������, ���ڿ��� ���ٴ� ������.equals("���ڿ�") ����.
		 if(ageType.equals("�"))
				 System.out.println("222�����"+ageType+"�Դϴ�. ���������� "+subsidy+ " ������");
		 else
				System.out.println("222�����"+ageType+"�Դϴ�. ���������� "+subsidy+ " ��������"); //���� ó�� �ȵǼ� �׳� -20 ������ ��� ����

		 //��� ���θ� ��� ���� �ֽ��ϱ�?
		 //���� ������ true ������ false
		 //��� ���� �ִ� ����� 10% �� ���� ������ ���� ������ 10% �� �ޱ�
		 
		 
		 ///���� ¥�� �� -���� ����
//		 if(ageType.equals("�"))
//	System.out.print("����� ���� �ֽ��ϱ� (�� true, �ƴϿ� false) ");
//		boolean home1 = sc.nextBoolean();
//		 if(true)
//			 System.out.println("10% �� ������");
//		 if(false)
//			System.out.println("����");  
//		 
//		if  (ageType.equals("����"))
// System.out.print("����� ���� �ֽ��ϱ� (�� true, �ƴϿ� false) ");
//			boolean home2 = sc.nextBoolean();
//			 if(true)
//				 System.out.println("10% ����");
//		if(false)
//				System.out.println("����");  //���� ó�� �ȵǼ� �׳� -20 ������ ��� ����
//	 
//		 
//	/*	System.out.print("����� ������ (�� true, �� false) ");
//		boolean gender = sc.nextBoolean();
//		 
//		 boolean home = Boolean.parseBoolean(home); //�� �ִ���
//			System.out.println(home);
//			if(home)
//				System.out.println("����");
//			else
//				System.out.println("����");
//			*/
			 
		 //������
		 boolean house=false; //�� ���� ����
		 if(ageType.equals("�")|| ageType.equals("����"))
			 System.out.println("���� ������ true, ������ false �Է��� �ּ��� ");
		 	house = sc.nextBoolean();
		 	if( ageType.equals("�") && house) { //��̰� ���� ������
		 	subsidy = subsidy + (int) (subsidy * 0.1);
		 	}else if( ageType.equals("����") && house) //�����̸鼭 ���� ������
		 	subsidy = subsidy - (int) (subsidy*0.1);

		 	 if(subsidy>=0)
				 System.out.println("111�����"+ageType+"�Դϴ�. ���������� "+subsidy+ " ��������");
			 else
				 System.out.println("111�����"+ageType+"�Դϴ�. ���������� "+Math.abs(subsidy)+ " ������"); //���� ó�� �Ǿ 20 ������ ��� ����

		 if(ageType.equals("�"))
					 System.out.println("222�����"+ageType+"�Դϴ�. ���������� "+subsidy+ " ������");
			 else
					System.out.println("222�����"+ageType+"�Դϴ�. ���������� "+subsidy+ " ��������"); //���� ó�� �ȵǼ� �׳� -20 ������ ��� ����
 	
		 
	}//end main

}//end class
