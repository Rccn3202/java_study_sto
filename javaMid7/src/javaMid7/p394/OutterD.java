package javaMid7.p394;

public class OutterD {

	static int sia=200;
	
	static void sM() {
		final int ss=10;  //이부분 스태틱이면 안됨, sM도 스태틱으로 올라가는데 또 ss를 스테틱으로 올리는 것 ㄴㄴ
		class InnerD{
			int sid=20;
			void siM() {
				System.out.println("Inner D의 클래스의 siM()부분임"+sid+" "+sia);
			}
		}
		InnerD id=new InnerD();
		id.siM();
		
	}
}
