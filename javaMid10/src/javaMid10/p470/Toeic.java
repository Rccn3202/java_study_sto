package javaMid10.p470;

import java.util.Scanner;

public class Toeic {
	Scanner sc=new Scanner(System.in);
	int toeicscores; //����
	boolean flag=true;  //����Ͻðڽ��ϱ�-while����
	String continueVal;
	
	void input() throws ScoreMinException, ScoreMaxException  {		//�Է�
		while(flag) {
			System.out.println("��������?");
			toeicscores=sc.nextInt();
			if(toeicscores<0) {
				throw new ScoreMinException("0���̸�");
			}else if(toeicscores>990) {
				throw new ScoreMaxException("990�ʰ�");
		}else {
			System.out.println("����� ��������: "+toeicscores);
		}
			sc.nextLine();
			System.out.println("���? y/n");
			continueVal=sc.next();
			if(continueVal.equalsIgnoreCase("n")) flag=false;
			System.out.println("����"); return;
	}
	
	
}
	}

