package javaMid7.p419;

public class Car {  //비즈니스 클래스
	
	Tire t1=new Tire()  {
		@Override
		public void roll() {
		System.out.println("일반타이어");	
		}
	};

	Tire t2=new Tire() {
		
	public void roll() {};
	System.out.println("금호");
	}
}
