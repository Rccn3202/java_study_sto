package javaMid3p286;

public class SmartPhone extends Phone {  //�ڽ�
	//�ʵ� ����
	public boolean wifi;
	
	//�����ڼ���
	public SmartPhone(String model, String color) {
		this.model=model;  //
		this.color=color;
	}
	
	//�޼ҵ� ����
	public void setWifi(boolean wifi) {
		this.wifi=wifi;
		System.out.println("�������� ���¸� �����߽��ϴ�");
	}
	
	public void internet() {
		System.out.println("���ͳݿ� ����");
	}
}
