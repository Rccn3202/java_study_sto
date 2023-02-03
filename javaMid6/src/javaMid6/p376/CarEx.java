package javaMid6.p376;

public class CarEx {

	public static void main(String[] args) {
		//자동차 객체생성
		Car myCar=new Car();
		
		//run메소드 실행
		myCar.run();
		
		//타이어 객체 교체
		myCar.tire1=new KumhoTire();
		myCar.tire2=new KumhoTire();
		
		//run() 메소드 실행(다형성:실행결과가 다름)
		myCar.run();
	}

}
