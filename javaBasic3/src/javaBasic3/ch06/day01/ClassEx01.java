package javaBasic3.ch06.day01;

public class ClassEx01 {

	public static void main(String[] args) {
		// 사용관계
		 Car car=new Car();  //new Car는 기본생성자를 호출한다. (Car class 에 있음)
		 //생성자는 객체가 생성될때만 수행됨
		 //생성자의 용도는 객체가 생성될 때 처음으로 넣을 값을 지정한다
		 
		 Car car1 =new Car("그랜저"); //힙메모리에 Car라는 클래스를 올리는데 올리자마자 그랜저라는 단어를 넣고싶다.
		 Car car2 =new Car("K5",4000);
		 Car car3=new Car("Y", 5000,"테슬라");
		 
		 System.out.println(car.getCarName());
		 System.out.println(car.getCarPrice());
		 System.out.println(car.getCarMan());
		 System.out.println();
		 
		 System.out.println(car1.getCarName());
		 System.out.println(car1.getCarPrice());  //0 나온다. 힙 메모리에 올라가긴 했는데 값을 입력하지 않았으므로
		 System.out.println(car1.getCarMan());
		 System.out.println();
		 
		 System.out.println(car2.getCarName());
		 System.out.println(car2.getCarPrice());
		 System.out.println(car2.getCarMan());
	}

}
