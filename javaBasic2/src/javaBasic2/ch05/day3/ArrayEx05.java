package javaBasic2.ch05.day3;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		// movie ticketing
		
		 
		/* String setW;
		int per1;
		int per2;    */
	
		
			
		
		//1줄 입력-실구매금액 계산/ 2줄 / 3줄
		//1,2,3줄 출력
		
		//Movie[] MovArr= {new Movie(),new Movie(11),new Movie()};  ----->내가 만들었던 것
		Movie[] m=new Movie[3];
		Scanner sc=new Scanner(System.in);	
		
		for(int i=0;i<m.length;i++) {
			m[i]=new Movie();
			
			System.out.println((i+1)+"번째 레코드(줄)===> ");
			
			System.out.println("영화명> ");
			String MovieName=sc.next(); //--------->아래 클래스와 다른 변수
			
			System.out.println("금액> ");
			int MoviePrice=sc.nextInt();
			
			System.out.println("나이> ");
			int Age=sc.nextInt();
			
			System.out.println("구매방법> ");
			String type=sc.next();
			
			m[i].setMn(MovieName);  //------>위에 입력된 moviename이 Mn에 담긴다   //moviename에 담는거랑 sc.next랑 무슨차이
			m[i].setP(MoviePrice);
			m[i].setAge(Age);
			m[i].setType(type);
			
			m[i].price();   //----->아래 클래스의 price(계산메소드)를 호출
			 
		}
		System.out.printf("%10s,%10s,%10s,%10s","영화명","금액","나이","실구매액");
		for(int i=0;i<m.length;i++) {
			System.out.printf("%10d,%10d,%10d,%10d",m[i].getMn(),m[i].getP(),m[i].getAge(),m[i].getW());
		}
		
	/*	if(setW.equals("인터넷")) {
			per=5;
		} else if(setW.equals("현장구매")) {
			per=0;
		} else(setW.equals("쿠폰구매")) {
			per=10;
		}  
		
		if(MovArr[0].getAge()<20) {
			per2=25;
		} else if(20<=MovArr[0].getAge() && MovArr[0].getAge()<=30) {
			per2=20;
		} else if(30<=MovArr[0].getAge()) {
			per2=15;
		}    */
		
		
		
/*		MovArr[0].setMn("1917");
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
		MovArr[2].setW("인터넷");    */
		
		

	/*	
		System.out.println("영화명 금액 나이 실구매금액");
		System.out.println(MovArr[0].getMn()+ "  "+MovArr[0].getP()+"  "+MovArr[0].getAge()+" "+MovArr[0].getPrice()); //!!! 실구매금액 계산 필요
		System.out.println(MovArr[1].getMn()+ "  "+MovArr[1].getP()+"  "+MovArr[1].getAge()+" "+MovArr[0].getPrice());
		System.out.println(MovArr[2].getMn()+ "  "+MovArr[2].getP()+"  "+MovArr[2].getAge()+" "+MovArr[0].getPrice());
		*/
		
		


} //end main
} //end class

class Movie{
	String Mn; //영화명
	int p; //영화가격
	int age; //나이
	String type;//현장구매,인터넷..
	int w; //실구매액
	double rate; //할인율
	
	//실제구매액 계산 메소드
	public int price() {
		if(age<20) rate=0.25; 
		else if(age>=20 && age<30) rate=0.2;
		else rate=0.15;
		
		if(type.equals("인터넷")) rate=rate+0.05;
		else if(type.equals("쿠폰")) rate=rate+0.1;
		
		w=(int)(p*(100-rate));
		return w;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	
	
	
	
	
	
}