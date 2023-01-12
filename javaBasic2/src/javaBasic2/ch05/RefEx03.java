package javaBasic2.ch05;

public class RefEx03 {

	public static void main(String[] args) {
		Student1 s1 =new Student1();
		s1.stName="홍길동";
		s1.age=100;
		s1.m1();
		System.out.println("main()"+s1.stName);
		s1.m1();
		s1.m2();
		
		Person1 pp = new Person1();
		pp.address="하남";
		pp.point=301.3;
		pp.getAddress();
		pp.getPoint();
		pp.getAll();
		
		//메소드를 이용해서 값을 전달하기
		pp.setAddress("하남시");
		pp.setPoint(301.3);
		pp.setAll("강동구", 40.2);
		pp.setEx(5,true,"홍길동",5.8);
	}

}



class Person1{
	String address;
	double point;
	void getAddress(){
		System.out.println("address"+address);
	}
	void getPoint(){
		System.out.println("point"+point);
	}
	void getAll(){
		System.out.println(address+point);
	}
	void setAddress(String a) {
	}
	void setPoint(double b) {
	}
	void setAll(String c, double d) {
	}
	void setEx(int e,boolean f, String g,double h) {
		
	}
}

class Teacher1{
	String dept;
	boolean gender;
}

class Student1{
	String stName;
	int age;
	void m1() {
		System.out.println("Student 클래스의 m1 메소드");
	}
	void m2() {
		System.out.println("나이 "+age);
	}
}