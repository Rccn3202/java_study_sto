package a;

import a.aa.AA;
import b.B;
import b.ba.BA;

public class Main {

	public static void main(String[] args) {
		//B클래스의 정적 변수값을 출력하기
		System.out.println(B.getSb());  //Main이라는 클래스가 B클래스의 sb를 사용
		//B 클래스의 sb가 private여서 접근 불가한 경우 getter setter를 public으로 선언
		
		
		//AA클래스 인스턴스 변수값을 출력하기
		AA aa=new AA();  //인스턴스니까 new로 객체생성해야함
		System.out.println(aa.getName());
		System.out.println(aa.getPhone());
		
		
		System.out.println(BA.getSd());   //정적변수값
		BA ba=new BA();
		System.out.println(ba.getId());    //인스턴스

	}

}
