package javaMid7.p394;

public class OutterD {

	static int sia=200;
	
	static void sM() {
		final int ss=10;  //�̺κ� ����ƽ�̸� �ȵ�, sM�� ����ƽ���� �ö󰡴µ� �� ss�� ����ƽ���� �ø��� �� ����
		class InnerD{
			int sid=20;
			void siM() {
				System.out.println("Inner D�� Ŭ������ siM()�κ���"+sid+" "+sia);
			}
		}
		InnerD id=new InnerD();
		id.siM();
		
	}
}
