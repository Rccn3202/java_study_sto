package javaBasic2.ch05.day3;

public class Ex03 {

	public static void main(String[] args) {
		//shopŬ���� �����
//		�ʵ�� 
//		String shopName; //���Ը�
//		String shopType; //���� ����
//		int sale; //�����
//		�Է°� : KT, �ڵ�������, 1000
		
		Shop sh=new Shop();
		
		sh.setShopName("KT");
		System.out.println(sh.getShopName());
		
		sh.setShopType("�ڵ�������");
		System.out.println(sh.getShopType());
		
		sh.setSale(1000);
		System.out.println(sh.getSale());
		}

}

class Shop {
	
	String shopName;
	String shopType;
	int sale;
	
	void setShopName(String shopName) {
		this.shopName=shopName;
	}
	void setShopType(String shopType) {
		this.shopType=shopType;
	}
	void setSale(int sale) {
		this.sale=sale;
	}
	
	String getShopName() {
		return this.shopName;
	}
	String getShopType() {
		return this.shopType;
	}
	int getSale() {
		return this.sale;
	}
}
