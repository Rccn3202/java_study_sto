package javaBasic2.ch05.day3;

public class Ex02 {

	public static void main(String[] args) {
		// 주민번호 "880815-1234567" 집 "경기도 하남시" 나이 "25" 성별 "남"
		
		Person p1=new Person();  //1
		
		p1.setSsn("880815-1234567");  //2
		System.out.println(p1.getSsn());  //6
		
		p1.setAddress("경기도 하남시");
		System.out.println(p1.getAddress());
		
		p1.setAge(25);
		System.out.println(p1.getAge());
		
		p1.setGender(true);{ 

		System.out.println(p1.getGender());
		if(p1.getGender()=true) {
			System.out.println("남");
		} else {
			System.out.println("여");
		}
		}
	}

}

class Person{
	String ssn; //주민번호  //5
	String address; //집주소
	int age; 
	boolean gender; //성별
	
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