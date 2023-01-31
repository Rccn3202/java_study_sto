package javaMid3p325;

public class Student extends Person {
	public int studentNo;
	
	public Student(String name, int studentNo) {
		super(name); //이름 받아서 부모에게 넣어줌
		this.studentNo=studentNo;
	}
	public void study() {
		System.out.println("공부를 합니다");
	}
	 
}
