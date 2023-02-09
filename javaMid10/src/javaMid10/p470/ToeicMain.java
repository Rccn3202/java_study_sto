package javaMid10.p470;

import java.util.Scanner;

public class ToeicMain {

	public static void main(String[] args) {
		
		Toeic toeic=new Toeic(); 
		try {
			toeic.input(); //토익 클래스의 에러 받아옴
		} catch (ScoreMinException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ScoreMaxException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}	
			
		

	}

}
