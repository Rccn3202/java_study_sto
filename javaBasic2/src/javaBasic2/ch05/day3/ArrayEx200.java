package javaBasic2.ch05.day3;

import java.util.Scanner;

public class ArrayEx200 {

	static Scanner sc=new Scanner(System.in);  //1.���ο� ������ �ٸ� �޼ҵ忡�� �����ϱ� ���� ������ ���ش�
	
	public static void main(String[] args) {
		//200������ ���� 9��
		
		boolean flage=true;
		
		int scount=0;
		int[] scores; //13. 12�� �� scores �� ���� ����
		
		while(flage ) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. �л��� | 2. �����Է� |3. ��������Ʈ | 4. �м� | 5.���� ");
			System.out.println("-------------------------------------------------");
			System.out.print("����> ");			
			String menu=sc.nextLine();   //����
			
			switch(menu) {
			case "1" : scount=studentCount(); break;  //4. scount ���� �Է�
			case "2" : scores=input(scount); break; //5.�Ű������� scount �Է�, ����:input �޼ҵ带 �ٲ㼭 ���� ����
			//12.�� scoers�� �� scores�� �ٸ�
			case "3" : score(); break;
			case "4" : anly(); break;
			case "5" : flage=false; break;
			default : System.out.println("�޴� �߸��� (1~5)");
			}
		};
		
		

		
		
	

	}
	
	private static int studentCount() {
		// �л���
		System.out.println("�л���> ");  //2
		int scount=sc.nextInt();
		sc.nextLine();
		return scount;  //3 �����ؼ� �Էµ� �л��� 3���� �Է¹޾Ƽ� �ٽ� case1�� �ִ� scount ������ �־��ش�
}
	
	private static int[] input(int scount) {  //6. case2�� �ִ� scount �� ���� �� �ӵ���  //11.void�� int[]�� ����
		// �����Է�
		System.out.println();
		int[] scores=new int[scount];  //8.�迭 ����, ���� ������ �迭 scount ��´�(3�Է��ؼ� 3ĭ ����),���� scores ���� stack�� ����ȴ�
		for(int i=0;i<scount;i++) {			//7.
			System.out.println("scores["+i+"]> ");
			scores[i]=sc.nextInt(); //\9.
			sc.nextLine();	}
		return scores;  //10.scores ��� ���� �����Ѵ� 
		
	}

	private static void anly() {
		// �м�
		
	}

	private static void score() {
		// ��������Ʈ
		
	}

	

	

}
