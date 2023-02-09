package javaMid10.p470;

public class ExceptionEx07 {

	public static void main(String[] args) {
		B b=new B();
		try {
			b.b1();
		}catch(Exception e) {
			if(e instanceof ArithmeticException) {
				System.out.println("식틀림");
			}else if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("배열틀림");
			}else if(e instanceof ClassNotFoundException) {
				System.out.println("클래스명경로 틀림");
			}else if(e instanceof ClassCastException) {
				System.out.println("이건뭐임");
			}
		}finally {
			System.out.println("틀림");
		}

	}

}
