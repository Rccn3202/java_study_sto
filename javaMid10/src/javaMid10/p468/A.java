package javaMid10.p468;

public class A {
	void a1()throws ArithmeticException, ArrayIndexOutOfBoundsException,  ClassNotFoundException {
		a2();
		Class.forName("java.lang.String");
	}
void a2() throws ArithmeticException, ArrayIndexOutOfBoundsException {
		a3();
		int[] number= {1,2,3};
		System.out.println(number[1]);
	}
void a3() throws ArithmeticException {
	int a=10/5;
}

}
