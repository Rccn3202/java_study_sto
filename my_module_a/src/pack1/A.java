package pack1;

import pack2.B;  //AŬ������ B��Ű�� ���ܳ���

public class A { 
public void method() {
	System.out.println("A-m");
	
	B b=new B();
	b.method();

}
}
