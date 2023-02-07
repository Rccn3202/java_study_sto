package javaMid8.exp422;

public class Ex01 {

	public static void main(String[] args) {
		//3 
		//인스턴스 멤버 객체 생성
		OutterA o=new OutterA(); //바깥클래스 객체가 있어야 사용가능
		OutterA.InnerA a=o.new InnerA();
	
		//정적멤버 객체 생성
		OutterA.InnerB b=new OutterA().InnerB();
	} 

}
