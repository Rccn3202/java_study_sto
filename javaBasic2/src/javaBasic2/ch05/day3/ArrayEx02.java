package javaBasic2.ch05.day3;

public class ArrayEx02 {

	public static void main(String[] args) {
	/*	Banchan b1=new Banchan();
		Banchan b2=new Banchan();
		Banchan b3=new Banchan();

		Banchan[] banArr= {b1,b2,b3};   */
		
		Banchan[] banArr= {new Banchan(),new Banchan(),new Banchan()}; //2. 객체+배열 생성 /위의 세줄+배열생성과 같은 것
		System.out.println(banArr[0]); //위 {} 중 첫번째꺼 출력
		System.out.println(banArr[1]);
		System.out.println(banArr[2]);
		
		//3. [0]주소에 조림류 10 5 입력해보기
		banArr[0].setKind("조림류");
		banArr[0].setMakeFood(10);
		banArr[0].setMakeFood(5);
		
		System.out.println(banArr[0].getKind()); //4. 출력하기
		System.out.println(banArr[0].getMakeFood());
		System.out.println(banArr[0].getSaleFood());
		
		//[1]주소 국 7 3
		banArr[1].setKind("국");
		banArr[1].setMakeFood(7);
		banArr[1].setMakeFood(3);
		
		System.out.println(banArr[1].getKind()); 
		System.out.println(banArr[1].getMakeFood());
		System.out.println(banArr[1].getSaleFood());
		
		//[2]주소 샐러드 15 13
		banArr[2].setKind("샐러드");
		banArr[2].setMakeFood(15);
		banArr[2].setMakeFood(13);
		
		System.out.println(banArr[2].getKind());
		System.out.println(banArr[2].getMakeFood());
		System.out.println(banArr[2].getSaleFood());
		
		//문) class Hospital 만들고 
		//필드는 진료과목(medical department) -치과 내과 정형외과 통증의학과
		//의사명(doctor name) -김수영 최진민 박명호 정경미
		//진료일(treatment day) -20230117 20230116 20230112 20230110
		
		
		Hospital[] HoArray= {new Hospital(),new Hospital(),new Hospital(),new Hospital()} ;
		
		System.out.println("진료과목  의사명  진료일");
		
		
		HoArray[0].setMd("치과");
		HoArray[0].setDn("김수영");
		HoArray[0].setTd("20230117");
		
		HoArray[1].setMd("내과");
		HoArray[1].setDn("최진민");
		HoArray[1].setTd("20230116");
		
		HoArray[2].setMd("정형외과");
		HoArray[2].setDn("박명호");
		HoArray[2].setTd("20230112");
		
		HoArray[3].setMd("통증의학과");
		HoArray[3].setDn("정경미");
		HoArray[3].setTd("20230110");
		
		
		
		System.out.println();
		
		System.out.println("진료과목  의사명  진료일");
		System.out.println(HoArray[0].getMd()+ "  "+HoArray[0].getDn()+"  "+HoArray[0].getTd());
		System.out.println(HoArray[1].getMd()+ "  "+HoArray[1].getDn()+"  "+HoArray[1].getTd());
		System.out.println(HoArray[2].getMd()+ "  "+HoArray[2].getDn()+"  "+HoArray[2].getTd());
		System.out.println(HoArray[3].getMd()+ "  "+HoArray[3].getDn()+"  "+HoArray[3].getTd());
		
		//출력을 반복문으로 만들기
		for(int i=0;i<HoArray.length;i++) {
			System.out.println(HoArray[i].getMd()+ "  "+HoArray[i].getDn()+"  "+HoArray[i].getTd());
		}
		//향상된 for
		for(Hospital h:HoArray) {
			System.out.println(h.getMd()+ "  "+h.getDn()+"  "+h.getTd());
		}
		
		
	}

}

class Banchan{						//1. 클래스 생성
	String kind;
	int makeFood;
	int saleFood;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getMakeFood() {
		return makeFood;
	}
	public void setMakeFood(int makeFood) {
		this.makeFood = makeFood;
	}
	public int getSaleFood() {
		return saleFood;
	}
	public void setSaleFood(int saleFood) {
		this.saleFood = saleFood;
	}
	
}

class Hospital{
	String md;
	String dn;
	String td;
	
	public String getMd() {
		return md;
	}
	public void setMd(String md) {
		this.md = md;
	}
	public String getDn() {
		return dn;
	}
	public void setDn(String dn) {
		this.dn = dn;
	}
	public String getTd() {
		return td;
	}
	public void setTd(String td) {
		this.td = td;
	}
	
	
	
}