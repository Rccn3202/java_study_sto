package javaMid3.p314;

public class PolyEx01 {

	public static void main(String[] args) {
		Car car=new Car();
		//Animal animal=new Cat();

		car.tire=new Tire();  //Ÿ�̾�Ŭ���� ��ü���� �� car Ŭ������ tire�� ����
		car.run();
		
		car.tire=new HankookTire();
		car.run();
		
		car.tire=new KumhoTire();
		car.run();
	
	}
}
