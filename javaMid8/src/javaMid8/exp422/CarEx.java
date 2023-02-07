package javaMid8.exp422;

//스태틱 클래스와 인스턴스 클래스의 차이
public class CarEx {

	public static void main(String[] args) {
		Car myCar=new Car();
		Car.Tire tire= myCar.new Tire();  //인스턴스 클래스
		Car.Engine engine=new Car.Engine();  //스태틱 클래스

	}

}
