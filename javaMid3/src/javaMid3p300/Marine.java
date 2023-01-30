package javaMid3p300;

public class Marine extends Unit {
	String n="보병";

	void stimPack() {
		//스팀팩을 사용한다.	
		System.out.println("스팀팩을 사용한다.");
	}
	
	
	
	
	
	@Override
	void move(int x, int y) {
		super.x=x+10;  //super.x : 부모의 x 또는 this. 이용
		//this.x=x+10;  //this.x  :자기 클래스에 x 값 없으면 부모클래스 x값 가져온다.
		super.y=y-10;
		System.out.println(n+"위치: "+super.x+", "+super.y);
	}
	
	@Override
	void stop() {
		System.out.println("정지");
		
	}
}


