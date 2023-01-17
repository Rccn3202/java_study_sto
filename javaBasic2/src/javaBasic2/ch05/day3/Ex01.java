package javaBasic2.ch05.day3;

public class Ex01 {

	public static void main(String[] args) {
	/*	//null, NullPointerException
		Student st = null;  //st변수에는 참조값이 들어있지 않다.(heap메모리에 올리지 않음, 올리려면 new 써야함)
		//참조변수는 힙메모리의 주소를 가지고 있는 변수
		//null은 힙메모리의 주소를 아직 넣지 않았고 나중에 넣을 것이라는 참조변수
		Student st= 
		System.out.println(st);          */
		
		//힙메모리에 올린다
		Student s1=new Student();  //1
		
		s1.setName("홍길동");  //Student class의 setName 메소드 호출 후 홍길동 입력   //2
		System.out.println(s1.getName()); //6
		
		s1.setPhone("010-1234-5678");
		System.out.println(s1.phone);
		
		s1.setKor(20);
		System.out.println(s1.kor);

		
		s1.setName("홍길동");  
		System.out.println(s1.getName());
		
		s1.setPhone("010-1234-5678");
		System.out.println(s1.getPhone());
		
		s1.setKor(20);
		System.out.println(s1.getKor);
		
	}

}

class Student{
	//필드, 클래스멤버
	String name; //학생명 /5
	String phone; // 학생전화
	int kor;
	
	//메서드-동작
	void setName(String name) { //호출하고 입력된 홍길동을 String name으로 받음  /3
		this.name=name; //this. : 자기클래스(Student 클래스)의 name이다. /4
	}	
	void setPhone(String phone) {
		this.phone=phone;
	}
	void setKor(int kor) {
		this.kor=kor;
	}
	
	
	String getName(){
		return this.name;  //제일 가까운 name이 String name 이므로 this 생략해도 됨
	}
		String getPhone() {
		return this.phone;	
	}
	int getKor() {
		return this.kor;
	}
}