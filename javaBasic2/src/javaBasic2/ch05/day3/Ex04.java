package javaBasic2.ch05.day3;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer com1=new Computer();
		com1.setComputerName("IBM 17");
		com1.setPrice(500);
		com1.setManufacturer("삼성");
		
		System.out.println(com1.getComputerName());
		System.out.println(com1.getPrice());
		System.out.println(com1.getManufacturer());
		
		System.out.println("----------------------");
		
		//tv 클래스 만들고 값: tvsize 15, tvPrice 300, tvMedel tv1500
		TV tv1 = new TV();
		tv1.setTvSize(15);
		tv1.setTvPrice(500);
		tv1.setTvModel("tv1500");
		
		System.out.println(tv1.getTvSize());
		System.out.println(tv1.getTvPrice());
		System.out.println(tv1.getTvModel());
	}

}

class Computer{
	String computerName;
	int price;
	String manufacturer;
	
	//setter메소드 getter메소드 자동으로 만들어주기
	public String getComputerName() {
		return computerName;
	}
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	} 
	
	
}

class TV{
	int tvSize;
	int tvPrice;
	String tvModel;
	
	public int getTvSize() {
		return tvSize;
	}
	public void setTvSize(int tvSize) {
		this.tvSize = tvSize;
	}
	
	public int getTvPrice() {
		return tvPrice;
	}
	public void setTvPrice(int tvPrice) {
		this.tvPrice = tvPrice;
	}
	
	public String getTvModel() {
		return tvModel;
	}
	public void setTvModel(String tvModel) {
		this.tvModel = tvModel;
	}
	
	
}

