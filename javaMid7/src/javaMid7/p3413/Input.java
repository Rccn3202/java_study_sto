package javaMid7.p3413;

import java.util.Scanner;

public class Input {
	int width=0;
	int length=0;
	int height=0;
	
public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void print() {
		Scanner sc=new Scanner(System.in);
		System.out.println("가로> ");
		width=sc.nextInt();
		System.out.println("세로> ");
		length=sc.nextInt();
		System.out.println("높이> ");
		height=sc.nextInt();
		
	}
}
