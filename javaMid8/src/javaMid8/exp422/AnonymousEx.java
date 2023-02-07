package javaMid8.exp422;
//방법 3가지
public class AnonymousEx {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {  //많이 쓰는 구조 /메소드 (메개변수/메개변수 안에다가 아예 익명 자식객체 구현) {오버라이드-run 메소드 호출}
			@Override
			public void run() {
				System.out.println("트럭");
			}
		}
		); //end method2

	}

}
