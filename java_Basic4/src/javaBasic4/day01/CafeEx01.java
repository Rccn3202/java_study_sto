package javaBasic4.day01;

public class CafeEx01 {

	public static void main(String[] args) {
		/* 1. 다음을 만족하는 Student 클래스를 작성하시오.

          String형의 학과와 정수형의 학번을 필드로 선언

         Student 클래스의 main() 메소드에서 Student 객체를 생성하여 학과와 학번 필드에 적당한 값을 입력 후 출력
*/
		StudentEx st=new StudentEx();
		st.dep="컴퓨터";
		st.num=101010;
		System.out.println("학과 "+st.dep+" "+"학번 "+st.num);
	
		
	
	}

}

class StudentEx{
	//필드
	String dep;  //학과
	int num; //학번
}