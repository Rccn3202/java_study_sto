package javaMid4.a01;

public interface InConfig {
	void i1();
	
	//��� ���� �� ����(������ �ʴ� ��)
	static final double PI=3.14;
	static final boolean OK=true;
	static final int COMPUT_PRICE = 200;
	static final int PRINT_PRICE =30;
	
	//����Ʈ �޼ҵ�-�ٵ�{ } �� �� �� �ִ�. �������̵� ���ص� ��, �ڹ� 1.8 ���� �߰���
	default void di1() { }
	default int di2() {return 0;}
	
	//���� �޼ҵ嵵 �ٵ� �� �� ����.
	static void sd() { }
	private void a() { } 
}
