package B_Ex02;

public class HighSchoolStudent extends MiddleSchooler  {  //5. �̵齺�� Ŭ������ �θ�� �д�
	private double standardDeviation; //ǥ������  
	@Override
		public String toString() {
		return "����л�";
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
		System.out.println("ǥ������: "+getStandardDeviation());
	} //10.���̽��� ����Ʈ�� �ۼ�
	
public double getStandardDeviation() {
		return standardDeviation; }
	public void setStandardDeviation(double standardDeviation) {
		this.standardDeviation = standardDeviation; }
	//6. �������� �� ���Ͱ���
	
}
