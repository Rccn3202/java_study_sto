package chap07_Inheritance.sec04.exam01;

public class ComputerExample {  //����Ŭ����

	public static void main(String[] args) {
		int r=10;
		
		Calculator calculator= new Calculator();
		System.out.println("�� ����: "+calculator.areaCircle(r));
		System.out.println();
		
		Computer computer=new Computer();
		System.out.println("�� ����: "+computer.areaCircle(r));
	}

}


/* 
 * 1. �θ�Ŭ���� �����ڸ� �����
 * 2. �θ�Ŭ������ ����Ʈ���� ���
 * 3. �θ�Ŭ������ ��꿡 r=10�� �ִ´�
 * 
 * 4. �ڽ�Ŭ���� �����ڸ� �����
 * 5. �ڽ�Ŭ������ ����Ʈ���� ���
 */

