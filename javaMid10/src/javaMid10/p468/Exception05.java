package javaMid10.p468;

public class Exception05 {

	public static void main(String[] args) {  
		try {
			A a=new A();
			a.a1();
		}catch(ArithmeticException |ArrayIndexOutOfBoundsException e) {
			if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("����Ʋ��"+e.getMessage());	
			}else if (e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("�迭 ���� Ʋ��"+e.getMessage());
			}
			
			
			
		}
	}

}
