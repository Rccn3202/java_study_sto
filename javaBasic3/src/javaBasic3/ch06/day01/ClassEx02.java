package javaBasic3.ch06.day01;

public class ClassEx02 {

	public static void main(String[] args) {
		// 생성자 오버로딩 공부
		//힙에 스튜던트 클래스를 올려주세요
		Student st=new Student();  //스튜던트의 기본생성자가 생김
		Student st1=new Student("홍길동");
		Student st2=new Student(100,"010-1234-5678");
		Student st3=new Student("홍길동", 90);
		
		Student s5=new Student("홍길동",100,"5212-8788");
	}

}
class Student{
	String name;
	String phone;
	int scores;
	
	public Student() {				//기본생성자는 ()에 아무것도 안받음
		System.out.println("Student클래스의 기본생성부분");
	}
	
	public Student(String name) {   //매개변수타입(String, int..)을 다르게 가지고 여러개의 생성자를 만들어야함
		this.name=name;
	}
	public Student(int scores,String phone) {
		// TODO Auto-generated constructor stub
	this.phone=phone;

	}

	public Student(String name, int scores) {
		// TODO Auto-generated constructor stub
	this.name=name;
	this.scores=scores;
	}



	public Student(String name, int scores, String phone ) {
		super();
		this.name = name;
		this.phone = phone;
		this.scores = scores;
	}
	
}