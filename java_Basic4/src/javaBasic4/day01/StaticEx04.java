package javaBasic4.day01;

public class StaticEx04 {

	public static void main(String[] args) {
		System.out.println(Student.a);
		System.out.println(Student.b);
		System.out.println(Student.c);
		
		Student.sM();  //다른 클래스에 있는 static 메소드 사용
		
		Student st=new Student();
		System.out.println(Student.getA());
		
		
		float ii=st.getIb(); //인스턴스 객체이므로 st로 이용한다.
		System.out.println(ii); 
		
		
		
		
	}

}

class Student{
	static int a=10;
	static float b=1.1f;
	static double c=5.5;
	
	
	int ia=100;
	float ib=2.2f;
	double ic=6.6;
	
	public static int getA() {
		return a;
	}

	public static void setA(int a) {
		Student.a = a;
	}

	public static float getB() {
		return b;
	}

	public static void setB(float b) {
		Student.b = b;
	}

	public static double getC() {
		return c;
	}

	public static void setC(double c) {
		Student.c = c;
	}

	public int getIa() {
		return ia;
	}

	public void setIa(int ia) {
		this.ia = ia;
	}

	public float getIb() {
		return ib;
	}

	public void setIb(float ib) {
		this.ib = ib;
	}

	public double getIc() {
		return ic;
	}

	public void setIc(double ic) {
		this.ic = ic;
	}

	
	
	
	public static void sM() {
	System.out.println("이곳은 정적 메소드"+a+b+c);	
	
	System.out.println(Person.name+" "+Person.add);
	
	
	}
	
	public void iM() {
		System.out.println("이곳은 인스턴스 메소드"+ia+ib+ic);
	}
	
}
	
	class Person{
		static String name="홍길동";
		static String add="서울";
	}
	
	
	
	

















	