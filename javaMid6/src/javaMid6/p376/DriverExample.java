package javaMid6.p376;

public class DriverExample {

	public static void main(String[] args) {
		//Driver ��ü ����
		Driver driver=new Driver();
		
		//Vehicle ���� ��ü ����
		Bus bus =new Bus();
		Taxi taxi=new Taxi();
		Subway subway=new Subway();
		
		//�Ű������� ���� ��ü ����(������: ���� ����� �ٸ�
		driver.driver(bus);
		driver.driver(taxi);
		driver.driver(subway);
		
		System.out.println("���"+driver.fare(bus)); //������� 1350��
		System.out.println("���"+driver.fare(taxi));
		System.out.println("���"+driver.fare(subway));
		
		driver.farePrint(bus);
		driver.farePrint(taxi);
		driver.farePrint(subway);
	}

}
