package javaMid7.p3413;

import java.util.Scanner;

public class Input_T { //����Ͻ�
	Cal_T cal=new Cal_T();
	



	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("���� ");
		cal.setWidth(sc.nextInt());
		System.out.println("���� ");
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
