package javaMid10.p468;

public class Exception05 {

	public static void main(String[] args) {  
		try {
			A a=new A();
			a.a1();
		}catch(ArithmeticException |ArrayIndexOutOfBoundsException e) {
			if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("수학틀림"+e.getMessage());	
			}else if (e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("배열 범위 틀림"+e.getMessage());
			}
			
			
			
		}
	}

}
