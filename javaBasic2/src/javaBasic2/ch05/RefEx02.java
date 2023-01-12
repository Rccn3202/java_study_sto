package javaBasic2.ch05;

public class RefEx02 {

	public static void main(String[] args) {
		//Car 클래스 만들어보기
		//필드는 carKind,carPrice 자동차 종료  (필드는 변수,문자니까 String 쓰기)
		//값을 소나타 3500
		Car ca=new Car();
		Car ca1=new Car();
		City ci=new City();
		City ci1=new City();
		
		
		ca.carKind="소나타";
		ca.carPrice=3500;
		ca1.carKind="그렌저";
		ca1.carPrice=5000;
		

		ci.cityName="하남시";
		ci.cityLocation="경기도";
		ci.cityTex=0.125;
		ci.cityGood=true;
		ci1.cityName="강동구";
		ci1.cityLocation="서울시";
		ci1.cityTex=0.134;
		ci1.cityGood=true;
		
		System.out.println(ca.carKind);
		System.out.println(ca.carPrice);
		System.out.println(ca1.carKind);
		System.out.println(ca1.carPrice);
		
		System.out.println();
		
		System.out.println(ci.cityName);
		System.out.println(ci.cityLocation);
		System.out.println(ci.cityTex);
		System.out.println(ci.cityGood);
		System.out.println(ci1.cityName);
		System.out.println(ci1.cityLocation);
		System.out.println(ci1.cityTex);
		System.out.println(ci1.cityGood);
		
		
	}

}

class Car{
		String carKind;
		int carPrice;
		//메소드(동작) 형식 : 리턴타입 메서드명(메서드 호출될 떄 넣어주는 변수) {처리할 내용들}
		void m1() {
			System.out.println("car 클래스 m1 메소드");
		}
}

class City{
	String cityName;
	String cityLocation;
	double cityTex;
	boolean cityGood;
}
