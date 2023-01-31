package javaMid3.p314;

public class PolyEx01 {

	public static void main(String[] args) {
		Car car=new Car();
		//Animal animal=new Cat();

		car.tire=new Tire();  //타이어클래스 객체생성 후 car 클래스의 tire에 넣음
		car.run();
		
		car.tire=new HankookTire();
		car.run();
		
		car.tire=new KumhoTire();
		car.run();
	
	}
}
