package javaBasic2.ch05;

public class RefEx01 {

	public static void main(String[] args) {
		Person p =new Person();
		Teacher t=new Teacher();
	   //자료형  변수명  new  클래스명()  (new: 해당클래스를 힙메모리에 올려라)
		
		p.address="경기";
		p.point=10.25;
		t.dept="컴";
		t.gender=false;
		System.out.println(p.address);
		System.out.println(p.point);
		System.out.println(t.gender);
		
	}

}


class Person{
String address;
double point;
}

class Teacher{
	String dept;
	boolean gender;
}