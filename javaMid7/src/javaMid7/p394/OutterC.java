package javaMid7.p394;

public class OutterC {

	int ia=10;
	static int sia=20;

	static void siM() {}
	void iaM() {
		class InnerC{
			int ic=100;
			// static int sic=20;
			void icM() {
				ia=ia+100;
				ic=ic+200;
			System.out.println("�޼ҵ� �ȿ� ����ִ� Ŭ������ �޼ҵ���");	
			}
//			static void icsM() {
//				System.out.println("�޼ҵ� �ȿ� ����ִ� Ŭ������ ���� �޼ҵ���");
//			}
		}

		InnerC inc=new InnerC();
		inc.icM();
	}//end iaM
	
}
