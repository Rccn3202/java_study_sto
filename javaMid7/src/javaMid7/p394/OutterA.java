package javaMid7.p394;

public class OutterA {
	int oa=10;
	static int soa=20;  //�����ʵ�,Ŭ���� ���
	void oaM(){oa=oa-5;
	soa=soa+10;
	soaM(); }
	static void soaM() {
		// oa=oa+5; ������.
		soa=soa -1;
		//  oaM(); ���� �ö󰡼� ���ǵ��� �ʾҴٰ� ������
	}

	class InnerA{   
		int ia=20;
		//			static int sia=30;
		void iaM() {
			ia=ia+10;
			oa=oa+20;
			soa=soa+10;
			oaM(); //���� Ŭ������ �ִ� ��� �� �� ����
			soaM(); //���� Ŭ������ �ִ� ��� �� �� ����
		}
		//		static void siaM() {

	}
}


