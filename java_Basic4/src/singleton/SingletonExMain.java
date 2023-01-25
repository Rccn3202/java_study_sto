package singleton;

import java.util.Calendar;

public class SingletonExMain {

	public static void main(String[] args) {
		
		Single ss=Single.getInstance();  //single class의 getInstance를 호출한다.(static이므로 뉴 생성자 필요없음)
		Single ss2=Single.getInstance();
		
		System.out.println(ss);
		System.out.println(ss2);
		
	}

}
