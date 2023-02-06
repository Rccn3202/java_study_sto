package javaMid7.p394;

public class OuterEx01 {

	public static void main(String[] args) {
		//OutterA는 인스턴스 멤버 클래스 객체화 하기
		OutterA o=new OutterA();
		OutterA.InnerA ia=o.new InnerA();
		
		//OutterB는 정적멤버 클래스 객체화 하기
		OutterB.InnerB oi=new OutterB.InnerB();
		oi.ia=100;
		oi.iaM();
		//static 붙어있는 멤버들은 클래스명.멤버변수() 또는 클래스명.메소드명() 이라고 쓴다
		OutterB.InnerB.sia=200;
		
		
		//인스턴스 멤버 클래스 1~100까지 합 출력하기
		ia.iaM();
		ia.ipM();
		
		//정적멤버 클래스 객체화하기 ***** **** for문 때
		OutterB.InnerB.siaM();
	}

}

//int sum=0;
//for(i=0;i<=100;i++) {
//	sum+=i;
//}
//}
