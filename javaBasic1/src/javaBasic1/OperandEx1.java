package javaBasic1;

public class OperandEx1 {

	public static void main(String[] args) {
		// 연산자1 ++a : 전위 단항 연산자  a--: 후위 단항 연산자
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
		b= ++a; //a=a+1 b=a  : 1더한다->B출력
		b= a++; //b=a a=a+1 : bcnffur ->1더한다
		System.out.println(a+ " " + b);
		
		int d=20;
		System.out.println(++d); // d=d+1 후 출력
		
		//연산자2 (a=a+1 a+=1) (a=a+2 a+=2)   (a=a+b a+=b) (a=a-10 a-=10)  (a = a*b a*=b)
		int e=10;
		// e = e - 8;
		e-=8;
		System.out.println(e);
		
		//연산자3
		//나누기 25/5=5 25/4 = 6.25
		//int v1=25;
		//int v2=4;
		//System.out.println(v1/v2); //6 나온다 정수/정수=정수니까
		//소수점 나오게 하려면?
		//생각 1. 자료형을 실수로 만들기
		//생각 2. 자료형은 정수로 그대로 하고 2500/4=625,625/100 한다
		
		//~내가 해봄~
//		double v3=25; //변수 실수로 규정하기? 
//		double v4=4;
//		System.out.println(v3/v4);
//		
		//생각 1.
		int v1=25;
		int v2=4;
		System.out.println(v1/(double) v2);
		//생각 2.
		v1 *=100; //v1 = v1 * 100;
		System.out.println((v1/(double)v2)/100);
		
		// >> 우측 쉬프트 연산자 << 좌측 쉬프트 연산자 >>> 우측 쉬프트 연산자   2의 배수로 곱하거나 더할 때 사용하는 연산자
		int v3 = 0b1011; //0b(이진수) 1010 : 10진수 11
		// v3 = v3 >> 2; //원래숫자 / 2^2    
		// v3 = v3 << 3 ; //원래숫자 *2^3
		System.out.println(v3); //1011을 왼쪽으러 2비트 민다. 101100 -> 10진수 44(원래숫자*10^2) 
		
		//관계 연산자 > 초과  >=이상 ==같다 !=같지않다
		int v4=100;
		System.out.println(v4 != 200);   
		
		//비트 연산자 이용 - 과학, 전자분야에서 주로 사용
		//int v5 = 0b01011; //1 true 0 false
		//int v6 = 0b10111; //
		//System.out.println( v5 & v6 ); //위의 0과 아래 1 같은지 비교-> 00011
		
		int v5 = 0b01011; //1 true 0 false
		int v6 = 0b10111; //
		System.out.println( Integer.toBinaryString(v5 & v6)); 
		System.out.println( Integer.toBinaryString(v5 | v6)); //11111 
		System.out.println( Integer.toBinaryString(v5 ^ v6)); //11100 xor(교차하다) 윗줄 아랫줄 01,10 이면 1 / 11 00이면 0 나온다

		//대입연산자 = : 우변에 있는 값을 좌변(변수만 나와야 함)에 넣으세요
		int v7 =200;
		// int 200 = v7; // 오류 :숫자는 변수가 될 수 없다
		
		int v8 = v2+200;
		// int v2 + 200 =v8; //오류
		
		//삼항연산자   (조건) ? 참:거짓
		int v9=10;
		System.out.println( (v9==10) ? "합격" : "불합격");
		int v99=15;
		System.out.println( (v99==10) ? "합격" : "불합격");
		
		String type="A";
		String result;
		result = (type.equals("A")) ? "VIP고객입니다" : "일반고객입니다" ;
		System.out.println(result);	

		// 문제 : 숫자 변수에 50을 입력하고 25이상이면 "포인트대상" 아니면 "포인트 대상이 아닙니다"라고 출력
		
		int v10=50;
		if
		System.out.println( (v10>=25) ? "포인트대상" : "포인트 대상이 아닙니다");
		
		
		
		// 문제 : 문자형 변수에 "자바"라고 입력하고 자바가 아니면 "B교실,C교실입니다." 자바이면 "A교실 입니다" 라고 출력 
		String type1="자바";
		String result1;
		result = (type1.equals("자바")) ? "A교실 입니다" : "B교실,C교실입니다." ;
		System.out.println(result);	

	}

}
