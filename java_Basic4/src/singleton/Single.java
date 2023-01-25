package singleton;

public class Single {
	
	private static Single s=new Single();
	
	private Single() {   //자기 클래스에서는 사용 가능, 다른곳에서는 사용x
		
	}
	String now() {     //날짜 관련 메소드 private
		return "2023-01-25";
	}
	
	public static Single getInstance() {    //Single의 참조변수 중 Instance 관련 메소드만 퍼블릭
		return s;
	}

}
