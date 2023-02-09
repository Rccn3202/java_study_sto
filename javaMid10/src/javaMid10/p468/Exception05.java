package javaMid10.p468;

public class Exception05 {

	public static void main(String[] args) {  
		try {
			A a=new A();
			a.a1();
		}catch(ArithmeticException |ArrayIndexOutOfBoundsException|ClassNotFoundException e ) {
			if(e instanceof ArithmeticException) {
				System.out.println("수학틀림"+e.getMessage());	
			}else if (e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("배열 범위 틀림"+e.getMessage());
			}else if (e instanceof ClassNotFoundException) {
				System.out.println("클래스명 경로 틀림"+e.getMessage());
			}
			}catch(Exception e) {
				System.out.println("모든예외");
			}finally {
				System.out.println("예외 상관없이 처리하는 부분");
		}
	}

}
