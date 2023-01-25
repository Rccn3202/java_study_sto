package javaBasic3.ch06.day02;

public class ClassEx04 {

	public static void main(String[] args) {
		//234페이지 가변 길이 매개변수
		Computer c1=new Computer();
		System.out.println(c1.sum(1,2));
		System.out.println(c1.sum(1,2,3,4));
		
		System.out.println(c1.cc("a", "b"));
		System.out.println(c1.cc("a", "b", "c"));
		
	}

}
class Computer{
	int sum(int ... values) { //...:나머지, 여러개 
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
		
	//메소드명은 동일한데 매개변수가 다른 것-메소드 재사용(오버로딩)
/*	int sum(int a, int b) {
		return a+b;
	}
	int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	*/
	
	
}