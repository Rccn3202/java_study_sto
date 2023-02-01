package javaMid3.b1331_T;

import java.util.Scanner;

public class SaleBusiness {  //2.
		Scanner sc;
		Seoul sj;
		Gyeongin gy;
		Gangwon ga;
		Jeju je;					//15. 14���� ������ ��ü�� �ٸ� �޼ҵ��� �� �� �ֵ��� ��. �ּҰ� ���⿡ ����ȴ�.
		
	public SaleBusiness() {
		 sc=new Scanner(System.in);   //13.��ĳ�� ���� -��ĳ�� �� ���⿡ ����?
		 sj=new Seoul();
		 gy=new Gyeongin();
		 ga=new Gangwon();
		 je=new Jeju(); 					//14.��ü����  -�� ��ü�� �ٸ� �޼ҵ���� �����
			
	}
	public void input() {   //5.��ǲ �ƿ�ǲ �޼ҵ� ����
	//�Է� �޼ҵ�
		String yn="n";   //16. ��������
		
		do {
			System.out.println("�����?");
			System.out.println("1. ���� 2.���� 3.���� 4.����");
			System.out.println("������?");
			int jisaSelect=0;
			jisaSelect=sc.nextInt();   //18.����� �Է¹��� �� jisaSale�� ����ȴ�.
			
			switch(jisaSelect) {
			case 1 : jisaInput(sj);break;
			case 2 : jisaInput(gy);break;
			case 3 : jisaInput(ga);break;
			case 4 : jisaInput(je);break;      //19. ����ġ�� �ۼ�. ������ �����ϸ� �� �ּҸ� sj�� �Ѱ���/���� jisaInput �ȸ���
			}
			
			System.out.println("����Ͻðڽ��ϱ� y/n");
			yn=sc.next();  
			sc.nextLine();    //22. yn �Է�
			
		}while(yn.equalsIgnoreCase("y")); //����Ͻðڽ��ϱ�   //17.���Ϲ� �ۼ� (equalsIgnoreCase:��ҹ��� ������� ���ٰ� ����)
	}  
	
	
	

	private void jisaInput(Jisa js) {   //20.������ ��� -�� ���纰�� �� �޼ҵ� ������ ���� �ƿ� ������ ����(�θ�Ŭ����)�� ����
		
		System.out.print("��ǰ��?");
		
		
		if (js instanceof Seoul) {   //���࿡ js�� Seoul����.../��
			sj=(Seoul) js;
			sj.setProName(sc.next());  //��Ʃ�Ͷ�� �Է�
			sc.nextLine();
			System.out.println(sj+"���� "+sj.getProName()+" �Ǹŷ���? "); //getPro~:�Է¹��� ��ǻ�Ͱ� ����  
			sj.setSaleAmount(sc.nextInt());    //21. �Է¹��� �������� sj�� ����
			sj.setSaleStatus(saleStatusMethod(sj.getProName(),sj.getSaleAmount()));//24. ���żҵ� ȣ�� ��ȣġ�� �ʿ��� �� ����, �װ��� �޼ҵ忡 ������ ��
			sj.setProPrice(proPriceInput(sj.getProName())); //28.
		}
		if (js instanceof Gangwon) {   
			ga=(Gangwon) js;
			ga.setProName(sc.next()); 
			sc.nextLine();
			System.out.println(ga+"���� "+ga.getProName()+" �Ǹŷ���? ");   
			ga.setSaleAmount(sc.nextInt());     
			ga.setSaleStatus(saleStatusMethod(ga.getProName(),ga.getSaleAmount()));
		}
		if (js instanceof Jeju) {   
			je=(Jeju) js;
			je.setProName(sc.next()); 
			sc.nextLine();
			System.out.println(je+"���� "+je.getProName()+" �Ǹŷ���? ");   
			je.setSaleAmount(sc.nextInt());     
			je.setSaleStatus(saleStatusMethod(je.getProName(),je.getSaleAmount()));
		}
		if (js instanceof Gyeongin) {   
			gy=(Gyeongin) js;
			gy.setProName(sc.next()); 
			sc.nextLine();
			System.out.println(gy+"���� "+gy.getProName()+" �Ǹŷ���? ");   
			gy.setSaleAmount(sc.nextInt());     //23. ���纰�� �����
			gy.setSaleStatus(saleStatusMethod(gy.getProName(),gy.getSaleAmount()));
		}
		
		
	}
	public void output() {
	//��� �޼ҵ�	
		System.out.println("----------------------");
		System.out.println("---�� ���纰 �Ǹ� ��Ȳ----");
		System.out.println("---------------------");
		System.out.printf("%12s %10s %10s %10s %10s\n", "�����","��ǰ��","��ǰ����","�Ǹŷ�","������Ȳ"); //�������12s�ڸ��� ����
		System.out.printf("%12s %10s %10s %10s %10s\n", sj+"����",sj.getProName(),sj.getProPrice(),sj.getSaleAmount(),sj.getSaleStatus());
		
	}  //24.��� �Է�
	
	public int saleStatusMethod(String proName, int amount) {       //12.���޼ҵ� ����   //25.��ȣġ�� ���� ���� �ֱ�
	//��� �޼ҵ�	
		int saleStatus=0;   //������Ȳ�� ���� ���� ���� ����
		if(proName.equals("��ǻ��")) {
			saleStatus=200*amount;
		} else if(proName.equals("������")){
			saleStatus=50*amount;
		} else {
			System.out.println("�߸��Է�");
		}
		return saleStatus;  //ȣ���� ������ �ٽ� �����ش�-���� saleStatusMethod(sj.get....��
	}  //26.���޼ҵ� �Է�
	
	//27.��ǰ���� �޼ҵ�
	private int proPriceInput(String proName) {
		if(proName.equals("��ǻ��")) return 200;
		else if(proName.equals("������")) return 50;
		return 0;
	}
}











