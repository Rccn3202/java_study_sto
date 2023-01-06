package ch02.sec01;

public class VariableExchangeExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x = 3;
	int y = 5;
	System.out.println("x:" +  x + ", y:" +y);
	
	int temp = x;
	x = y; //y=3
	y = temp; //x=5
	System.out.println("x:" + x + ", y:" + y);
	
	
	int bkor = 0b1111; //이진수
	System.out.println(bkor);
	
	
	} //end main

	static void swap(int x,int y) {
		int temp = y; //temp =5
		y = x; //y=3
		x = temp; //x=5
		
		byte k = 100;
		short e = 85;		
		int m = 90;
		long s = 86;
		byte kk=89;
	
		int total = k + kk; //1byte + 1byte =1byte(사칙연산의 부호는 4바이트 차지함)
		
		
	}
	
				
} //end class

