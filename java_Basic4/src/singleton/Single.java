package singleton;

public class Single {
	
	private static Single s=new Single();
	
	private Single() {   //�ڱ� Ŭ���������� ��� ����, �ٸ��������� ���x
		
	}
	String now() {     //��¥ ���� �޼ҵ� private
		return "2023-01-25";
	}
	
	public static Single getInstance() {    //Single�� �������� �� Instance ���� �޼ҵ常 �ۺ�
		return s;
	}

}
