package javaMid10.p464;

public class ExceptionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//�ƿܹ߻� �ڵ� �ۼ�
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			//���� �߻��ϸ� ó���� �ڵ�
			System.out.println(e.getMessage());
			System.out.println("���ܰ� �߻��ߴ�");
		}finally {
			//���ܿ� ������� ������ ó���Ǵ� �ڵ�
			System.out.println("�����ͺ��̽� �ݱ�");
	
		}
		
	}

}
