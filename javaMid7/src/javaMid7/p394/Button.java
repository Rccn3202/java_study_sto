package javaMid7.p394;

public class Button {

	//���� ��ø �������̽�
	public static interface ClickListener{  
		//�߻� �޼ҵ�
		void onClick();
		
		
	}
	private ClickListener clickListener; //��ư Ŭ���� �ȿ����� ��� ����
	
	public void setClickListener(ClickListener clickListener) { //10���� ����
		this.clickListener=clickListener; 
	}
	
	public void click() {
		this.clickListener.onClick();  //���� onClick �޼ҵ带 ȣ��  10������ �ִ� ��Ŭ�� ȣ���ϼ���
	}
}
