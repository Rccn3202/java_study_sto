package javaMid6.p395;

public class OA1 {
	int a=10;
	static int sa=20;  //�����ʵ�, ������ �� �� �̸� �޸𸮿� �ø���.
	
	void m1() {
		a=a+20;
		sa=sa+10;
	}
	static void sm1() {
	//	a=a+20;  ��������. static�� �������ڸ��� �ö󰣴�. sm1�� ���� �ö󰡰� m1�� �ö󰡱� ������ a ������. 
		sa=sa+10;
	}
	//�����ڴ� �ν��Ͻ� ���, ���� ��� �� ����� �� �ִ�
	public OA1() {
		a=a+10;
		sa=sa+20;
		m1();
		sm1();
	}
	
	class IA { 
		int iaa=20;
		//static int isa=20;  //����ƽ�� ���� �ö󰡱� ������ ������.
		
		void iaaM() { 
			a=a+20;
			sa=sa+10;
			m1();
			sm1();
		}
		
		// static void isaM() {  ////����ƽ�� ���� �ö󰡱� ������ ������.
			
		// }
	}
	
}
