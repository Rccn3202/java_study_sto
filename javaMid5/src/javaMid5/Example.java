package javaMid5;

public class Example {
public static void action(A a) {   //new A,B,C �� a�� ���� 
	a.method1();
	if(a instanceof C) {
		C c= (C) a; //�ٿ�ĳ����
		c.method2();
	}
}
	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
		
	}

}
