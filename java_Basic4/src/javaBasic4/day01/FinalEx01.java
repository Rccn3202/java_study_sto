package javaBasic4.day01;

public class FinalEx01 {

	static final double PI=3.14;  //final을 쓸 때는 항상 마지막이 되는 값을 넣어주어야한다.
	//상수선언(상수: 항상 그대로인, 변하지 않는 수. 파이값,요일..)은 항상 대문자로 쓴다.
	
	public static void main(String[] args) {
		//final - 끝
		int a=10;
		a=a+100;
		
		final int b=100; //b라는 변수는 마지막으로 100을 갖는다.
		System.out.println(b+200);   //바꾸진 않고 b를 사용만 한다.
		
		System.out.println(Math.PI);
	
	

	}
}
