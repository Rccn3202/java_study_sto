package javaMid6.p376;

public class DriverExample {

	public static void main(String[] args) {
		//Driver 객체 생성
		Driver driver=new Driver();
		
		//Vehicle 구현 객체 생성
		Bus bus =new Bus();
		Taxi taxi=new Taxi();
		Subway subway=new Subway();
		
		//매개값으로 구현 객체 대입(다형성: 실행 결과가 다름
		driver.driver(bus);
		driver.driver(taxi);
		driver.driver(subway);
		
		System.out.println("요금"+driver.fare(bus)); //버스요금 1350원
		System.out.println("요금"+driver.fare(taxi));
		System.out.println("요금"+driver.fare(subway));
		
		driver.farePrint(bus);
		driver.farePrint(taxi);
		driver.farePrint(subway);
	}

}
