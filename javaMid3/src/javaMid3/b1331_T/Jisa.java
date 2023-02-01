package javaMid3.b1331_T;

public class Jisa { //6.부모클래스 생성
//*전제 : 각 지사는 한번만 입력 가능  7.
	 String jisaName; //지사명
	 String proName; //제품명
	 int proPrice; //제품가겨겨
	 int saleAmount; //제품 판매량
	 int saleStatus;  //매출현황     8.
	 
	 
	public String getJisaName() {
		return jisaName;
	}
	public void setJisaName(String jisaName) {
		this.jisaName = jisaName;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getProPrice() {
		return proPrice;
	}
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	public int getSaleAmount() {
		return saleAmount;
	}
	public void setSaleAmount(int saleAmount) {
		this.saleAmount = saleAmount;
	}
	public int getSaleStatus() {return saleStatus;}	
	public void setSaleStatus(int saleStatus) {	this.saleStatus = saleStatus;} 
	//9.세터게터 생성
	
}
