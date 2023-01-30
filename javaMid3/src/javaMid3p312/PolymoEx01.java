package javaMid3p312;

public class PolymoEx01 {

	public static void main(String[] args) {
		// 다형성 Animal animal=new Cat();  *******중요함*******
		int a=10;
		double b=a; //작은 타입의 정수형 자료가 큰 타입의 실수형 자료에 들어가니까 에러없음
	
		Animal animal=new Cat();
		//작은 타입은 자식클래스, 큰 타입은 부모클래스
//		Cat cat1 =new Animal();  //힙 메모리에 Animal이 올라가는데 이것을 cat이라는 변수에 담는다.에러: cat1의 주소는 Cat 클래스를 가리킨다(가리킬 수 없음)
		//부모클래스에 인스턴스한 것은 자식의 자료형을 받을 수 없다.
	}

}
