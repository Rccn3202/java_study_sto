package javaMid7.p419;

public class Car {  //����Ͻ� Ŭ����
	
	Tire t1=new Tire()  {
		@Override
		public void roll() {
		System.out.println("�Ϲ�Ÿ�̾�");	
		}
	};

	Tire t2=new Tire() {  
		
	public void roll() {};
	System.out.println("��ȣ")
	}
};
