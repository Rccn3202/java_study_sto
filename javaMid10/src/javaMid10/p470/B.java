package javaMid10.p470;

public class B {
void b1() throws Exception {
b2();

}
void b2() throws ArithmeticException, ArrayIndexOutOfBoundsException, ClassNotFoundException{ 
	b3();
	int a=10/0;
}
void b3() throws ArithmeticException,ArrayIndexOutOfBoundsException, ClassNotFoundException{
	b4();
	Class.forName("java.lang.String");
}
void b4() throws ArithmeticException {
	
}
}
