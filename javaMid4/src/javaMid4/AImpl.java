package javaMid4;

public class AImpl implements A { //인터페이스를 조상으로 갖음-이때는 extends가 아니라 implements
	//AImpl 은 구현클래스, 이걸 오버라이드 안하면 오류난다
	
	@Override
	public int m1() {
		// TODO Auto-generated method stub
		return 0;
	}@Override
	public boolean m2() {
		// TODO Auto-generated method stub
		return false;
	}
}
