package javaBasic2.ch05.day3;

import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		
		Test t=new Test();
		System.out.println("Name : "+t.name);
		System.out.println("School : "+t.school);
		System.out.println("Grade : "+t.grade);
		
	}

}
class Test {
	
	String name;  //�̸�
	String school;  //�б���
	int grade;  //�г�
	
	Scanner sc=new Scanner(System.in);{
	
	name = sc.next();
	school=sc.next();
	grade=sc.nextInt();		


	}

}
