package javaBasic3.ch06.day01;

public class ClassEx01 {

	public static void main(String[] args) {
		// ������
		 Car car=new Car();  //new Car�� �⺻�����ڸ� ȣ���Ѵ�. (Car class �� ����)
		 //�����ڴ� ��ü�� �����ɶ��� �����
		 //�������� �뵵�� ��ü�� ������ �� ó������ ���� ���� �����Ѵ�
		 
		 Car car1 =new Car("�׷���"); //���޸𸮿� Car��� Ŭ������ �ø��µ� �ø��ڸ��� �׷������ �ܾ �ְ�ʹ�.
		 Car car2 =new Car("K5",4000);
		 Car car3=new Car("Y", 5000,"�׽���");
		 
		 System.out.println(car.getCarName());
		 System.out.println(car.getCarPrice());
		 System.out.println(car.getCarMan());
		 System.out.println();
		 
		 System.out.println(car1.getCarName());
		 System.out.println(car1.getCarPrice());  //0 ���´�. �� �޸𸮿� �ö󰡱� �ߴµ� ���� �Է����� �ʾ����Ƿ�
		 System.out.println(car1.getCarMan());
		 System.out.println();
		 
		 System.out.println(car2.getCarName());
		 System.out.println(car2.getCarPrice());
		 System.out.println(car2.getCarMan());
	}

}
