package javaMid6.p395;

public class OA1 {
	int a=10;
	static int sa=20;  //정적필드, 컴파일 할 때 미리 메모리에 올린다.
	
	void m1() {
		a=a+20;
		sa=sa+10;
	}
	static void sm1() {
	//	a=a+20;  오류난다. static은 저장하자마자 올라간다. sm1이 먼저 올라가고 m1이 올라가기 때문에 a 못쓴다. 
		sa=sa+10;
	}
	//생성자는 인스턴스 멤버, 정적 멤버 다 사용할 수 있다
	public OA1() {
		a=a+10;
		sa=sa+20;
		m1();
		sm1();
	}
	
	class IA { 
		int iaa=20;
		//static int isa=20;  //스테틱이 먼저 올라가기 떄문에 못쓴다.
		
		void iaaM() { 
			a=a+20;
			sa=sa+10;
			m1();
			sm1();
		}
		
		// static void isaM() {  ////스테틱이 먼저 올라가기 떄문에 못쓴다.
			
		// }
	}
	
}
