package B_Ex02;

import java.util.Scanner;

public class SungJukBusiness {
	//�Է¹ޱ�
	void input(SungJuk sj) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("�������? ");
		sj.setSubject(sc.next()); //�Է��ؼ� �ʵ��б� �ּҿ� �־����
		sc.nextLine();
		System.out.println("�������� �Է�");
		System.out.print("�߰���� >");
		sj.setMidternExam(sc.nextInt());
		System.out.print("�⸻��� >");
		sj.setFinals(sc.nextInt());
		System.out.print("������ >");
		sj.setPerformanceEvalution(sc.nextInt());
		sc.nextLine();
		//����κ� 
		
		if(sj instanceof ElementarySturdent) {
			cal(sj);
			
		} else if(sj instanceof MiddleSchooler) {  //�޶����� �κ��� �ְ� ������ instanceof�� ���
			MiddleSchooler ms=(MiddleSchooler) sj;  //sj�� �θ�Ÿ���ε� �������� ��米�� �ʵ� ����. �׷��� �ٿ��� ��
			System.out.print("��米�� >");
			ms.setTeacher(sc.next()); 
			sc.nextLine();
			
			System.out.print("�⼮���� >");
			ms.setAttendance(sc.nextInt()); 
			sc.nextLine();
			
			System.out.print("�������� >");
			ms.setService(sc.nextInt()); 
			sc.nextLine();
			
			cal(ms); //? +�⼮����+��������
		} else if(sj instanceof HighSchoolStudent) {
			HighSchoolStudent hs=(HighSchoolStudent) sj; 
			System.out.print("��米�� >");
			hs.setTeacher(sc.next()); 
			sc.nextLine();
			
			System.out.print("�⼮���� >");
			hs.setAttendance(sc.nextInt()); 
			sc.nextLine();
			
			System.out.print("�������� >");
			hs.setService(sc.nextInt()); 
			sc.nextLine();
		}
		
		
		
		cal( sj );
		
		
		
	}
	//��¹ޱ�
	void print(SungJuk e1) {
		e1.printAll();
		
	}
	//�������
	void cal(SungJuk e1) {
		if(e1 instanceof ElementarySturdent) {
		e1.setScore(e1.getMidternExam()+e1.getFinals()+e1.getPerformanceEvalution());
		} else if(e1 instanceof HighSchoolStudent ) {
			HighSchoolStudent hs=(HighSchoolStudent) e1;  //�ٿ�ĳ����
			hs.setScore(hs.getMidternExam()+hs.getFinals()+hs.getPerformanceEvalution()
			+hs.getService());
			hs.setStandardDeviation(hs.getScore()*0.253); //���Ƿ� ǥ������ ���ϱ�
		}else if(e1 instanceof MiddleSchooler ) {
			MiddleSchooler ms=(MiddleSchooler) e1;  //�ٿ�ĳ����
			e1.setScore(ms.getMidternExam()+ms.getFinals()+ms.getPerformanceEvalution()
			+ms.getService());	
			}
	}
}

	
	
	
	
