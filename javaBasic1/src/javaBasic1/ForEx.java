package javaBasic1;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		//���
		//while��
//		int n=5;
//		while(n<=10) {
//			//���� ������ ���̸� �̰��� ����
//			System.out.println(n); //���� ���
//			n++; //n=n+1;
//		}//end while

//		int a=10;
//		while(a>=5) {   //��
//		System.out.print(a+ " " );  //10
//		a--; //������ ������ �Ǵϱ� �������� ������ �ǰ� ������ �Ѵ�.
//		}
		
//		//����1  1 2 3 4 5 ~10
//		//ME (Correct)
//		int a1=1;
//		while(a1<=10) {
//			System.out.print(a1+ "\t"); // \t: ��Ű
//			a1++;
//		}
//		
//		//����2 0 5 10 15 20 ... 100
//		//ME
//		int a2=0;
//		while(a2<=100 ) {
//		System.out.print(a2+"\t");
//		a2= a2+5;
//		}
		
		//����3 -100 -50 0 50 100
		int a3=-100;
		while(a3<=100) {
			System.out.print(a3+"\t");
		a3=a3+50;
		}
		
		//����4 ABCDEF...Z���� ���
		//����: A�� �����ڵ�� 65
		char a4='A';//''(���� �ѱ���)������� char
		while(a4<='Z') {
			System.out.print(a4+ " "); //a4�� char�� �����߱� ������ 66 67 ..�� ������
			a4++;
		}
		//���2
		
		
		//�л��̸��� 3�� �ݺ��ؼ� �Է� �ް� ����ϼ��� (���° �Էµ� �̸������� ǥ��)
		Scanner sc=new Scanner(System.in);
//		System.out.print("name ");
//		String name=sc.next();
//		System.out.println(name);
//		
//		System.out.print("name ");
//		name=sc.next();
//		System.out.println(name);
//		
//		System.out.print("name ");
//		name=sc.next();
//		System.out.println(name);
			
		//�̰��� �ݺ������� ��ġ�� 1�� ó���� ���� �����ִ� ������ �ʿ���, �� ����(cnt)�� 3�� �Ǹ� �׸�
		//���ǹ��� �������� �ұ� ��� ->���ǽ��� ����cnt ������ 3�̸� ��, ó���� ����?
		
//		int cnt=1; //���� ���� ����
//		String name=null; 
//		while(cnt<=3) {
//			System.out.print("name ");
//			name=sc.next();
//			System.out.println(name);
//			cnt++;
//		}
		//�� �ο��� ��ŭ �̸� �Է�
		int cnt=1; //���� ���� ����
		int classcnt=14; //�� �ο���
		String name=null; 
		while(cnt<=classcnt) {
			System.out.print("name ");
			name=sc.next();
			System.out.println(name);
			cnt++;
		}
		
		
	}//end main()

}//end class
