package javaBasic2.ch05.day2;

public class ClassEx153page {

	public static void main(String[] args) {
		// 153 ������
		String name="ȫ�浿�̼���������";
		String name1="ȫ�浿"; 
		//���� ȫ�浿�̹Ƿ� name,name1�� heap�޸� ���� ���� ����ȴ�
		//name�� name1�� ���� �ּҸ� ����Ų��.
		String name2=new String("ȫ�浿");
		String name3=new String("ȫ�浿"); 
		//���� �ٸ� heap�� ����
		//nema2�� name3�� �ٸ� heap�� ����ȴ�.
		
		//���� ����
		char c0=name.charAt(0);  
		System.out.println(c0);
				
		//���ڿ� ����
		int len=name.length();
		System.out.println("���� "+len);
		
		//���ڿ� ��ü : ������ ���� �̸����� �ٲٱ�
		String changeWord=name.replace("������","ȫ�浿");
		System.out.println(changeWord);
		
		//���ڿ� �߶󳻱�
		String cut=name.substring(3);
		System.out.println(cut);
		String cut2=name.substring(1,3);
		System.out.println(cut2);
		
		//���ڿ� ã��
		int index=name.indexOf("����");
		System.out.println(index);
	}

}
