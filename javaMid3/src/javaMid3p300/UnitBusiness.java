package javaMid3p300;

import java.util.Scanner;

public class UnitBusiness {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Marine marine=new Marine();
		Tank tank=new Tank();
		Dropship dropship=new Dropship();
		
		System.out.println(marine.n+"�� ��ġ");
		int x=sc.nextInt();
		marine.setX(x);
		int y=sc.nextInt();
		marine.setY(y);
		marine.move(x, y);
		marine.stop();
		
		System.out.println("��ũ�� ��ġ");
		x=sc.nextInt();
		tank.setX(x);
		y=sc.nextInt();
		tank.setY(y);
		tank.move(x, y);
		tank.stop();
		tank.changeMode();
		
		System.out.println("���ۼ��� ��ġ");
		x=sc.nextInt();
		dropship.setX(x);
		y=sc.nextInt();
		dropship.setY(y);
		dropship.move(x, y);
		dropship.load(marine);
		dropship.unload(tank);
		
		
		
		
	}
	

}
