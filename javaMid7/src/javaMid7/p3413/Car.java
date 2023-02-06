package javaMid7.p3413;

public class Car {
	//비즈니스 클래스-실제로 프로그램을 작성하는 부분
	private Tire tire1 = new Tire();
	
	private Tire tire2 = new Tire() {
		@Override  //오버라이드:제정의
		public void roll() {
		System.out.println("익명 자식 Tire 객체(한국타이어)가 굴러감");
		}
	};  //; 익명 클래스라는 의미
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	private Tire tire3=new Tire() {  //자식클래스
		public void roll() {
			System.out.println("금호 타이어가 굴러감");
		}
	};
	public void run2() {
		tire1.roll();
		tire2.roll();
		tire3.roll();
	}
	private Tire tire4=new Tire() {
		public void roll() {
			System.out.println("미쉐린");
		}
		};
	public void run3() {
		tire4.roll();
	}
	
}
