package javaBasic1;

public class OperandEx1 {

	public static void main(String[] args) {
		// ������
		int a=10;
		//11���
		//System.out.println(a+1); //���1
		//a = a+1;
		//System.out.println(a); //���2
		//a++; //���3
		//++a;
		//System.out.println(a); 
		
		
		//9 ���
//		a--;
//		System.out.println(a);

		int b,c;
		//��: b������ 11�� �־ ������ּ���
	//	b = 11; //���1
	//	b = a+1; //���2 
//		a++; //���3
//		b = a;
//		System.out.println(b);
		b= ++a; //a=a+1 b=a  : 11 -> 11
		b= a++; //b=a a=a+1 : 10 -> 11
		System.out.println(a+ " " + b);
		
		int d=20;
		System.out.println(++d); //
		
	}

}
