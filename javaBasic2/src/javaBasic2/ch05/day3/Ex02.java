package javaBasic2.ch05.day3;

public class Ex02 {

	public static void main(String[] args) {
		// �ֹι�ȣ "880815-1234567" �� "��⵵ �ϳ���" ���� "25" ���� "��"
		
		Person p1=new Person();  //1
		
		p1.setSsn("880815-1234567");  //2
		System.out.println(p1.getSsn());  //6
		
		p1.setAddress("��⵵ �ϳ���");
		System.out.println(p1.getAddress());
		
		p1.setAge(25);
		System.out.println(p1.getAge());
		
		p1.setGender(true);{ 

		System.out.println(p1.getGender());
		if(p1.getGender()=true) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
		}
	}

}

class Person{
	String ssn; //�ֹι�ȣ  //5
	String address; //���ּ�
	int age; 
	boolean gender; //����
	
	void setSsn(String ssn) {  //3
		this.ssn=ssn;  //4
	}
	void setAddress(String address) {
		this.address=address;
	}
	void setAge(int age) {
		this.age=age;
	}
	void setGender(boolean gender) {
		this.gender=gender;
	}
	
	
	
	String getSsn() {
		return this.ssn;
	}
	String getAddress() {
		return this.address;
	}
	int getAge() {
		return this.age;
	}
	boolean getGender() {
		return this.gender;
	}
}