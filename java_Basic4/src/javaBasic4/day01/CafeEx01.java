package javaBasic4.day01;

public class CafeEx01 {

	public static void main(String[] args) {
		/* 1. ������ �����ϴ� Student Ŭ������ �ۼ��Ͻÿ�.

          String���� �а��� �������� �й��� �ʵ�� ����

         Student Ŭ������ main() �޼ҵ忡�� Student ��ü�� �����Ͽ� �а��� �й� �ʵ忡 ������ ���� �Է� �� ���
*/
		StudentEx st=new StudentEx();
		st.dep="��ǻ��";
		st.num=101010;
		System.out.println("�а� "+st.dep+" "+"�й� "+st.num);
	
		
	
	}

}

class StudentEx{
	//�ʵ�
	String dep;  //�а�
	int num; //�й�
}