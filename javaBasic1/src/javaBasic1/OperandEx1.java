package javaBasic1;

public class OperandEx1 {

	public static void main(String[] args) {
		// 연산자
		int a=10;
		//11출력
		//System.out.println(a+1); //방법1
		//a = a+1;
		//System.out.println(a); //방법2
		//a++; //방법3
		//++a;
		//System.out.println(a); 
		
		
		//9 출력
//		a--;
//		System.out.println(a);

		int b,c;
		//문: b변수에 11을 넣어서 출력해주세요
	//	b = 11; //방법1
	//	b = a+1; //방법2 
//		a++; //방법3
//		b = a;
//		System.out.println(b);
		b= ++a; //a=a+1 b=a  : 11 -> 11
		b= a++; //b=a a=a+1 : 10 -> 11
		System.out.println(a+ " " + b);
		
		int d=20;
		System.out.println(++d); //
		
	}

}
