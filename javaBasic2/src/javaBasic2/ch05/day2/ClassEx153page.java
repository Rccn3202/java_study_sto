package javaBasic2.ch05.day2;

public class ClassEx153page {

	public static void main(String[] args) {
		// 153 페이지
		String name="홍길동이순신정현희";
		String name1="홍길동"; 
		//같은 홍길동이므로 name,name1은 heap메모리 같은 곳에 저장된다
		//name과 name1은 같은 주소를 가리킨다.
		String name2=new String("홍길동");
		String name3=new String("홍길동"); 
		//서로 다른 heap에 저장
		//nema2와 name3은 다른 heap에 저장된다.
		
		//문자 추출
		char c0=name.charAt(0);  
		System.out.println(c0);
				
		//문자열 길이
		int len=name.length();
		System.out.println("길이 "+len);
		
		//문자열 대체 : 정현희를 각자 이름으로 바꾸기
		String changeWord=name.replace("정현희","홍길동");
		System.out.println(changeWord);
		
		//문자열 잘라내기
		String cut=name.substring(3);
		System.out.println(cut);
		String cut2=name.substring(1,3);
		System.out.println(cut2);
		
		//문자열 찾기
		int index=name.indexOf("신정");
		System.out.println(index);
		
		//주말과제
		/*2.문자열 잘라내기 161 참고
		주민번호에서 7번째 자리는 성별. 1,3 남자 2,4 여자 판별
		생년월일 잘라서 년도, 월,일 구하기*/
	
		String ssn="880815-1234567";
		String year=ssn.substring(0,2);
		String month =ssn.substring(2,4);
		String day=ssn.substring(4,6);
		System.out.println(year+"년 "+month+ "월"+day+"일");
		
//		String gender=ssn.substring(7,8);
//		//문자열 "1" --> 숫자 1  /답 위주로 바꾸는게 빠름. Integer.~
//		int gValue=Integer.parseInt(gender);
//		if(gValue==1 || gValue==3) System.out.println("남");
//		if(gValue==2||gValue==4) System.out.println("여");
		
		String gender1 = ssn.substring(7,8);
	      if (gender1.equals('1')||gender1.equals('3')) {
	         System.out.print("남성");
	      } else {
	         System.out.print("여성");
	      }
		
	      //
	
	}

}
