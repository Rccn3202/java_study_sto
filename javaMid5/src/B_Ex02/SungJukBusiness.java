package B_Ex02;

import java.util.Scanner;

public class SungJukBusiness {
	//입력받기
	void input(SungJuk sj) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("과목명은? ");
		sj.setSubject(sc.next()); //입력해서 초등학교 주소에 넣어야함
		sc.nextLine();
		System.out.println("시험점수 입력");
		System.out.print("중간고사 >");
		sj.setMidternExam(sc.nextInt());
		System.out.print("기말고사 >");
		sj.setFinals(sc.nextInt());
		System.out.print("수행평가 >");
		sj.setPerformanceEvalution(sc.nextInt());
		sc.nextLine();
		//공통부분 
		
		if(sj instanceof ElementarySturdent) {
			cal(sj);
			
		} else if(sj instanceof MiddleSchooler) {  //달라지는 부분이 있게 때문에 instanceof를 사용
			MiddleSchooler ms=(MiddleSchooler) sj;  //sj는 부모타입인데 무모한테 담당교사 필드 없음. 그래서 다운한 것
			System.out.print("담당교사 >");
			ms.setTeacher(sc.next()); 
			sc.nextLine();
			
			System.out.print("출석점수 >");
			ms.setAttendance(sc.nextInt()); 
			sc.nextLine();
			
			System.out.print("봉사점수 >");
			ms.setService(sc.nextInt()); 
			sc.nextLine();
			
			cal(ms); //? +출석점수+봉사점수
		} else if(sj instanceof HighSchoolStudent) {
			HighSchoolStudent hs=(HighSchoolStudent) sj; 
			System.out.print("담당교사 >");
			hs.setTeacher(sc.next()); 
			sc.nextLine();
			
			System.out.print("출석점수 >");
			hs.setAttendance(sc.nextInt()); 
			sc.nextLine();
			
			System.out.print("봉사점수 >");
			hs.setService(sc.nextInt()); 
			sc.nextLine();
		}
		
		
		
		cal( sj );
		
		
		
	}
	//출력받기
	void print(SungJuk e1) {
		e1.printAll();
		
	}
	//점수계산
	void cal(SungJuk e1) {
		if(e1 instanceof ElementarySturdent) {
		e1.setScore(e1.getMidternExam()+e1.getFinals()+e1.getPerformanceEvalution());
		} else if(e1 instanceof HighSchoolStudent ) {
			HighSchoolStudent hs=(HighSchoolStudent) e1;  //다운캐스팅
			hs.setScore(hs.getMidternExam()+hs.getFinals()+hs.getPerformanceEvalution()
			+hs.getService());
			hs.setStandardDeviation(hs.getScore()*0.253); //임의로 표준편차 구하기
		}else if(e1 instanceof MiddleSchooler ) {
			MiddleSchooler ms=(MiddleSchooler) e1;  //다운캐스팅
			e1.setScore(ms.getMidternExam()+ms.getFinals()+ms.getPerformanceEvalution()
			+ms.getService());	
			}
	}
}

	
	
	
	
