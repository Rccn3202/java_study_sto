package javaBasic1;

import java.util.Scanner;

public class forEX {

	public static void main(String[] args) {

//		for�� ����
//		for(�����ʱⰪ;���ǽ�;������) { //�ʱⰩ->���ǽ�->�ݺ�����->������(���)->���ǽ�->�ݺ�
//			�ݺ��� ����
//		}
		
//		for(int i=1; i<=10; i++) { //int i�� for {}�� ����� �����, �ۿ� �� int i ���� ��
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		
//		for(int i=10;i>=0;i--) {
//			System.out.print(i+ " ");
//		}
//		
//		System.out.println();
//		
//		//��1) 10 20 30 ... 100 ���
//		for(int a1=1; a1<=10; a1++) { //a1=a1+10 �ƴϸ� a1+=10 �̿��� �� ���� 
//			System.out.print(a1+"0 ");
//		}
//		
//		System.out.println();
//		
//		//��2) 1~100���� �� ���ϱ�
//		
//		int sum1=0;
//		int a2=0;
//		for(a2=0;a2<=100 ;a2++ ) {
//			sum1=sum1+a2;   //���⿡ int sum=0;�� �����ϸ� ��� �ٽ� sum�� 0�� ��, �ۿ� ������ �ѹ��� �� �� �ְ� ���� 
//		}
//		System.out.println(sum1);
//		
//		
//		
//		//��3) 0~100���� Ȧ���� �� ���ϱ�, Ȧ���� ���� ���ϱ�
//		//Me
////		int a3=0;
////		int sum2=0;
////		int num1=0;
////		int count=0;
////		for(a3=0;a3<=100;a3++) {
////			if((a3+1)%2==0);
////				sum2=sum2+a3;
////		}
////		for(a3=0;a3<=100;a3++) {	
////			if((a3+1%2)==0){
////			count++;
////			}
////				
////		}
////		System.out.println(sum2);
////		System.out.println(count);
////		System.out.println();
////		
//		//T : sum=sum+odd cnt=cnt+1
//		int sum9=0;
//		int cnt=0;
//		for(int odd=1;odd<100;odd=odd+2) {
//			sum9=sum9+odd;
//			cnt=cnt+1;
//		}
//			System.out.println("Ȧ���� �� "+sum9); //2500
//			System.out.println("����"+cnt); //50
//		
//		
			
		
		//��4) 1~100���� ����ϵ� 1�ٿ� 10���� ����ϱ�
			//ME : 1�ٿ� 10���� ��� ����
//		int a4=0;
//		int b4=0;
//		for(a4=1;a4<=100;a4++) {
//			System.out.print(a4+" ");
//			for(b4=0;b4<=10;b4++) {
//			if(b4%10==0);{
//			}
//		}
//		}
//		
		
			//T1. ������ 10���� ��� �ٹٲ� ,���ڼ��� cnt ���� �ʿ���.
//			int a4=0;
//			int cnt2=0;
//			for(a4=1;a4<=100;a4++) {
//				System.out.print(a4+" ");
//				cnt2++;
//				if(cnt2==10) { //if�� �� �� ī��Ʈ�ϱ�, �ٹٲٱ�, ī��Ʈ �ٽ� 0 �����)
//				System.out.println();
//				cnt=0;
//				}
//			}
//			
//			System.out.println();
//			
//			//T2. 10�� ����� �� �ٹٲ�
//			int i9=0;
//			if(i9%10==0) {
//				System.out.println();
//			}
//			int a10=14;
//			System.out.println(a10 % 10==0);
			
		//T ���� 4�� ī�� ����
			
		
		//��5)(while�� Ǯ� ��)�Ʒ��� ���� ����غ��� (12345)�� �Է��� ����
		/*���ȭ��
		 *���� �Է��ϼ��� (��: 12345) => 12345
		 *sum=5number = 12345
		 *sum = 9 number = 1234
		 *...
		 * 
		 */
			
		//ME
//			System.out.println("���ȭ��");
//			Scanner sc5=new Scanner(System.in);
//			System.out.println("���� �Է��ϼ��� ");
//			
//			int b7=Integer.MAX_VALUE;
//			String n9=String.valueOf(b7);
//			System.out.println(b7); //���ڸ� ���ڷ� ��ȯ
//			const b9=b7
//			const b8=b7.substring(0,str.length -1);
//			
			
//			n9=n9.substring(0,n9.length() -1);
//			System.out.println(n9);
			
			
//			int num =sc5.nextInt();
//			
//			while(num>1) {
				
//			}
			
		//T 
//			System.out.println("���ȭ��"); //���ȭ�� ����
//			Scanner sc3=new Scanner(System.in); //�Է��غ�
//			System.out.print("���� �Է��ϼ��� ");
//			int num7 =sc3.nextInt();
//			//sum99������ 5 �־��ֱ� 12345-12340=5 1234*10..ī�� ����
//			System.out.println(num7);
//			
//			int num8=num7/10;
//			System.out.println(num8);
//			int s=num8-num7;
//			System.out.println(s);
		
		
		//��6(dowhile�� ����)
		//���ڸ� ��� �Է¹޴´�. 0�� �Է��ϸ� ���ݱ��� �Է��� ���ڸ� ��� ���� ���� ����Ѵ�.
		//�ݺ���() �հ踦 ���� ���ڸ� �Է��ϼ���(�������� 0�� �Է�)
//		100 //(�Է¼�)
//		200 //(�Է¼�)
//		...
//		0 //(�Է¼�)
//		�հ�:1000 //(���)
		
			//ME
//		Scanner a6=new Scanner(System.in);
//		String n1=null;
//		int sum6 = 0;
//		int b=0;
//		
//		do {
//			System.out.print("����> ");
//			n1 = a6.next();   //�̰Ÿ� nextInt�� ������ integer �ʿ� ����
//			b=Integer.parseInt(n1); 
//			sum6=sum6+b;
//		} while(! n1.equals("0")); //(n6 !=0) �� ��
//		
//		System.out.println("�հ�: "+sum6);
//		
		//T
		Scanner a6=new Scanner(System.in);
		String n1=null;
		int sum6 = 0;
		int b=0;
		
		do {
			System.out.print("����> ");
			n1 = a6.nextInt(); 
			sum6=sum6+b;
		} while(! n1.equals("0")); //(n6 !=0) �� ��
		
		System.out.println("�հ�: "+sum6);

		
		
	} //end main
} //end class
