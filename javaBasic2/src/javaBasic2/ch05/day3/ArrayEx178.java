package javaBasic2.ch05.day3;

public class ArrayEx178 {

	public static void main(String[] args) {
		// 178
		int[][] scores= { {80,90,96}, {76,88 } };
		// 80 90 96
		// 76 88
		
		System.out.println("�迭�� ����"+scores.length);  //---> 2, ���� ����
		System.out.println("�迭�� ����"+scores[0].length);  //---> 3, 0���� ���� ����
		System.out.println("�迭�� ����"+scores[1].length); //---> 2, 1���� ���� ����
		
		System.out.println("96 "+scores[0][2]);
		System.out.println("88 "+scores[1][1]);
		
		//1���� ������ ���
		int avg;
		int sum=0;
		for(int i=0 ;i<scores[0].length ;i++) {
			sum=sum+scores[0][i];
		}
		avg=sum/scores[0].length;
		System.out.println("1 ���> "+avg);
		
		for(int j=0;j<scores[1].length;j++) {
			sum=sum+scores[1][j];
		}
		avg=(scores[1][0]+scores[1][1]);
		System.out.println("2 ���> "+avg);
		
		for(int s:scores[1]) {
			sum=sum+s;
		}
		avg=sum/scores[1].length;
		System.out.println("2�� ���> "+avg);
		
		
		//187. �迭����-�迭�� ó���� ���� �����ϸ� �ڸ��ų� ���� �� ���� �ٸ� ���� �Űܾ��Ѵ�.
		int[] oldIntArray= {1,2,3};
		
		int[] newIntArray = new int[5];  //���ο� �迭 5ĭ
		newIntArray[0]=oldIntArray[0];  //�Ű��ֱ�
		newIntArray[1]=oldIntArray[1];
		newIntArray[2]=oldIntArray[2];
		
		//�ű�� �ݺ���
		for(int i=0; i<oldIntArray.length;i++) {
			newIntArray[i]=oldIntArray[i];
		}
		for(int n: newIntArray) {
			System.out.print(n+" ");
		}
		
		int[] old= {4,5};
		newIntArray[3]=old[0];
		newIntArray[4]=old[1];
		for(int n:newIntArray) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		//�迭�� ũŰ�� �����Ǿ� ������ ���� �Űܾ��ϴµ�
		//�̷��� ������ �����ִ� �ڷᱸ���� �÷���(list)�̶�� �Ѵ�--->�迭���ٴ� �÷��� �� ���� ����
		//�迭 ���縦 ���ִ� System Ŭ������ �ִ�.
		
		//System class�� �̿��ؼ� �迭�� �ű��.
		int[] newArr1 = new int[10];
		System.arraycopy(oldIntArray, 0, newArr1, 5,oldIntArray.length ); //old~�迭��/0�� �ε�������/ newd��/0�� ��ġ����/ old ���̸�ŭ ����
		
		for(int i=0;i<newArr1.length;i++) {
			System.out.print(newArr1[i]+" ");
		}
		//ss 10 25 30 35  -> newss 0 0 10 25 30 35 0
		
		System.out.println();
		
		int[] ss={10,25,30,35};
		int[] newss=new int[7];
		System.arraycopy(ss,0 ,newss,2, ss.length);
		for(int i=0;i<newss.length;i++) {   //���
			System.out.print(newss[i]+" ");
		}
		
		
		
		
		
		
		
	}

}
