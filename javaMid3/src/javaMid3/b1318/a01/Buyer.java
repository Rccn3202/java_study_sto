package javaMid3.b1318.a01;

public class Buyer {    //물건 사는 손님
	int money=1000;
	int bonusPoint =0;
	
	Product[] item=new Product[10];
	int i=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족함");
			return;
		}
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		item[i++]=p; //(제품을 산 목록)item 0렬에 물건 이름 넣어줌 . 10번지라는 주소를 item 0렬에 넣는다
		System.out.println(p+"을/를 구매하셨습니다");
	}
	
	void summary() {
		int sum=0;
		String itemList="";
		for(int i=0;i<item.length;i++) {  //
			if(item[i]==null) break;
			sum+=item[i].price;
			itemList+=item[i]+",";
			
			if((item)[++i]!=null) System.out.print(","); 
		}
		System.out.println("입니다");
		System.out.println();
		System.out.println("구입하신 물품의 총 금액은 "+sum+" 만원입니다");
		System.out.println("구입하신 제품은 "+itemList+" 입니다");
	}
	
}
