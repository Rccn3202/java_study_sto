package javaBasic4.day01;

public class StaticEx05 {

	public static void main(String[] args) {
		System.out.println("메인 메소드 부분임");
		System.out.println(Car.a);   //정적변수 사용하기
		Car car=new Car();    //인스턴스 변수 이용하기 위해 생성자
		System.out.println(car.ia);  //인스턴스 변수 사용하기
	}

}

class Car{
	static int a;
	int ia;
	
	static {  //정적블록
		System.out.println("이곳은 정적블록임-이곳은 정적멤버(변수,메소드)를 처리할 때 이곳 먼저");
		System.out.println("이곳에는 정적멤버들의 초기값을 넣을 때 주로 사용");
		a=200;
	}
	
	{
		System.out.println("이곳은 인스턴스 블록임"); 
			ia=1000;
			/*1.Car car=new Car();
			System.out.println(car.ia);*/ //ia가 1000을 받았다가 아래에서 다시 2000을 받아서 2000을 출력함
	}

	public Car() {
		System.out.println("이곳은 기본생성자 부분임"); //2
		ia=2000;
    }

}
