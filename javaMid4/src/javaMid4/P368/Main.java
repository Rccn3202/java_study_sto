package javaMid4.P368;

import javaMid4.C;

public class Main {

	public static void main(String[] args) {
		//객체 생성해보자 
		B b =new B() ;
		
		
		//다형성
		B b1 =new D();
		A a4=new E();  //E윗쪽에 A 있으므로 오류 안난다.
		B b2=new E(); //오류 나는 이유는 E의 부모는 C(C의 부모는 A) B는 E와 관계 없다.
		
		//a1이라는 참조변수에서 C 클래스의 메소드를 호출하고싶다?
		//되긴 되는데 A는 A,C 모두 가지고 있으므로 C를 부르려면 다운캐스팅 해야한다.
		 C c2=a1; //a1이 c2에 담기기엔 너무 크다. a1을 add cast를 하면(다운캐스팅하면)
		 C c2=(C) a1; //이 되고
		 c2.c1(); //이렇게 쓰면 사용 가능
		

	}

}
