package javaMid7.p394;



public class OutterB {
	int oa=10;
	static int soa=20;  //�����ʵ�,Ŭ���� ���
	void oaM(){oa=oa-5;
	soa=soa+10;
	soaM(); }
	static void soaM() {
		// oa=oa+5; ������.
		soa=soa -1;

	}

	static	class InnerB{     //�̳�B�� ����ƽ ���̸� �̳�B�� ������ �ܰ迡�� �޸� �ö�/��, �� Ŭ������ �ν��Ͻ� ���ö󰣴�
		int ia=20;
		static int sia=30;
		void iaM() {
			ia=ia+10;
			//	oa=oa+20;   �ۿ� Ŭ������ �ν��Ͻ� �������� ������
			soa=soa+10;
			//	oaM(); 
			soaM(); 
		}
		static void siaM() {

		}
	}



static void siaM() {
	for(int i=0;i<5;i++) {
		for(int j=0;j<5-i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
