package javaBasic1;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		//
//		do {
//			//�ݺ��� ���� ����
//		} while(���ǹ�);
//		
		//��1) 1 2 3 .. 10
		int a=1;
		do {
			System.out.print(a+" ");
			a++;
		} while(a<=10);
		
		
		//��2) 100 95 90 ... 0
		int a2=100;
		do {
			System.out.print(a2+" ");
			a2=a2-5;
		} while(a2>=0);
		
		//��3)1~100������ �� 5050 ���
		System.out.println();
		int a3=0; //��� ���ϴ� ����
		int sum=0; //�հ� ���ϴ� ����
		do {
			a3++;
			sum = sum +a3;
		} while(a3<=100);
		System.out.println(sum);
		
		//��4) 1~100 ¦���� �� ���ϱ�
		System.out.println();
		int a4=1;
		int sum2=0;
		do {
			a4++;
			if(a4%2==0)
			sum=sum+a4;
		} while(a4<=100);
		System.out.println(sum2);
		//��4) Ǯ��
				System.out.println();
				int a5=0;
				int sum3=0;
				do {
					a5=a5+2;
					sum3=sum3+a4;
				} while(a5<=100);
				System.out.println(sum3);
				
		//����5) 1 1 2 3 5 8 13 21 34
		//���� �� ���� ���ؼ� ���� �� �����.
				//ME : 2 4 7 11 16 22 29 37
			int a6=1;
			int a7=-1;
			int sum4=0;
			do {
				a7++;
				a6=a6+a7;
				System.out.print(a6+" ");
				
			} while(a6<=34);
			//T
//			System.out.println();
			int a8=1;
			int b=1;
			int s=a8+b;
//			System.out.print(a8+" "+b+" "+s+" ");
//			a8=b; //1
//			b=s; //2
//			s=a8+b;
//			System.out.print(s+" ");
//			a8=b; //1
//			b=s; //2
//			s=a8+b;
//			System.out.print(s+" ");
//			a8=b; //1
//			b=s; //2
//			s=a8+b;

			System.out.println(s+" ");
			
			//�ݺ������� �����
//			do {
//				a8=b; //1
//				b=s; //2
//				s=a8+b;
//				System.out.print(s+" ");
//				
//			} while(s<=34);
				
				
			//��6)�̸��� �Է� ��� �޾Ƽ� ����ϴµ� �̸��� y�̸� ����
			Scanner sc =new Scanner(System.in);
			String name = null;
			do {
				System.out.println("name ");
				name = sc.next();
				System.out.println(name);
			} while(! name.equals("y"));
			
			
		
	} //end main
} //end class
