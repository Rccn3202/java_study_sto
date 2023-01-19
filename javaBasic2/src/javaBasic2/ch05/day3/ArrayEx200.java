package javaBasic2.ch05.day3;

import java.util.Scanner;

public class ArrayEx200 {

	static Scanner sc=new Scanner(System.in);  //1.메인에 있으면 다른 메소드에서 못쓰니까 따로 변수를 빼준다
	
	public static void main(String[] args) {
		//200페이지 예제 9번
		
		boolean flage=true;
		
		int scount=0;
		int[] scores; //13. 12번 앞 scores 의 변수 선언
		
		while(flage ) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 |3. 점수리스트 | 4. 분석 | 5.종료 ");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");			
			String menu=sc.nextLine();   //선택
			
			switch(menu) {
			case "1" : scount=studentCount(); break;  //4. scount 변수 입력
			case "2" : scores=input(scount); break; //5.매개변수인 scount 입력, 오류:input 메소드를 바꿔서 오류 수정
			//12.앞 scoers랑 뒤 scores랑 다름
			case "3" : score(); break;
			case "4" : anly(); break;
			case "5" : flage=false; break;
			default : System.out.println("메뉴 잘못됨 (1~5)");
			}
		};
		
		

		
		
	

	}
	
	private static int studentCount() {
		// 학생수
		System.out.println("학생수> ");  //2
		int scount=sc.nextInt();
		sc.nextLine();
		return scount;  //3 리턴해서 입력된 학생수 3명을 입력받아서 다시 case1에 있는 scount 변수에 넣어준다
}
	
	private static int[] input(int scount) {  //6. case2에 있던 scount 속 값이 닷 ㅣ들어옴  //11.void를 int[]로 수정
		// 점수입력
		System.out.println();
		int[] scores=new int[scount];  //8.배열 생성, 힙에 정수형 배열 scount 잡는다(3입력해서 3칸 잡힘),왼쪽 scores 보면 stack에 저장된다
		for(int i=0;i<scount;i++) {			//7.
			System.out.println("scores["+i+"]> ");
			scores[i]=sc.nextInt(); //\9.
			sc.nextLine();	}
		return scores;  //10.scores 라는 값을 리턴한다 
		
	}

	private static void anly() {
		// 분석
		
	}

	private static void score() {
		// 점수리스트
		
	}

	

	

}
