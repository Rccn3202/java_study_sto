package javaMid4.P368;

import javaMid4.C;

public class Main {

	public static void main(String[] args) {
		//��ü �����غ��� 
		B b =new B() ;
		
		
		//������
		B b1 =new D();
		A a4=new E();  //E���ʿ� A �����Ƿ� ���� �ȳ���.
		B b2=new E(); //���� ���� ������ E�� �θ�� C(C�� �θ�� A) B�� E�� ���� ����.
		
		//a1�̶�� ������������ C Ŭ������ �޼ҵ带 ȣ���ϰ�ʹ�?
		//�Ǳ� �Ǵµ� A�� A,C ��� ������ �����Ƿ� C�� �θ����� �ٿ�ĳ���� �ؾ��Ѵ�.
		 C c2=a1; //a1�� c2�� ���⿣ �ʹ� ũ��. a1�� add cast�� �ϸ�(�ٿ�ĳ�����ϸ�)
		 C c2=(C) a1; //�� �ǰ�
		 c2.c1(); //�̷��� ���� ��� ����
		

	}

}
