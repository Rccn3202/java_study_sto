package javaBasic2.ch05.day3;

public class Ex165 {

	public static void main(String[] args) {
		// �迭: ���� �ڷ������� ���ӵǰ� �������ִ� ����
		int a=1;
		int b=1;
		int c=1;
		
		//���� ���������� 100���� ������ �ʿ��ϴٸ�? �迭�� �̿��ϸ� ���ϴ�
		int[] ia =new int[100]; //new �ϸ� ���޸� ����! new�� ���� 100���� ���� ���/ia�� �� ���� �ּҸ� �θ� �� ����
		
		double[] da =new double[5]; //������ ������ ���޸𸮿� �ø���, �ּҸ� da�� ��´�.
		
		String[] sa=new String[10]; 
		
		boolean[] ba=new boolean[20];

		Student1[] st1=new Student1[14];
		//Student1�� Ŭ������ �ּҰ� ���� �迭, ũ��� 14��, st1�� ���޸𸮿� ���� �ּҰ� ����, st1�� �ڷ����� Student1[]
		
		
		//Person1 Ŭ������ �ּҸ� ����� �迭�� �����
		//�ڷ���[] �迭��=new �迭��[���� �Ǵ� ��� �Ǵ� �迭�� ����]
		Person1[] p1=new Person1[20];
	}

}

class Strudent1{
	String name; //ȫ�浿
	int score; //100
}

class Person1{
	;
}

