package javaMid3.b1318;

public class Tv  {
	boolean power; //전원 필드
	int channel; //채널
	void power() { //전원
		power=!power;
	}
	void channelUp() { ++channel; } //채널 올리는 메소드
	void channelDown() {--channel;}
	
	
}
