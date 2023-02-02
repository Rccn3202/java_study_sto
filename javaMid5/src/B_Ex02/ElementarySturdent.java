package B_Ex02;

public class ElementarySturdent extends SungJuk {  //성적상속

@Override
	public String toString() {
	return "초등학생";
	}

//3. 성적클래스 상속받고 toString override

@Override
	void printAll() {
		System.out.println("---------------");	
		System.out.println("초등학교 성적 입니다");
		System.out.println("---------------");
		System.out.println("과목명 : "+getSubject());
		System.out.println("시험 : 중간고사 "+getMidternExam()+
		", "+"기말고사 : "+getFinals()+", "+"수행평가 "+getPerformanceEvalution());
		System.out.println("점수: "+getScore());
}
//8. 부모클래스의 printAll메소드를 오버라이드

}


