package javaBasic3.ch06.day01;

public class Car {			//일부러 생성할 때 main 안만듦
	String carName; //자동차 종류
	int carPrice; //가격
	String carMan; //제조사
	
	public Car() {			//claa명이랑 이름은 똑같은데 리턴타입 String 등이 없음
							//생성자는 class와 이름이 같다. 리턴타입이 없다.
							//new Car 생성했을 때 Car에 대한 생성자가 있어야 돼서 자동으로 생성됨.(그리고 내용은 공백)-개발자가 내용 입력하면 수행됨
	System.out.println("기본 생성자임"); //new Car를 입력하면 이것들이 다 들어간다.
	carName="소나타";
	carPrice=5000;
	carMan="현대";
	}
	
	public Car(String carName) { //"그랜저"를 바로 받기 위한 입력
       this.carName=carName;	
	}

	
	
	public Car(String carName, int carPrice) {
		this.carName=carName;
		this.carPrice=carPrice;
	}
	
	
	public Car(String carName, int carPrice, String carMan){
		this.carName=carName;
		this.carPrice=carPrice;
		this.carMan=carMan;
	}
		
		
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarMan() {
		return carMan;
	}
	public void setCarMan(String carMan) {
		this.carMan = carMan;
	}

}
