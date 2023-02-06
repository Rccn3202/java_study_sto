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
			System.out.println("메소드 안에 들어있는 클래스의 메소드임");	
			}
//			static void icsM() {
//				System.out.println("메소드 안에 들어있는 클래스의 정적 메소드임");
//			}
		}

		InnerC inc=new InnerC();
		inc.icM();
	}//end iaM
	
}
