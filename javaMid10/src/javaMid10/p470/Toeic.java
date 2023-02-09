package javaMid10.p470;

import java.util.Scanner;

public class Toeic {
	Scanner sc=new Scanner(System.in);
	int toeicscores; //점수
	boolean flag=true;  //계속하시겠습니까-while문용
	String continueVal;
	
	void input() throws ScoreMinException, ScoreMaxException  {		//입력
		while(flag) {
			System.out.println("토익점수?");
			toeicscores=sc.nextInt();
			if(toeicscores<0) {
				throw new ScoreMinException("0점미만");
			}else if(toeicscores>990) {
				throw new ScoreMaxException("990초과");
		}else {
			System.out.println("당신의 토익점수: "+toeicscores);
		}
			sc.nextLine();
			System.out.println("계속? y/n");
			continueVal=sc.next();
			if(continueVal.equalsIgnoreCase("n")) flag=false;
			System.out.println("종료"); return;
	}
	
	
}
	}

