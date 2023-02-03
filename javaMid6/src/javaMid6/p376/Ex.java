package javaMid6.p376;

public class Ex {
public static void action(A a) {
	a.method1();   //B-method1()
	if (a instanceof C) {
		C c=(C) a; //다운캐스팅
		c.method2();
	}
}
	public static void main(String[] args) {
		action(new B());
		action(new C());
	}

}
