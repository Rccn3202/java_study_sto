package javaMid3.b1318;

public class PolyMain {

	public static void main(String[] args) {
		CaptionTv ca=new CaptionTv();
		ca.channel=11;
		ca.power=true;
		ca.text="�ĳ��";
		ca.caption();
		ca.channelUp();
		ca.channelDown();
		
		//�θ�Ŭ������ �ڱ� �͸� ��밡��
		Tv tv=new Tv();
		tv.channel=7;
		tv.power=false;
		tv.channelDown();
		tv.channelUp();
		
		//Animal animal = new Cat();
		//���������� ��üȭ�ϱ�
		Tv tv1=new CaptionTv();
		tv1.channel=7;
		tv1.power=false;
		tv1.channelDown();
		System.out.println("=============");
		tv1.channelUp();
		//tv1.text="�ڽ��ʵ�";    //�ڽ��ʵ� ������
		//tv1.caption();   //�ڽ��ʵ� ������
		
		//�ڽ� �ʵ�� �޼ҵ� ����Ϸ���
		//1. �������̵�
		//���������� �θ���� �������̵� �� �޼ҵ�� �ڽ� ���� ���´�/ �θ���� �׳� �θ�� ��ü�����ؼ� ���� ��
		
		//2. �ٿ�ĳ����
		CaptionTv ct1=(CaptionTv) tv1;  //ĸ��Ƽ�� ����� ���� ���� �� �ٿ�ĳ����
		ct1.text="�ڽ��ʵ�";
		ct1.caption();
		
	}

}
