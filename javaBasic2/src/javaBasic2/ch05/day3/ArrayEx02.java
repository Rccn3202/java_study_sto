package javaBasic2.ch05.day3;

public class ArrayEx02 {

	public static void main(String[] args) {
	/*	Banchan b1=new Banchan();
		Banchan b2=new Banchan();
		Banchan b3=new Banchan();

		Banchan[] banArr= {b1,b2,b3};   */
		
		Banchan[] banArr= {new Banchan(),new Banchan(),new Banchan()}; //2. ��ü+�迭 ���� /���� ����+�迭������ ���� ��
		System.out.println(banArr[0]); //�� {} �� ù��°�� ���
		System.out.println(banArr[1]);
		System.out.println(banArr[2]);
		
		//3. [0]�ּҿ� ������ 10 5 �Է��غ���
		banArr[0].setKind("������");
		banArr[0].setMakeFood(10);
		banArr[0].setMakeFood(5);
		
		System.out.println(banArr[0].getKind()); //4. ����ϱ�
		System.out.println(banArr[0].getMakeFood());
		System.out.println(banArr[0].getSaleFood());
		
		//[1]�ּ� �� 7 3
		banArr[1].setKind("��");
		banArr[1].setMakeFood(7);
		banArr[1].setMakeFood(3);
		
		System.out.println(banArr[1].getKind()); 
		System.out.println(banArr[1].getMakeFood());
		System.out.println(banArr[1].getSaleFood());
		
		//[2]�ּ� ������ 15 13
		banArr[2].setKind("������");
		banArr[2].setMakeFood(15);
		banArr[2].setMakeFood(13);
		
		System.out.println(banArr[2].getKind());
		System.out.println(banArr[2].getMakeFood());
		System.out.println(banArr[2].getSaleFood());
		
		//��) class Hospital ����� 
		//�ʵ�� �������(medical department) -ġ�� ���� �����ܰ� �������а�
		//�ǻ��(doctor name) -����� ������ �ڸ�ȣ �����
		//������(treatment day) -20230117 20230116 20230112 20230110
		
		
		Hospital[] HoArray= {new Hospital(),new Hospital(),new Hospital(),new Hospital()} ;
		
		System.out.println("�������  �ǻ��  ������");
		
		
		HoArray[0].setMd("ġ��");
		HoArray[0].setDn("�����");
		HoArray[0].setTd("20230117");
		
		HoArray[1].setMd("����");
		HoArray[1].setDn("������");
		HoArray[1].setTd("20230116");
		
		HoArray[2].setMd("�����ܰ�");
		HoArray[2].setDn("�ڸ�ȣ");
		HoArray[2].setTd("20230112");
		
		HoArray[3].setMd("�������а�");
		HoArray[3].setDn("�����");
		HoArray[3].setTd("20230110");
		
		
		
		System.out.println();
		
		System.out.println("�������  �ǻ��  ������");
		System.out.println(HoArray[0].getMd()+ "  "+HoArray[0].getDn()+"  "+HoArray[0].getTd());
		System.out.println(HoArray[1].getMd()+ "  "+HoArray[1].getDn()+"  "+HoArray[1].getTd());
		System.out.println(HoArray[2].getMd()+ "  "+HoArray[2].getDn()+"  "+HoArray[2].getTd());
		System.out.println(HoArray[3].getMd()+ "  "+HoArray[3].getDn()+"  "+HoArray[3].getTd());
		
		//����� �ݺ������� �����
		for(int i=0;i<HoArray.length;i++) {
			System.out.println(HoArray[i].getMd()+ "  "+HoArray[i].getDn()+"  "+HoArray[i].getTd());
		}
		//���� for
		for(Hospital h:HoArray) {
			System.out.println(h.getMd()+ "  "+h.getDn()+"  "+h.getTd());
		}
		
		
	}

}

class Banchan{						//1. Ŭ���� ����
	String kind;
	int makeFood;
	int saleFood;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getMakeFood() {
		return makeFood;
	}
	public void setMakeFood(int makeFood) {
		this.makeFood = makeFood;
	}
	public int getSaleFood() {
		return saleFood;
	}
	public void setSaleFood(int saleFood) {
		this.saleFood = saleFood;
	}
	
}

class Hospital{
	String md;
	String dn;
	String td;
	
	public String getMd() {
		return md;
	}
	public void setMd(String md) {
		this.md = md;
	}
	public String getDn() {
		return dn;
	}
	public void setDn(String dn) {
		this.dn = dn;
	}
	public String getTd() {
		return td;
	}
	public void setTd(String td) {
		this.td = td;
	}
	
	
	
}