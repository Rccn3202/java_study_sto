package javaMid10.p468;

public class Exception05 {

	public static void main(String[] args) {  
		try {
			A a=new A();
			a.a1();
		}catch(ArithmeticException |ArrayIndexOutOfBoundsException|ClassNotFoundException e ) {
			if(e instanceof ArithmeticException) {
				System.out.println("����Ʋ��"+e.getMessage());	
			}else if (e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("�迭 ���� Ʋ��"+e.getMessage());
			}else if (e instanceof ClassNotFoundException) {
				System.out.println("Ŭ������ ��� Ʋ��"+e.getMessage());
			}
			}catch(Exception e) {
				System.out.println("��翹��");
			}finally {
				System.out.println("���� ������� ó���ϴ� �κ�");
		}
	}

}
