package B_Ex02;

public class SungJuk {    //1/변수 설정 후 프리베이트 선언한다. 외부에서 접근 못하게
	private String subject; //과목명
	private int score; //점수
	private int midternExam; //중간고사
	private int finals; //기말고사
	private int performanceEvalution; //수행평가
	
	void printAll() {			//성적출력
		
	}
	//7. 성적 출력하는 메소드 생성
	
	
	public String getSubject() {
		return subject; }
	public void setSubject(String subject) {
		this.subject = subject; }
	public int getScore() {
		return score; }
	public void setScore(int score) {
		this.score = score; }
	public int getMidternExam() {
		return midternExam; }
	public void setMidternExam(int midternExam) {
		this.midternExam = midternExam;}
	public int getFinals() {
		return finals; }
	public void setFinals(int finals) {
		this.finals = finals; }
	public int getPerformanceEvalution() {
		return performanceEvalution; }
	public void setPerformanceEvalution(int performanceEvalution) {
		this.performanceEvalution = performanceEvalution; }
	
	

	//1/변수 설정 후 프리베이트 선언한다. 외부에서 접근 못하게

	
}







//2. 세터게터 생성, 정보는 프리베잇에 저장하고 세터게터를 통해 나간다