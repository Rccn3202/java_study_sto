package javaMid3p300;

public class Marine extends Unit {
	String n="����";

	void stimPack() {
		//�������� ����Ѵ�.	
		System.out.println("�������� ����Ѵ�.");
	}
	
	
	
	
	
	@Override
	void move(int x, int y) {
		super.x=x+10;  //super.x : �θ��� x �Ǵ� this. �̿�
		//this.x=x+10;  //this.x  :�ڱ� Ŭ������ x �� ������ �θ�Ŭ���� x�� �����´�.
		super.y=y-10;
		System.out.println(n+"��ġ: "+super.x+", "+super.y);
	}
	
	@Override
	void stop() {
		System.out.println("����");
		
	}
}


