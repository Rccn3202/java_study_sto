package javaMid10.p470;

public class ExceptionEx07 {

	public static void main(String[] args) {
		B b=new B();
		try {
			b.b1();
		}catch(Exception e) {
			if(e instanceof ArithmeticException) {
				System.out.println("��Ʋ��");
			}else if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("�迭Ʋ��");
			}else if(e instanceof ClassNotFoundException) {
				System.out.println("Ŭ�������� Ʋ��");
			}else if(e instanceof ClassCastException) {
				System.out.println("�̰ǹ���");
			}
		}finally {
			System.out.println("Ʋ��");
		}

	}

}
