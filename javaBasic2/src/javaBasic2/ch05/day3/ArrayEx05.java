package javaBasic2.ch05.day3;


public class ArrayEx05 {

	public static void main(String[] args) {
		// movie ticketing
		
		String setW;
		int per1;
		int per2;
	
		
			
		
		
		Movie[] MovArr= {new Movie(),new Movie(),new Movie()};
		
	/*	if(setW.equals("인터넷")) {
			per=5;
		} else if(setW.equals("현장구매")) {
			per=0;
		} else(setW.equals("쿠폰구매")) {
			per=10;
		}  */
		
		if(MovArr[0].getAge()<20) {
			per2=25;
		} else if(20<=MovArr[0].getAge() && MovArr[0].getAge()<=30) {
			per2=20;
		} else if(30<=MovArr[0].getAge()) {
			per2=15;
		}
		
		
		
		MovArr[0].setMn("1917");
		MovArr[0].setP(11000);
		MovArr[0].setAge(10);
		MovArr[0].setW("인터넷");
		
		MovArr[1].setMn("1917");
		MovArr[1].setP(11000);
		MovArr[1].setAge(10);
		MovArr[1].setW("인터넷");
		
		MovArr[2].setMn("1917");
		MovArr[2].setP(11000);
		MovArr[2].setAge(10);
		MovArr[2].setW("인터넷");
		
		System.out.println("영화명 금액 나이 실구매금액");
		System.out.println(MovArr[0].getMn()+ "  "+MovArr[0].getP()+"  "+MovArr[0].getAge()+" "+MovArr[0].getPrice()); //!!! 실구매금액 계산 필요
		System.out.println(MovArr[1].getMn()+ "  "+MovArr[1].getP()+"  "+MovArr[1].getAge()+" "+MovArr[0].getPrice());
		System.out.println(MovArr[2].getMn()+ "  "+MovArr[2].getP()+"  "+MovArr[2].getAge()+" "+MovArr[0].getPrice());

		
		
		


} //end main
} //end class

class Movie{
	String Mn;
	int p;
	int age;
	String w;
	
	void Price () {       //
		Price=p*(per1+per2);
	}
	


	
	
	
	
	public String getMn() {
		return Mn;
	}
	public void setMn(String mn) {
		Mn = mn;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getW() {
		return w;
	}
	public void setW(String w) {
		this.w = w;
	}
	
	int price;
	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getPer() {
		return per;
	}


	public void setPer(int per) {
		this.per = per;
	}
	int per;
	
	
	
}