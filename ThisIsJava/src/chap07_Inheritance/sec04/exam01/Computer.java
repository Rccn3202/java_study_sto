package chap07_Inheritance.sec04.exam01;

public class Computer extends Calculator {  //�ڽ�Ŭ����
	//�޼ҵ� �������̵�
	@Override								//�θ�Ŭ������ �޼ҵ带 �ҷ���
	public double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return ;
	}

}
