package javaMid8.exp422;

public class Anonymous {
	
	Vehicle field=new Vehicle() {
		public void run() {
		System.out.println("������");  }
	};
	
	void method1() {   //�͸�����ü
		Vehicle localVar=new Vehicle() {
			@Override
			public void run() {
				System.out.println("�¿���");
			}
			
		};
		localVar.run();
	}
	
	void method2(Vehicle v) { 
		v.run();
	}
}
