package javaBasic2.ch05;

public class RefEx03 {

	public static void main(String[] args) {
		Student1 s1 =new Student1();
		s1.stName="ȫ�浿";
		s1.age=100;
		s1.m1();
		System.out.println("main()"+s1.stName);
		s1.m1();
		s1.m2();
		
		Person1 pp = new Person1();
		pp.address="�ϳ�";
		pp.point=301.3;
		pp.getAddress();
		pp.getPoint();
		pp.getAll();
		
		//�޼ҵ带 �̿��ؼ� ���� �����ϱ�
		pp.setAddress("�ϳ���");
		pp.setPoint(301.3);
		pp.setAll("������", 40.2);
		pp.setEx(5,true,"ȫ�浿",5.8);
	}

}



class Person1{
	//����ʵ�
	String address;
	double point;
	//��� �޼ҵ�
	void getAddress(){
		System.out.println("address"+address);
	}
	void getPoint(){
		System.out.println("point"+point);
	}
	void getAll(){
		System.out.println(address+point);
	}
	void setAddress(String address) {
		this.address=address;
		System.out.println(address);
	}
	void setPoint(double point) {
		this.point=point;
		System.out.println(point);
	}
	void setAll(String address, double point) {
		this.address=address;  //this: �ڽ��� Ŭ������ ����ʵ�
		this.point=point;
	System.out.println(address+point);
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
		System.out.println("Student Ŭ������ m1 �޼ҵ�");
	}
	void m2() {
		System.out.println("���� "+age);
	}
}