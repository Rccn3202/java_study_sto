package chap05_ReferenceType.sec06;

public class ArrayCreateEx2 {
//*�迭 ������ ������ ������ �� ����� ���ԵǴ� ������ �ٸ��ٸ� new Ÿ��[]�� �տ� �ٿ��ش�. 
	public static void main(String[] args) {
		String[] names=null;
		names=new String[] {"��","��","��"};   //���߿� �� �� ������ �� ����.
		
		//�迭 ���� ���� scores
		int[] scores;
		
		//�迭 ������ �迭�� ���� 10 20 30
		scores=new int [] {10,20,30};
		
		//�迭 �׸��� ���� ���ϱ�, ���
		if(int i=0;i<3;i++) {
			int sum+=scores[i];
			System.out.println("���� : "+sum);
		}
		
		
		//�迭�� �Ű������� �ְ� printItem()�޼ҵ� ȣ��
		
		//printItem() �޼ҵ� ����
		
		//�Ű������� �����ϴ� �迭�� �׸��� ���

	}

}
