package a;

import a.aa.AA;
import b.B;
import b.ba.BA;

public class Main {

	public static void main(String[] args) {
		//BŬ������ ���� �������� ����ϱ�
		System.out.println(B.getSb());  //Main�̶�� Ŭ������ BŬ������ sb�� ���
		//B Ŭ������ sb�� private���� ���� �Ұ��� ��� getter setter�� public���� ����
		
		
		//AAŬ���� �ν��Ͻ� �������� ����ϱ�
		AA aa=new AA();  //�ν��Ͻ��ϱ� new�� ��ü�����ؾ���
		System.out.println(aa.getName());
		System.out.println(aa.getPhone());
		
		
		System.out.println(BA.getSd());   //����������
		BA ba=new BA();
		System.out.println(ba.getId());    //�ν��Ͻ�

	}

}
