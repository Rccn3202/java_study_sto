package javaMid3.b1318.a01;

public class Product {  //���ҿ� ���� ��
	int price;
	int bonusPoint;
	
	public Product() {    } //�⺻������
	
	public Product(int price) { //����� ������
		this.price=price;
		bonusPoint=(int)(price/10.0); //�������̴ϱ� �Ǽ������� �������� ���������� �ٿ�ĳ����

	}
}
