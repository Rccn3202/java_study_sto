package javaBasic2.ch05.day3;

public class Ex163 {

	public static void main(String[] args) {
		// 문자열 분리
		String board="번호,제목,내용,글쓴이";
		String board1="번호1 제목1 내용1 글쓴이1";
		String board2="번호2-제목2-내용2-글쓴이2";
		String board3="번호3:제목3:내용3:글쓴이3";
		
		String[] b=board.split(",");
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		String[] b1=board1.split(" ");
		System.out.println(b1[0]);
		System.out.println(b1[3]);
		
		String[] b2=board2.split("-");
		System.out.println(b2[2]);
		System.out.println(b2[3]);
		
		String[] b3=board3.split(":");
		System.out.println(b3[1]);
		System.out.println(b3[3]);
		
		System.out.println("----------------------");
		
		String hong="홍길동-20세,이순신-25세,최영-30세";
		String[] h=hong.split(",");
		String[] h2=h[0].split("-");
		System.out.println(h2[0]);
		System.out.println(h2[1]);
		
		String[] h3=h[1].split("-");
		System.out.println(h3[0]);
		System.out.println(h3[1]);
		
		String[] h4=h[2].split("-");
		System.out.println(h4[0]);
		System.out.println(h4[1]);
		
		
	
		
	}

}
