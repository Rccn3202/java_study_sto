package javaMid7.p394;

public class AnyEx {

	public static void main(String[] args) {
		Button btnOk=new Button();
		
		class Oklistener implements Button.ClickListener{  
			@Override
			public void onClick() {
				System.out.println("Ok��ư Ŭ��");
			}
		}
		btnOk.setClickListener(new Oklistener()); //��ü ����, ������ set�� ����
		btnOk.click();
		
		Button btnCancle=new Button();
		
		class CancleListener implements Button.ClickListener{
			@Override
			public void onClick() {
			System.out.println("Cancel��ư Ŭ��");
			}	
		}
		
		btnCancle.setClickListener(new CancleListener());
		btnCancle.click();
		
		//�����̽��ٸ� �������ϴ�
	class Space implements Button.ClickListener{
		@Override
		public void onClick() {
		System.out.println("�����̽��ٸ� �������ϴ�");	
		}
	}
		btnCancle.setClickListener(new CancleListener());
		btnCancle.click();
		
		
		
		
		//���콺�� Ŭ���߽��ϴ�
		
	}

}
