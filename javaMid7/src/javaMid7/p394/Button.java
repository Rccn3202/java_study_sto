package javaMid7.p394;

public class Button {

	//정적 중첩 인터페이스
	public static interface ClickListener{  
		//추상 메소드
		void onClick();
		
		
	}
	private ClickListener clickListener; //버튼 클래스 안에서만 사용 가능
	
	public void setClickListener(ClickListener clickListener) { //10번지 넣음
		this.clickListener=clickListener; 
	}
	
	public void click() {
		this.clickListener.onClick();  //위의 onClick 메소드를 호출  10번지에 있는 온클릭 호출하세요
	}
}
