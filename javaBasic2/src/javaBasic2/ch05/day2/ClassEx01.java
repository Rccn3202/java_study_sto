package javaBasic2.ch05.day2;

import java.util.Scanner;

public class ClassEx01 {
	// Product product; //�� ������ ���� �ۿ� �������ָ� ���� �޼ҵ� ���� �޼ҵ嵵 ��� ����
	public static void main(String[] args) {
		//ī�� �ڹ� �����ϱ� : ������Ʈ �Ǹ�
		//�ʵ� : �Է��ؾ� �ϴ� �ڷ�(��ǰ��, �ڵ�, ����, ����..)
		//�޼ҵ� : ����( ����ϱ�, ����ϱ� ..)
		
		//1. Ŭ������ �ʵ忡 ���� ���� �־��ش�.
				Product product=new Product(); //���� �޼ҵ�
				
				inputM(product);//�Է´�� ȣ��->static void inputM()���� ����
				
				Product product1=new Product(); //2��° ����
				inputM(product1);
				
				Product product2=new Product(); //3��° ����
				inputM(product2);
	
				//�Ǹűݾ� ���ϱ�
				int salePrice=product.salePriceMethod(product.proPrice, product.proCnt);
				
				//�޼� ���ϱ�
				String attainMent=product.attainMentMethod(salePrice); //�޼��Լ� attainMentMethod
				
				//���
				System.out.println("����ϱ�");
				System.out.println("��ǰ�ڵ�  ��ǰ��  ����  ����  �Ǹűݾ�  �޼�");
				System.out.println(product.proID+" "+product.proName+" "+product.proPrice+" "+product.proCnt+" "+salePrice+" "+attainMent);
				
				salePrice=product1.salePriceMethod(product1.proPrice, product1.proCnt);
				attainMent=product1.attainMentMethod(salePrice); //�޼��Լ� attainMentMethod
				System.out.println(product1.proID+" "+product1.proName+" "+product1.proPrice+" "+product1.proCnt+" "+salePrice+" "+attainMent);

				salePrice=product2.salePriceMethod(product2.proPrice, product2.proCnt);
				attainMent=product2.attainMentMethod(salePrice); //�޼��Լ� attainMentMethod
				System.out.println(product2.proID+" "+product2.proName+" "+product2.proPrice+" "+product2.proCnt+" "+salePrice+" "+attainMent);

				
				
	} //���� �޼ҵ� 

			static void inputM(Product product) {
				//�Է� ��� �޼ҵ�
				System.out.println("-------------");
				System.out.println("������Ʈ �Ǹ�");
				System.out.println("-------------");
				System.out.println();
				
				System.out.println("�Է�ȭ��");
				
				// �Է� ��������? : 3�� �ޱ�
				
				Scanner sc=new Scanner(System.in);
				
//				while(endIf.equals("y")) { //�̷��� �Է��ϸ� yġ�� ����ϰ� �ٸ��Ÿ� �����
				System.out.println();
				System.out.print("��ǰ�ڵ�> ");
				product.proID=sc.next(); //proID�� ��ƾ���. product�� �ּҸ� �ƴϱ� ȣ��.(Product product�� pro-)
										 //1. inputM(product);   static void inputM(Product product)�� ��������
										 //2. ���� �޼ҵ� �ۿ� ���� �����ؼ� �ٰ��� �� �� �ֵ���
				System.out.print("��ǰ��> ");
				product.proName=sc.next();
				System.out.print("����> ");
				product.proPrice=sc.nextInt();
				System.out.print("����> ");
				product.proPrice=sc.nextInt();
				
					
				
			}   
		
		
		
//		int salePrice;//�Ǹűݾ�
//		
//		
//		salePrice=proPrice*proCnt;//�Ǹűݾ�
//		if(salePrice>=100000)//�޼�{
//			System.out.println("����"); 
//		else System.out.println("���"); }
//			
//		
//		System.out.println("�Է�ȭ��");
//		System.out.println("��ǰ�ڵ�> ");
//		System.out.println("��ǰ��> ");
//		System.out.println("����> ");
//		System.out.println("����> ");
//		System.out.println();
//		System.out.println("���ȭ��");
//		System.out.println("");
		
		
		
	}



class Product{
	String proID; //��ǰ�ڵ�
	String proName; //��ǰ��
	int proPrice;//����
	int proCnt;//����
	
	int salePriceMethod(int proPrice, int proCnt) {
		return proPrice*proCnt; //�ϴ� 0���� �� //�Ǹűݾ� ���ϱ�
	}
	String attainMentMethod(int salePrice) {
		if (salePrice>=100000) return "����";
		else return "���";
	 } // �޼� ���ϱ�
}