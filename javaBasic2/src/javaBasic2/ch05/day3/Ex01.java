package javaBasic2.ch05.day3;

public class Ex01 {

	public static void main(String[] args) {
	/*	//null, NullPointerException
		Student st = null;  //st�������� �������� ������� �ʴ�.(heap�޸𸮿� �ø��� ����, �ø����� new �����)
		//���������� ���޸��� �ּҸ� ������ �ִ� ����
		//null�� ���޸��� �ּҸ� ���� ���� �ʾҰ� ���߿� ���� ���̶�� ��������
		Student st= 
		System.out.println(st);          */
	
		Student s1=new Student();  //1
		s1.setName("ȫ�浿");  //Student class�� setName �޼ҵ� ȣ�� �� ȫ�浿 �Է�   //2
		System.out.println(s1.getName()); //6
		
		s1.setPhone("010-1234-5678");
		System.out.println(s1.phone);
		
		s1.setKor(20);
		System.out.println(s1.kor);

		
		s1.setName("ȫ�浿");  
		System.out.println(s1.getName());
		
		s1.setPhone("010-1234-5678");
		System.out.println(s1.getPhone());
		
		s1.setKor(20);
		System.out.println(s1.getKor);
		
	}

}

class Student{
	String name; //�л��� /5
	String phone; // �л���ȭ
	int kor;
	
	void setName(String name) { //ȣ���ϰ� �Էµ� ȫ�浿�� String name���� ����  /3
		this.name=name; //this. : �ڱ�Ŭ����(Student Ŭ����)�� name�̴�. /4
	}	
	void setPhone(String phone) {
		this.phone=phone;
	}
	void setKor(int kor) {
		this.kor=kor;
	}
	
	
	String getName(){
		return this.name;  //���� ����� name�� String name �̹Ƿ� this �����ص� ��
	}
		String getPhone() {
		return this.phone;	
	}
	int getKor() {
		return this.kor;
	}
}