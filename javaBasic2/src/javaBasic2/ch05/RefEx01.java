package javaBasic2.ch05;

public class RefEx01 {

	public static void main(String[] args) {
		Person p =new Person();
		Teacher t=new Teacher();
	   //�ڷ���  ������  new  Ŭ������()  (new: �ش�Ŭ������ ���޸𸮿� �÷���)
		
		p.address="���";
		p.point=10.25;
		t.dept="��";
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