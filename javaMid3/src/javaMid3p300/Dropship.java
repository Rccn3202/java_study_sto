package javaMid3p300;

public class Dropship extends Unit {
	String n="���ۼ�";
	
	void load(Marine marine) {  //�������� �ش�
		//���õ� ����� �¿��
		System.out.println("���ۼ� ���� ��ġ("+marine.getX()+", "+marine.getY()+"�¿��");  //���� �ּҿ� �ִ� x �� ȣ��
	}
	void unload(Tank tank) {
		//���õ� ����� ������
		System.out.println("���ۼ� ��ũ ��ġ("+tank.getX()+", "+tank.getY()+"�¿��");
	}
	@Override
	void move(int x, int y) {
		this.x=x-100;
		this.y=y-500;
		System.out.println(n+"��ġ: "+this.x+", "+this.y);
	}
	@Override
	void stop() {
		System.out.println(n+"�� ������ġ���� ����");
	}
}
