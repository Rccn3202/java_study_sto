package javaBasic2.ch05.day3;

public class ArrayEx06 {

	public static void main(String[] args) {
		// ������ �迭
		int[][] a=new int[2][3];
		a[0][0] =5;
		a[1][1] =10;
		
		int[][] b= { {1,2,3},{4,5,6} };
		// 1 2 3
		// 4 5 6
		
		String[][] c= {{"a","b" },{"c","d"}};
		//a b
		//c d
		
		int[][][] d= { {{1}, {2}} , {{3}, {4}} , {{5}, {6}} };

		//b�� �迭�� ����� new�� ����
		int[][] bb=new int[2][3];
		String[][] cc=new String[2][2];
		int[][][] dd=new int[3][2][1];  //3�� 2�� 1��

		//����ϱ�
		//b�迭 ���
		System.out.println(b[0][0]+" "+b[0][1]+" " +b[0][2]);
		System.out.println(b[1][0]+" "+b[1][1]+" " +b[1][2]);
		//c���
		System.out.println(c[0][0]+c[0][1]);
		System.out.println(c[1][0]+c[1][1]);
		//d���
		System.out.println(d[0][0][0]);
		System.out.println(d[0][1][0]);
		System.out.println(d[1][0][0]);
	}

}
