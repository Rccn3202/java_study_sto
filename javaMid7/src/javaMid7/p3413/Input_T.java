package javaMid7.p3413;

import java.util.Scanner;

public class Input_T { //비즈니스
	Cal_T cal=new Cal_T();
	



	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("가로 ");
		cal.setWidth(sc.nextInt());
		System.out.println("세로 ");
		cal.setHeight(sc.nextInt());
	}
		void print() {
			cal.printA();
		
	}
	Cal_T ca1=new Cal_T() {
		input() {
		}
		
	};
	
}
