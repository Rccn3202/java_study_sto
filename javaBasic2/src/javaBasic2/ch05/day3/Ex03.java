package javaBasic2.ch05.day3;

public class Ex03 {

	public static void main(String[] args) {
		//shop클래스 만들기
//		필드는 
//		String shopName; //가게명
//		String shopType; //가게 종류
//		int sale; //매출액
//		입력값 : KT, 핸드폰가게, 1000
		
		Shop sh=new Shop();
		
		sh.setShopName("KT");
		System.out.println(sh.getShopName());
		
		sh.setShopType("핸드폰가게");
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
