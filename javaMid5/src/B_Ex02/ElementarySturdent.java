package B_Ex02;

public class ElementarySturdent extends SungJuk {  //�������

@Override
	public String toString() {
	return "�ʵ��л�";
	}

//3. ����Ŭ���� ��ӹް� toString override

@Override
	void printAll() {
		System.out.println("---------------");	
		System.out.println("�ʵ��б� ���� �Դϴ�");
		System.out.println("---------------");
		System.out.println("����� : "+getSubject());
		System.out.println("���� : �߰���� "+getMidternExam()+
		", "+"�⸻��� : "+getFinals()+", "+"������ "+getPerformanceEvalution());
		System.out.println("����: "+getScore());
}
//8. �θ�Ŭ������ printAll�޼ҵ带 �������̵�

}


