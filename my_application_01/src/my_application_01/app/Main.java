package my_application_01.app;

import javaMid9.my_lib.pack1.A;
import javaMid9.my_lib.pack2.B;

public class Main {

	public static void main(String[] args) {  //lib에 있는 프로젝트를 임포트해서 쓴것
		A a=new A();
		a.method();
		
		B b=new B();
		b.method();
	}

}
