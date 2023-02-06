package javaMid7.p394;

public class OutterExQ {

	public static void main(String[] args) {
		/*
		 *     *     *
		 *     **   **
		 *     *** ***
		 *     *******
		 */    
		
		int oa=10;
		static int soa=20;  //정적필드,클래스 멤버
		void oaM(){oa=oa-5;
		soa=soa+10;
		soaM(); }
		static void soaM() {
			// oa=oa+5; 못쓴다.
			soa=soa -1;

		}

		static	class InnerB{     //이너B에 스태틱 붙이면 이너B는 컴파일 단계에서 메모리 올라감/단, 밖 클래스의 인스턴스 못올라간다
			int ia=20;
			static int sia=30;
			void iaM() {
				ia=ia+10;
				//	oa=oa+20;   밖에 클래스의 인스턴스 변수들은 못쓴다
				soa=soa+10;
				//	oaM(); 
				soaM(); 
			}
			static void siaM() {

			}
		}

		
		OutterB.InnerB oi=new OutterB.InnerB();
		oi.ia=100;
		oi.iaM();
			oi.iaM2();
		}
	
	


	}


