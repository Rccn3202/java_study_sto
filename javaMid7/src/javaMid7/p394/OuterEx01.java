package javaMid7.p394;

public class OuterEx01 {

	public static void main(String[] args) {
		//OutterA�� �ν��Ͻ� ��� Ŭ���� ��üȭ �ϱ�
		OutterA o=new OutterA();
		OutterA.InnerA ia=o.new InnerA();
		
		//OutterB�� ������� Ŭ���� ��üȭ �ϱ�
		OutterB.InnerB oi=new OutterB.InnerB();
		oi.ia=100;
		oi.iaM();
		//static �پ��ִ� ������� Ŭ������.�������() �Ǵ� Ŭ������.�޼ҵ��() �̶�� ����
		OutterB.InnerB.sia=200;
		
		
		//�ν��Ͻ� ��� Ŭ���� 1~100���� �� ����ϱ�
		ia.iaM();
		ia.ipM();
		
		//������� Ŭ���� ��üȭ�ϱ� ***** **** for�� ��
		OutterB.InnerB.siaM();
	}

}

//int sum=0;
//for(i=0;i<=100;i++) {
//	sum+=i;
//}
//}
