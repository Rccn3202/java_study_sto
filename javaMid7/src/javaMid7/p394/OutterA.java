package javaMid7.p394;

public class OutterA {
	int oa=10;
	static int soa=20;  //정적필드,클래스 멤버
	void oaM(){oa=oa-5;
	soa=soa+10;
	soaM(); }
	static void soaM() {
		// oa=oa+5; 못쓴다.
		soa=soa -1;
		//  oaM(); 먼저 올라가서 정의되지 않았다고 생각함
	}

	class InnerA{   
		int ia=20;
		//			static int sia=30;
		void iaM() {
			ia=ia+10;
			oa=oa+20;
			soa=soa+10;
			oaM(); //밖의 클래스에 있는 멤버 쓸 수 있음
			soaM(); //밖의 클래스에 있는 멤버 쓸 수 있음
		}
		//		static void siaM() {

	}
}


