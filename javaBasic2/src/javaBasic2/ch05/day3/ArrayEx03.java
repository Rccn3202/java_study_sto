package javaBasic2.ch05.day3;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		//2. �迭�� ���� �����ΰ� ���߿� ���� �ֱ�
		int[] a1=new int[5];
		a1[0]=10;
		a1[1]=20;
		a1[2]=50;
		a1[3]=30;
		a1[4]=40;
		
		for(int a:a1) {
			System.out.println(a+" ");
		}
		
		System.out.println("---------");
		
		
		
		//Ű����� ���� 5�� �Է¹ޱ�, ���հ� ���
		//�迭�� a2
		
		Scanner sc=new Scanner(System.in); //1. ��ĳ�� ����
		int[] a2=new int[5]; //2. �迭 ����
		int sum=0; //4. �հ躯�� ����
		for(int i=0; i<a2.length;i++) { //3. 5�� �ݺ��ϹǷ� for�� ���
			System.out.println((i+1)+"��° ����> "); //6.����Ʈ ���
			a2[i]=sc.nextInt();
			sum=sum+a2[i]; //5.�հ� ����
		}
		System.out.println(sum); //6.�հ� ���
		
		 //�Է¹��� ���� �� ���� ū,���� ���� ���
/*		int max; //max�� ���� �� ��
		
		//1 5 2 4 6
		if(a2[0]>a2[1]) {
		  max=a2[0]; //5  
		 if(a2[1]>max) {
			 max=a2[1];	
				} else if (a2[2]>max) {
					max=a2[2];
				} else if (a2[3]>max) {
					max=a2[3];
				} else max=a2[4];
		 System.out.println(max);
		}
		*/
		
		int max=0;
		int min=9999;
		
		for(int i=0;i<a2.length;i++) {   
			if(max<a2[i]) max=a2[i];		//1 5 5 5 6
			if(min>a2[i]) min=a2[i];		//1 1 1 1 1
		}
			System.out.println("�ִ� "+max);
			System.out.println("�ּ� "+min);
			
			//������������ �����ϱ�
			//20 5 3 100 7 ������ 20�� 5 ���ؼ� �ڸ� �ٲ�.->���������� �� ���ڿ� ���ؼ� �����Ŵ� [0]���� ��
			//1ȸ 3 20 5 100 7 0ĭ ���� 0~4 ��
			//2ȸ 3/5 20 100 7 1ĭ ���� 1~4 ��
			//3ȸ 3 5/ 7 20 100
			
			//1 5 7 9 2
		/*	for(int j=0;j<a2.length;j++) {      //[0]
			 for(int i=j;i<a2.length;i++) {		// [0]
				if(min>a2[i]) min=a2[i];
				  //1
			}
			 System.out.println(min); break;	//
			}
			
			System.out.println("----------");
			
			for(int j=0;j<a2.length;j++) {  
				if(min>a2[j]) min=a2[j];
				 System.out.println(min); }  */
			
			//������������ ���� T
			int temp;
			// 1 9 3 4 6
			for(int i=0;i<a2.length;i++) { //i=0 1 2 3 ���ؿ� �ش�Ǵ� �ݺ� /3ȸ ���� [2]�� �����̹Ƿ� 3������ �ʿ� 
				for(int j=i ;j<a2.length;j++) { //�񱳴�� ã��  //j=0
					if(a2[i] > a2[j]) { //1>1  1x9
						temp=a2[i];		//1 
						a2[i]=a2[j];   //1=1
						a2[j]=temp;		//1
					} //if ��
				   }
			  System.out.println((i+1)+"ȸ ����> ");   // 1ȸ 2
				for(int a:a2) {				//1 
					System.out.print(a+" "); // 19346
				    }
			System.out.println();
			}
		
	}//���� ����

}//���� Ŭ����
