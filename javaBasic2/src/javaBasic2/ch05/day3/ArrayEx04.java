package javaBasic2.ch05.day3;

public class ArrayEx04 {

	public static void main(String[] args) {
		// p165
		int[] a1;
//		a1=10; /X : /Type mismatch: cannot convert from int to int[] 
//		a1=null; /O
		
		//�迭�ȿ� �� �ֱ�
		//1. �ʱⰪ���� �ֱ�
		int[] a3= {1,2,3,4,5};
		System.out.println(a3[3]); //4 ���
		//�ݺ������� 1~5 ���
		for(int i=0;i<5;i++) {   //i=0,1,2,3,4,5
			System.out.print(a3[i]+" ");
		}
		System.out.println();
		System.out.println("----------------");
		
		//�ٸ� ������� 1~5 ���
		System.out.println("�迭�� ����(ũ��)"+a3.length);  //length�� ()�� ������� �޼ҵ� �ƴϰ� �ʵ�, �迭�� ���� ũ��
		for(int j=0;j<a3.length;j++) {   //i=0,1,2,3,4,5
			System.out.print(a3[j]+" ");
		}
		System.out.println();
		System.out.println("�迭�� ũ��"+a3.length);
		//���� for(�ڷ��� ���� : �迭��) ---------------->�ξ� ����
		//�迭�� �ִ� ���ҵ��� �Ѱ��� ������ �տ� ������ �ִ´�.
		//���������� ������ ������ �־��ָ� ���̻� �ݺ����� �ʴ´�.
		for(int a:a3) {
			System.out.print(a+" ");
		}
		
		
		//��) 1.1 3.3 5.4 10.3 8.9 11.23 �迭�� �ֱ�
		double[] a4= {1.1,3.3,5.4,10.3, 8.9 ,11.23};
		System.out.println(a4[3]-a4[1]);
		System.out.println("�������"+a4.length);
		//��ü ���
		System.out.println("��ü"+a4.length);
		for(int k=0;k<a4.length;k++) {
			System.out.println(a4[k]+" ");
		}
		//���� for
		for(double k1:a4) {
			System.out.println(k1+" ");
		}
		
		System.out.println();
		
		//��2) 
		boolean[] a5= {true,false,true,false,true};
		System.out.println(a5[4]);
		System.out.println("��ü"+a5.length);
		for(int l=0;l<a5.length;l++) {
			System.out.println(a5[l]);
		}
		for(boolean a:a5) {
			System.out.println(a);   //a�� for ���� ����� �������Ƿ� a �� �ᵵ ��
		}
		
		System.out.println();
		
		//��3
		String[] a6= {"���","���","������","����"};
		System.out.println(a6[1]+a6[2]);
		//��ü���, ���for��
		
		
		//2. �迭�� �������� �ʿ��ϸ� �־��ش�.
		
	}

}
