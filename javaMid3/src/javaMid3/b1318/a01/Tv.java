package javaMid3.b1318.a01;

public class Tv extends Product {  //���� ���α׷�
	public Tv() {   
		super(100);  //Tv��� �����ڴ� �θ������ ȣ���ؼ� 100�� ����(int price)
	}
	
	@Override            //to+�����̽���  :Object Ŭ������ ��� Ŭ������ ����. Object Ŭ������ toString�� �������̵���
		public String toString() {
			return "Tv";
		}

}
