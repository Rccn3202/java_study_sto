package javaBasic4.day01;

public class StaticEx05 {

	public static void main(String[] args) {
		System.out.println("���� �޼ҵ� �κ���");
		System.out.println(Car.a);   //�������� ����ϱ�
		Car car=new Car();    //�ν��Ͻ� ���� �̿��ϱ� ���� ������
		System.out.println(car.ia);  //�ν��Ͻ� ���� ����ϱ�
	}

}

class Car{
	static int a;
	int ia;
	
	static {  //�������
		System.out.println("�̰��� ���������-�̰��� �������(����,�޼ҵ�)�� ó���� �� �̰� ����");
		System.out.println("�̰����� ����������� �ʱⰪ�� ���� �� �ַ� ���");
		a=200;
	}
	
	{
		System.out.println("�̰��� �ν��Ͻ� �����"); 
			ia=1000;
			/*1.Car car=new Car();
			System.out.println(car.ia);*/ //ia�� 1000�� �޾Ҵٰ� �Ʒ����� �ٽ� 2000�� �޾Ƽ� 2000�� �����
	}

	public Car() {
		System.out.println("�̰��� �⺻������ �κ���"); //2
		ia=2000;
    }

}
