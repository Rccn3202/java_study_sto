package javaBasic3.ch06.day01;

public class ClassEx02 {

	public static void main(String[] args) {
		// ������ �����ε� ����
		//���� ��Ʃ��Ʈ Ŭ������ �÷��ּ���
		Student st=new Student();  //��Ʃ��Ʈ�� �⺻�����ڰ� ����
		Student st1=new Student("ȫ�浿");
		Student st2=new Student(100,"010-1234-5678");
		Student st3=new Student("ȫ�浿", 90);
		
		Student s5=new Student("ȫ�浿",100,"5212-8788");
	}

}
class Student{
	String name;
	String phone;
	int scores;
	
	public Student() {				//�⺻�����ڴ� ()�� �ƹ��͵� �ȹ���
		System.out.println("StudentŬ������ �⺻�����κ�");
	}
	
	public Student(String name) {   //�Ű�����Ÿ��(String, int..)�� �ٸ��� ������ �������� �����ڸ� ��������
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