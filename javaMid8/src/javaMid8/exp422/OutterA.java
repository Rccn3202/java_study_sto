package javaMid8.exp422;

public class OutterA {
	int oa=10;
	static int soa=20;
	void oaM() {}
	static void soaM() {}
	
	void localMethod() {
		class LocalClass{
			void a() {
				oa=oa-20;
				oaM();
			}
		}
	}
	
	class InnerA{  //�ν��Ͻ� ��� Ŭ����
		int ia=20;
		void iaM() {ia=ia+10;
					soa=soa+20;
					oaM();
					soaM();}
	}
	static class InnerB {
		
	}
}
