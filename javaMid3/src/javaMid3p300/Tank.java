package javaMid3p300;

public class Tank extends Unit {
	String n="탱크";
	
	void changeMode() {
		//공격모드를 변환
		System.out.println("공격모드");
	}
@Override
void move(int x, int y) {
	super.x=x-50;
	super.y=y+50;
	System.out.println(n+"위치"+super.x+", "+super.y);
	
}
@Override
void stop() {
	System.out.println("정지");

}
}
