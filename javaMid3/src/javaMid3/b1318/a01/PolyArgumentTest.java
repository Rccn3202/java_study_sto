package javaMid3.b1318.a01;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b=new Buyer();
		b.buy(new Tv());  //new Tv�ּҸ� ���̾�Ŭ������ Product p�� �޴´�. 
		//���� Ƽ�� Ŭ������ ����Ʈ�� �������̵��� ���ϸ� p�� ����� �� �ּҰ� ���´�. �ּ�21312�������� �����Ͽ����ϴ�. �̷���
		//�ٵ� Ƽ��Ŭ������ ����Ʈ�� �������̵��ϸ� ���� �θ𿡼� Ƽ��Ŭ������ ������ ȣ���Ͽ����Ƿ� Ƽ��Ŭ������ "Tv"�� ���´�.  
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Ipad());
		b.buy(new Phone());
		b.buy(new Mouse());
		b.summary();
		
		//��ǰ ǰ��- �ڵ��� 150,�����е� 170����
	}

}
