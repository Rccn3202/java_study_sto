package javaBasic2.ch05;

public class RefEx02 {

	public static void main(String[] args) {
		//Car Ŭ���� ������
		//�ʵ�� carKind,carPrice �ڵ��� ����  (�ʵ�� ����,���ڴϱ� String ����)
		//���� �ҳ�Ÿ 3500
		Car ca=new Car();
		Car ca1=new Car();
		City ci=new City();
		City ci1=new City();
		
		
		ca.carKind="�ҳ�Ÿ";
		ca.carPrice=3500;
		ca1.carKind="�׷���";
		ca1.carPrice=5000;
		

		ci.cityName="�ϳ���";
		ci.cityLocation="��⵵";
		ci.cityTex=0.125;
		ci.cityGood=true;
		ci1.cityName="������";
		ci1.cityLocation="�����";
		ci1.cityTex=0.134;
		ci1.cityGood=true;
		
		System.out.println(ca.carKind);
		System.out.println(ca.carPrice);
		System.out.println(ca1.carKind);
		System.out.println(ca1.carPrice);
		
		System.out.println();
		
		System.out.println(ci.cityName);
		System.out.println(ci.cityLocation);
		System.out.println(ci.cityTex);
		System.out.println(ci.cityGood);
		System.out.println(ci1.cityName);
		System.out.println(ci1.cityLocation);
		System.out.println(ci1.cityTex);
		System.out.println(ci1.cityGood);
		
		
	}

}

class Car{
		String carKind;
		int carPrice;
		//�޼ҵ�(����) ���� : ����Ÿ�� �޼����(�޼��� ȣ��� �� �־��ִ� ����) {ó���� �����}
		void m1() {
			System.out.println("car Ŭ���� m1 �޼ҵ�");
		}
}

class City{
	String cityName;
	String cityLocation;
	double cityTex;
	boolean cityGood;
}
