package javaMid3.b1331_T;

import java.util.Scanner;

public class SaleBusiness {  //2.
		Scanner sc;
		Seoul sj;
		Gyeongin gy;
		Gangwon ga;
		Jeju je;					//15. 14에서 생성된 객체를 다른 메소들이 쓸 수 있도록 함. 주소가 여기에 저장된다.
		
	public SaleBusiness() {
		 sc=new Scanner(System.in);   //13.스캐너 생성 -스캐너 왜 여기에 생성?
		 sj=new Seoul();
		 gy=new Gyeongin();
		 ga=new Gangwon();
		 je=new Jeju(); 					//14.객체생성  -이 객체를 다른 메소드들이 써야함
			
	}
	public void input() {   //5.인풋 아웃풋 메소드 생성
	//입력 메소드
		String yn="n";   //16. 변수선언
		
		do {
			System.out.println("지사는?");
			System.out.println("1. 서울 2.경인 3.강원 4.제주");
			System.out.println("선택은?");
			int jisaSelect=0;
			jisaSelect=sc.nextInt();   //18.지사명 입력받은 후 jisaSale에 저장된다.
			
			switch(jisaSelect) {
			case 1 : jisaInput(sj);break;
			case 2 : jisaInput(gy);break;
			case 3 : jisaInput(ga);break;
			case 4 : jisaInput(je);break;      //19. 스위치문 작성. 서울을 선택하면 그 주소를 sj에 넘겨줌/아직 jisaInput 안만듦
			}
			
			System.out.println("계속하시겠습니까 y/n");
			yn=sc.next();  
			sc.nextLine();    //22. yn 입력
			
		}while(yn.equalsIgnoreCase("y")); //계속하시겠습니까   //17.와일문 작성 (equalsIgnoreCase:대소문자 상관없이 같다고 받음)
	}  
	
	
	

	private void jisaInput(Jisa js) {   //20.다형성 사용 -각 지사별로 다 메소드 만들지 말고 아예 변수를 지사(부모클래스)로 선언
		
		System.out.print("제품은?");
		
		
		if (js instanceof Seoul) {   //만약에 js가 Seoul꺼면.../입
			sj=(Seoul) js;
			sj.setProName(sc.next());  //컴튜터라고 입력
			sc.nextLine();
			System.out.println(sj+"지사 "+sj.getProName()+" 판매량은? "); //getPro~:입력받은 컴퓨터가 나옴  
			sj.setSaleAmount(sc.nextInt());    //21. 입력받은 서울정보 sj에 저장
			sj.setSaleStatus(saleStatusMethod(sj.getProName(),sj.getSaleAmount()));//24. 계산매소드 호출 괄호치고 필요한 값 저장, 그것을 메소드에 보내는 것
			sj.setProPrice(proPriceInput(sj.getProName())); //28.
		}
		if (js instanceof Gangwon) {   
			ga=(Gangwon) js;
			ga.setProName(sc.next()); 
			sc.nextLine();
			System.out.println(ga+"지사 "+ga.getProName()+" 판매량은? ");   
			ga.setSaleAmount(sc.nextInt());     
			ga.setSaleStatus(saleStatusMethod(ga.getProName(),ga.getSaleAmount()));
		}
		if (js instanceof Jeju) {   
			je=(Jeju) js;
			je.setProName(sc.next()); 
			sc.nextLine();
			System.out.println(je+"지사 "+je.getProName()+" 판매량은? ");   
			je.setSaleAmount(sc.nextInt());     
			je.setSaleStatus(saleStatusMethod(je.getProName(),je.getSaleAmount()));
		}
		if (js instanceof Gyeongin) {   
			gy=(Gyeongin) js;
			gy.setProName(sc.next()); 
			sc.nextLine();
			System.out.println(gy+"지사 "+gy.getProName()+" 판매량은? ");   
			gy.setSaleAmount(sc.nextInt());     //23. 지사별로 만들기
			gy.setSaleStatus(saleStatusMethod(gy.getProName(),gy.getSaleAmount()));
		}
		
		
	}
	public void output() {
	//출력 메소드	
		System.out.println("----------------------");
		System.out.println("---각 지사별 판매 현황----");
		System.out.println("---------------------");
		System.out.printf("%12s %10s %10s %10s %10s\n", "지사명","제품명","제품가격","판매량","매출현황"); //지사명이12s자리에 들어간다
		System.out.printf("%12s %10s %10s %10s %10s\n", sj+"지사",sj.getProName(),sj.getProPrice(),sj.getSaleAmount(),sj.getSaleStatus());
		
	}  //24.출력 입력
	
	public int saleStatusMethod(String proName, int amount) {       //12.계산메소드 생성   //25.괄호치고 받을 변수 넣기
	//계산 메소드	
		int saleStatus=0;   //매출현황에 계산된 값을 담을 변수
		if(proName.equals("컴퓨터")) {
			saleStatus=200*amount;
		} else if(proName.equals("프린터")){
			saleStatus=50*amount;
		} else {
			System.out.println("잘못입력");
		}
		return saleStatus;  //호출한 곳으로 다시 돌려준다-위의 saleStatusMethod(sj.get....에
	}  //26.계산메소드 입력
	
	//27.제품가격 메소드
	private int proPriceInput(String proName) {
		if(proName.equals("컴퓨터")) return 200;
		else if(proName.equals("프린터")) return 50;
		return 0;
	}
}











