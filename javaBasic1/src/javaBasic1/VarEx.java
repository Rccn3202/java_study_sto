package javaBasic1;

public class VarEx {

	public static void main(String[] args) {
		System.out.println('글'); //
		System.out.println("여러글자");
		//변수 10이라는 값을 a라는 공간에 넣는다
		//컴퓨터의 가장 기본 폰노이만 사람 주장 프로그램 내장방식 - 모든 프로그램은 반드시 주기억장치에 올라가서
		//이것을 중앙처리장치가 가져다 연산하고 제어해서 수행한다.
		//java는 변수를 자료형으로 선언한다. 값을 넣는다.  
		int a;
		a = 10; //10을 a에 넣는다. 10 = a 안됨.

//자료의 형태 - 학번(문자형) 성명(문자형) 나이(숫자형) 성별(논리형,불린형) 점수(실수형 변수)등등 객체형-의사들의 모임,개발자들의 모임 
		String haknun;
		String name;
		String dept;
		int age;
		boolean sex;
		double jumsu;
		Doctor doctor; //Doctor 내가 만든거라 에러나는 것. 프로그래머가 만들어준 객체 자료형. Doctor라는 인터페이스나 클래스 만들어야함
		Programmer programmer;
	}

}

class Doctor{
	
}
class Programmer{
	
}
}