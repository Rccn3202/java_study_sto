package javaMid3.b1318.a01;

public class Product {  //역할에 대한 것
	int price;
	int bonusPoint;
	
	public Product() {    } //기본생성자
	
	public Product(int price) { //명시적 생성자
		this.price=price;
		bonusPoint=(int)(price/10.0); //더블형이니까 실수형으로 받으려면 정수형으로 다운캐스팅

	}
}
