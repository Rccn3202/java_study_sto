package javaBasic4.day01;

public class StaticEx02 {

	//static�� ����-�޼ҵ� ������ �ö�
	//���α׷� �����ֱ� : ����(��������)-Ȱ��-�Ҹ�(���α׷��� ������ �Ҹ�)
	static int a=100;  //static�� �پ��ִ� ���� ���α׷� ������ �� ����, ���α׷� ����Ǹ� �Ҹ�/�� ��� �޸𸮿� ��������
	static double b=3.14;  //static ����, ��������
	static String name="ȫ�浿";  //�α���, ��������Ʈ, ��ٱ��� �� ȭ���� �ٲ� ��� �����Ǿ�� �ϴ� ����
	
	//static �Ⱥ��� - �޼ҵ� ������ ����. ����ϸ� non-static ���� ���´�,
	int c=200;  //�ν��Ͻ� ����, ��������
	double d=5.5; //��ü���� new �ϸ� ������, �ش� Ŭ������ �����(���� ������) �Ҹ�
	String add="�ϳ���";
	
	public static void main(String[] args) {
		System.out.println(a+" "+b+" "+name);
		// System.out.println(c+" "+d+" "+add); //�޸𸮿� �ö��� ���� �ʵ��̹Ƿ� ������ ���� ���� �ȳ����� new ��ü�����Ѵ�
		StaticEx02 se02=new StaticEx02();
		System.out.println(se02.c+" "+se02.d+" "+se02.add);
	}

}
