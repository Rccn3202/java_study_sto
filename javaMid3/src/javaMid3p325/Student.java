package javaMid3p325;

public class Student extends Person {
	public int studentNo;
	
	public Student(String name, int studentNo) {
		super(name); //�̸� �޾Ƽ� �θ𿡰� �־���
		this.studentNo=studentNo;
	}
	public void study() {
		System.out.println("���θ� �մϴ�");
	}
	 
}
