package javaBasic1;

import java.util.Scanner;

public class ContinueEx2 {

	public static void main(String[] args) {
//		// 1~100 for������ ����غ���
//		
//		for(int a=1;a<=100;a++) {
//			System.out.print(a+" ");
//		
//		}
//		System.out.println();
//		for(int i=1;i<=10;i++) {
//			for(int a=1;a<=100;a++) {
//				
//				System.out.print(a+" ");
//	}
//			System.out.println();
//		}		
//		
//		
//		//ȫ�浿 20�� ���
//		for(int c=1;c<=10;c++) {
//			System.out.println();
//		for(int b=1;b<20;b++) {
//			System.out.print("ȫ�浿 ");
//		}
//		}

		//1~50 ��� //1~50 �� ���ϱ� //���� 500 �̻��̸� a ����?
		int sum=0;
		int a=1;
		for(;a<=50;a++) {
		System.out.print(a+" ");
		sum=sum+a;
		if(sum>=500) break; }
		System.out.println("��" +sum+ ","+"a"+a);
		
		System.out.println("//1~100���, 55�� �� break Ż��");
		
		//1~100���, 55�� �� break Ż��
		int b=1;
		for( ;b<=100;b++) { 
		System.out.print(b+ " ");
		if(b==55) break;  //b==50
		}
		
		System.out.println();
		System.out.println("//10,20, ...1000�ݺ��ϸ鼭 ������ 20��° �϶� Ż��, ���");
		//10,20, ...1000�ݺ��ϸ鼭 ������ 20��° �϶� Ż��, ���
		int c=1;
		for(int d=1;d<=20;d++) {
		for(;c<=10;c++) {
			System.out.print(c+"0 ");
			}	
		
		}
		System.out.println();
		System.out.println("---------------");
		
		//while�� �̿� ������ �Է� �޴ٰ� 0 �ԷµǸ� �ݺ� ��
		Scanner c1=new Scanner(System.in);
		String name=null;
		boolean r = true;
		while(r) {    //*while(true) �̿�
			System.out.println("�Է� ");
			name=c1.next();
			if(name.equals("0")) {   //*if(number==0) break; �̿�
				System.out.println("��"); break;
			}
		}

		//�� do~while�� �̿�
	     //���ڷ� �ܾ ��� �Է� �޴ٰ� no �Ǵ� NO�� �Է� �Ǹ� �ݺ��� ������
		do {
			String word =c1.next();
			if(word.equals("no")||word.equals("NO")||word.equals("No"))
			//no ���ڸ� ��� �빮�ڷ� �ٲ��, ��� �ҹ��ڷ� �ٲ�� �̷��� �ϸ� no ������ �Ƚᵵ ��
				//���ڿ��� ��� �빮�ڷ� ��ȯ �ڹ� �˻�
				//if(word.toLowerCase().equals("no")) �̿�
				System.out.println("end");
			
		}while(true);
		
		
		
		}//end main
}//end class
