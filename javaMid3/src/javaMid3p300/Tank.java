package javaMid3p300;

public class Tank extends Unit {
	String n="��ũ";
	
	void changeMode() {
		//���ݸ�带 ��ȯ
		System.out.println("���ݸ��");
	}
@Override
void move(int x, int y) {
	super.x=x-50;
	super.y=y+50;
	System.out.println(n+"��ġ"+super.x+", "+super.y);
	
}
@Override
void stop() {
	System.out.println("����");

}
}
