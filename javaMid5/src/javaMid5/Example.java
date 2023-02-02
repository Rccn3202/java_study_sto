package javaMid5;

public class Example {
public static void action(A a) {   //new A,B,C 가 a에 저장 
	a.method1();
	if(a instanceof C) {
		C c= (C) a; //다운캐스팅
		c.method2();
	}
}
	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
		
	}

}
