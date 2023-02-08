package pack1;

import pack2.B;  //A클래스에 B패키지 숨겨놓음

public class A { 
public void method() {
	System.out.println("A-m");
	
	B b=new B();
	b.method();

}
}
