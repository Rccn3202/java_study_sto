package javaMid3p297;

public class Unit_m {

	int x=0;
	int y=0;
	int newx=0;
	int newy=0;
	
	String n=null;
	
	void move(int x, int y) {
		System.out.print(n+"의 위치: ");
		System.out.println("( "+(x+newx)+", "+(y+newy)+" )");
	}
	void stop() {
		System.out.println(n+" 현재 위치에서 정지");
	}
	void stimpack() {
		
	}
}
