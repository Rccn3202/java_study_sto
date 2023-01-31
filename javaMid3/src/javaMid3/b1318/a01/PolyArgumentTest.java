package javaMid3.b1318.a01;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b=new Buyer();
		b.buy(new Tv());  //new Tv주소를 바이어클래스의 Product p가 받는다. 
		//원래 티비 클래스에 투스트링 오버라이딩을 안하면 p를 찍었을 때 주소가 나온다. 주소21312ㅇㄹㅇ를 구매하였습니다. 이렇게
		//근데 티비클래스를 투스트링 오버라이딩하면 제일 부모에서 티비클래스를 강제로 호출하였으므로 티비클래스의 "Tv"가 나온다.  
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Ipad());
		b.buy(new Phone());
		b.buy(new Mouse());
		b.summary();
		
		//제품 품목- 핸드폰 150,아이패드 170만원
	}

}
