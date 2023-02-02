package B_Ex02;

public class HighSchoolStudent extends MiddleSchooler  {  //5. 미들스쿨 클래스를 부모로 둔다
	private double standardDeviation; //표준편차  
	@Override
		public String toString() {
		return "고등학생";
	}
	
	void printAll() {
		System.out.println("---------------");	
		System.out.println("중학교 성적 입니다");
		System.out.println("---------------");
		System.out.println("과목명 : "+getSubject());
		System.out.println("시험 : 중간고사 "+getMidternExam()+
		", "+"기말고사 : "+getFinals()+"수행평가 "+getPerformanceEvalution()+"출석점수"+getAttendance()+
		"봉사점수 "+getService());
		System.out.println("점수: "+getScore());
		System.out.println("표준편차: "+getStandardDeviation());
	} //10.하이스쿨 프린트올 작성
	
public double getStandardDeviation() {
		return standardDeviation; }
	public void setStandardDeviation(double standardDeviation) {
		this.standardDeviation = standardDeviation; }
	//6. 변수설정 후 세터게터
	
}
