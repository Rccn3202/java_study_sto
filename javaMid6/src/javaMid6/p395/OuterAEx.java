package javaMid6.p395;

public class OuterAEx {

	public static void main(String[] args) {
		// InnerAŬ������ iAMethod()�� ȣ��
		//OuterAŬ���� ��üȭ�ϰ� ���� ���������� InnerAŬ���� ��üȭ�ϱ�
		OuterA oa=new OuterA();  //OuterAŬ������ ��üȭ
		OuterA.InnerA oi=oa.new InnerA();//OuterAŬ���� ���� InnerAŬ������ ��üȭ
		oi.iAMethod();
		
		

	}

}
