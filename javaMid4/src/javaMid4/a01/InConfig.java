package javaMid4.a01;

public interface InConfig {
	void i1();
	
	//상수 넣을 수 있음(변하지 않는 수)
	static final double PI=3.14;
	static final boolean OK=true;
	static final int COMPUT_PRICE = 200;
	static final int PRINT_PRICE =30;
	
	//디폴트 메소드-바디{ } 를 쓸 수 있다. 오버라이드 안해도 됨, 자바 1.8 이후 추가됨
	default void di1() { }
	default int di2() {return 0;}
	
	//정적 메소드도 바디 쓸 수 있음.
	static void sd() { }
	private void a() { } 
}
