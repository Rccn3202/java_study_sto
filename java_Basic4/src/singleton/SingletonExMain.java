package singleton;

import java.util.Calendar;

public class SingletonExMain {

	public static void main(String[] args) {
		
		Single ss=Single.getInstance();  //single class�� getInstance�� ȣ���Ѵ�.(static�̹Ƿ� �� ������ �ʿ����)
		Single ss2=Single.getInstance();
		
		System.out.println(ss);
		System.out.println(ss2);
		
	}

}
