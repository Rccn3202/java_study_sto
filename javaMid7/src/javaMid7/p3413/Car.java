package javaMid7.p3413;

public class Car {
	//����Ͻ� Ŭ����-������ ���α׷��� �ۼ��ϴ� �κ�
	private Tire tire1 = new Tire();
	
	private Tire tire2 = new Tire() {
		@Override  //�������̵�:������
		public void roll() {
		System.out.println("�͸� �ڽ� Tire ��ü(�ѱ�Ÿ�̾�)�� ������");
		}
	};  //; �͸� Ŭ������� �ǹ�
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	private Tire tire3=new Tire() {  //�ڽ�Ŭ����
		public void roll() {
			System.out.println("��ȣ Ÿ�̾ ������");
		}
	};
	public void run2() {
		tire1.roll();
		tire2.roll();
		tire3.roll();
	}
	private Tire tire4=new Tire() {
		public void roll() {
			System.out.println("�̽���");
		}
		};
	public void run3() {
		tire4.roll();
	}
	
}
