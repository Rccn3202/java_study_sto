package javaMid3.b1318.a01;

public class Buyer {    //���� ��� �մ�
	int money=1000;
	int bonusPoint =0;
	
	Product[] item=new Product[10];
	int i=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ��� ������");
			return;
		}
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		item[i++]=p; //(��ǰ�� �� ���)item 0�Ŀ� ���� �̸� �־��� . 10������� �ּҸ� item 0�Ŀ� �ִ´�
		System.out.println(p+"��/�� �����ϼ̽��ϴ�");
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
		System.out.println("�Դϴ�");
		System.out.println();
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� "+sum+" �����Դϴ�");
		System.out.println("�����Ͻ� ��ǰ�� "+itemList+" �Դϴ�");
	}
	
}
