package javaBasic3.ch06.day02;

public class ClassEx04 {

	public static void main(String[] args) {
		//234������ ���� ���� �Ű�����
		Computer c1=new Computer();
		System.out.println(c1.sum(1,2));
		System.out.println(c1.sum(1,2,3,4));
		
		System.out.println(c1.cc("a", "b"));
		System.out.println(c1.cc("a", "b", "c"));
		
	}

}
class Computer{
	int sum(int ... values) { //...:������, ������ 
		int total=0;
		for(int i=0;i<values.length;i++) {
			total +=values[i];
		}
			return total;
		
	}
	
	String cc (String ... a) {
		String all=null;
		for(int i=0;i<a.length;i++) {
			all +=a[i];
		}
		return all;
	}
		
	//�޼ҵ���� �����ѵ� �Ű������� �ٸ� ��-�޼ҵ� ����(�����ε�)
/*	int sum(int a, int b) {
		return a+b;
	}
	int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	*/
	
	
}