package javaBasic2.ch05.day3;

public class Ex165 {

	public static void main(String[] args) {
		// 배열: 같은 자료형으로 연속되게 나열해주는 변수
		int a=1;
		int b=1;
		int c=1;
		
		//만약 정수형으로 100개의 변수가 필요하다면? 배열을 이용하면 편하다
		int[] ia =new int[100]; //new 하면 힙메모리 생각! new로 힙에 100가지 숫자 등록/ia는 이 힙의 주소를 부를 수 있음
		
		double[] da =new double[5]; //더블형 변수를 힙메모리에 올리고, 주소를 da에 담는다.
		
		String[] sa=new String[10]; 
		
		boolean[] ba=new boolean[20];

		Student1[] st1=new Student1[14];
		//Student1의 클래스의 주소가 담기는 배열, 크기는 14개, st1에 힙메모리에 생긴 주소가 담긴다, st1의 자료형은 Student1[]
		
		
		//Person1 클래스의 주소를 담아줄 배열을 만든다
		//자료형[] 배열명=new 배열명[원소 또는 요소 또는 배열의 갯수]
		Person1[] p1=new Person1[20];
	}

}

class Strudent1{
	String name; //홍길동
	int score; //100
}

class Person1{
	;
}

