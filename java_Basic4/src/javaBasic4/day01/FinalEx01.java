package javaBasic4.day01;

public class FinalEx01 {

	static final double PI=3.14;  //final�� �� ���� �׻� �������� �Ǵ� ���� �־��־���Ѵ�.
	//�������(���: �׻� �״����, ������ �ʴ� ��. ���̰�,����..)�� �׻� �빮�ڷ� ����.
	
	public static void main(String[] args) {
		//final - ��
		int a=10;
		a=a+100;
		
		final int b=100; //b��� ������ ���������� 100�� ���´�.
		System.out.println(b+200);   //�ٲ��� �ʰ� b�� ��븸 �Ѵ�.
		
		System.out.println(Math.PI);
	
	

	}
}
