package javaMid8.exp422;

public class Anonymous {
	
	Vehicle field=new Vehicle() {
		public void run() {
		System.out.println("자전거");  }
	};
	
	void method1() {   //익명구현객체
		Vehicle localVar=new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차");
			}
			
		};
		localVar.run();
	}
	
	void method2(Vehicle v) { 
		v.run();
	}
}
