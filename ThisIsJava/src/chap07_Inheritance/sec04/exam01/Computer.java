package chap07_Inheritance.sec04.exam01;

public class Computer extends Calculator {  //자식클래스
	//메소드 오버라이딩
	@Override								//부모클래스의 메소드를 불러옴
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return ;
	}

}
