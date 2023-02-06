package javaMid7.p394;

public class AnyEx {

	public static void main(String[] args) {
		Button btnOk=new Button();
		
		class Oklistener implements Button.ClickListener{  
			@Override
			public void onClick() {
				System.out.println("Ok버튼 클릭");
			}
		}
		btnOk.setClickListener(new Oklistener()); //객체 생성, 번지수 set에 담음
		btnOk.click();
		
		Button btnCancle=new Button();
		
		class CancleListener implements Button.ClickListener{
			@Override
			public void onClick() {
			System.out.println("Cancel버튼 클릭");
			}	
		}
		
		btnCancle.setClickListener(new CancleListener());
		btnCancle.click();
		
		//스페이스바를 눌렀습니다
	class Space implements Button.ClickListener{
		@Override
		public void onClick() {
		System.out.println("스페이스바를 눌렀습니다");	
		}
	}
		btnCancle.setClickListener(new CancleListener());
		btnCancle.click();
		
		
		
		
		//마우스를 클릭했습니다
		
	}

}
