package javaMid8.exp422;

public class Ex01 {

	public static void main(String[] args) {
		//3 
		//�ν��Ͻ� ��� ��ü ����
		OutterA o=new OutterA(); //�ٱ�Ŭ���� ��ü�� �־�� ��밡��
		OutterA.InnerA a=o.new InnerA();
	
		//������� ��ü ����
		OutterA.InnerB b=new OutterA().InnerB();
	} 

}
