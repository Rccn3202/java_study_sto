package javaMid3p300;

public class Dropship extends Unit {
	String n="수송선";
	
	void load(Marine marine) {  //마린변수 준다
		//선택된 대상을 태운다
		System.out.println("수송선 보병 위치("+marine.getX()+", "+marine.getY()+"태운다");  //마린 주소에 있는 x 값 호출
	}
	void unload(Tank tank) {
		//선택된 대상을 내린다
		System.out.println("수송선 탱크 위치("+tank.getX()+", "+tank.getY()+"태운다");
	}
	@Override
	void move(int x, int y) {
		this.x=x-100;
		this.y=y-500;
		System.out.println(n+"위치: "+this.x+", "+this.y);
	}
	@Override
	void stop() {
		System.out.println(n+"의 현재위치에서 정지");
	}
}
