package B_Ex02;

public class MiddleSchooler extends SungJuk {
	private String teacher; //담당교사명
	private int attendance; //출석점수
	private int service; //봉사점수
	
	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	public int getService() {
		return service;
	}

	public void setService(int i) {
		this.service = i;
	}

//4. 미들스쿨 변수 작성 후 세터게터 생성
@Override
public String toString() {
	
	return "중학생";
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
}  //9.미들스쿨 프린트올 작성
}
