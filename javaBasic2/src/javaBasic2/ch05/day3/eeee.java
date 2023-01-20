package javaBasic2.ch05.day3;

import java.util.Scanner;

public class Eeee {
	
	public static void main(String[] args) {
		
		Test t=new Test();
		System.out.println("Name : "+t.name);
		System.out.println("School : "+t.school);
		System.out.println("Grade : "+t.grade);
		
	}

}
class Test {
	
	String name;  //이름
	String school;  //학교명
	int grade;  //학년
	
	Scanner sc=new Scanner(System.in);{
	
	name = sc.next();
	school=sc.next();
	grade=sc.nextInt();		

	
	}
}