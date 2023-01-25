package javaBasic4.day01;

public class StaticEx02 {

	//static을 붙임-메소드 영역에 올라감
	//프로그램 생명주기 : 생성(변수생성)-활용-소멸(프로그램이 끝나면 소멸)
	static int a=100;  //static이 붙어있는 것은 프로그램 시작할 때 생성, 프로그램 종료되면 소멸/즉 계속 메모리에 남아있음
	static double b=3.14;  //static 변수, 정적변수
	static String name="홍길동";  //로그인, 게임포인트, 장바구니 등 화면이 바뀌어도 계속 유지되어야 하는 정보
	
	//static 안붙임 - 메소드 영역에 없음. 출력하면 non-static 오류 나온다,
	int c=200;  //인스턴스 변수, 동적변수
	double d=5.5; //객체생성 new 하면 생성됨, 해당 클래스를 벗어나면(쓰지 않으면) 소멸
	String add="하남시";
	
	public static void main(String[] args) {
		System.out.println(a+" "+b+" "+name);
		// System.out.println(c+" "+d+" "+add); //메모리에 올라가지 않은 필드이므로 오류가 난다 에러 안나려면 new 객체생성한다
		StaticEx02 se02=new StaticEx02();
		System.out.println(se02.c+" "+se02.d+" "+se02.add);
	}

}
