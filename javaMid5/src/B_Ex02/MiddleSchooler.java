package B_Ex02;

public class MiddleSchooler extends SungJuk {
	private String teacher; //��米���
	private int attendance; //�⼮����
	private int service; //��������
	
	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	public int getService() {
		return service;
	}

	public void setService(int i) {
		this.service = i;
	}

//4. �̵齺�� ���� �ۼ� �� ���Ͱ��� ����
@Override
public String toString() {
	
	return "���л�";
}

void printAll() {
	System.out.println("---------------");	
	System.out.println("���б� ���� �Դϴ�");
	System.out.println("---------------");
	System.out.println("����� : "+getSubject());
	System.out.println("���� : �߰���� "+getMidternExam()+
	", "+"�⸻��� : "+getFinals()+"������ "+getPerformanceEvalution()+"�⼮����"+getAttendance()+
	"�������� "+getService());
	System.out.println("����: "+getScore());
}  //9.�̵齺�� ����Ʈ�� �ۼ�
}
