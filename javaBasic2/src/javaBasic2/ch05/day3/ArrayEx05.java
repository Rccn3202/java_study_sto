package javaBasic2.ch05.day3;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		// movie ticketing
		
		 
		/* String setW;
		int per1;
		int per2;    */
	
		
			
		
		//1�� �Է�-�Ǳ��űݾ� ���/ 2�� / 3��
		//1,2,3�� ���
		
		//Movie[] MovArr= {new Movie(),new Movie(11),new Movie()};  ----->���� ������� ��
		Movie[] m=new Movie[3];
		Scanner sc=new Scanner(System.in);	
		
		for(int i=0;i<m.length;i++) {
			m[i]=new Movie();
			
			System.out.println((i+1)+"��° ���ڵ�(��)===> ");
			
			System.out.println("��ȭ��> ");
			String MovieName=sc.next(); //--------->�Ʒ� Ŭ������ �ٸ� ����
			
			System.out.println("�ݾ�> ");
			int MoviePrice=sc.nextInt();
			
			System.out.println("����> ");
			int Age=sc.nextInt();
			
			System.out.println("���Ź��> ");
			String type=sc.next();
			
			m[i].setMn(MovieName);  //------>���� �Էµ� moviename�� Mn�� ����   //moviename�� ��°Ŷ� sc.next�� ��������
			m[i].setP(MoviePrice);
			m[i].setAge(Age);
			m[i].setType(type);
			
			m[i].price();   //----->�Ʒ� Ŭ������ price(���޼ҵ�)�� ȣ��
			 
		}
		System.out.printf("%10s,%10s,%10s,%10s","��ȭ��","�ݾ�","����","�Ǳ��ž�");
		for(int i=0;i<m.length;i++) {
			System.out.printf("%10d,%10d,%10d,%10d",m[i].getMn(),m[i].getP(),m[i].getAge(),m[i].getW());
		}
		
	/*	if(setW.equals("���ͳ�")) {
			per=5;
		} else if(setW.equals("���屸��")) {
			per=0;
		} else(setW.equals("��������")) {
			per=10;
		}  
		
		if(MovArr[0].getAge()<20) {
			per2=25;
		} else if(20<=MovArr[0].getAge() && MovArr[0].getAge()<=30) {
			per2=20;
		} else if(30<=MovArr[0].getAge()) {
			per2=15;
		}    */
		
		
		
/*		MovArr[0].setMn("1917");
		MovArr[0].setP(11000);
		MovArr[0].setAge(10);
		MovArr[0].setW("���ͳ�");
		
		MovArr[1].setMn("1917");
		MovArr[1].setP(11000);
		MovArr[1].setAge(10);
		MovArr[1].setW("���ͳ�");
		
		MovArr[2].setMn("1917");
		MovArr[2].setP(11000);
		MovArr[2].setAge(10);
		MovArr[2].setW("���ͳ�");    */
		
		

	/*	
		System.out.println("��ȭ�� �ݾ� ���� �Ǳ��űݾ�");
		System.out.println(MovArr[0].getMn()+ "  "+MovArr[0].getP()+"  "+MovArr[0].getAge()+" "+MovArr[0].getPrice()); //!!! �Ǳ��űݾ� ��� �ʿ�
		System.out.println(MovArr[1].getMn()+ "  "+MovArr[1].getP()+"  "+MovArr[1].getAge()+" "+MovArr[0].getPrice());
		System.out.println(MovArr[2].getMn()+ "  "+MovArr[2].getP()+"  "+MovArr[2].getAge()+" "+MovArr[0].getPrice());
		*/
		
		


} //end main
} //end class

class Movie{
	String Mn; //��ȭ��
	int p; //��ȭ����
	int age; //����
	String type;//���屸��,���ͳ�..
	int w; //�Ǳ��ž�
	double rate; //������
	
	//�������ž� ��� �޼ҵ�
	public int price() {
		if(age<20) rate=0.25; 
		else if(age>=20 && age<30) rate=0.2;
		else rate=0.15;
		
		if(type.equals("���ͳ�")) rate=rate+0.05;
		else if(type.equals("����")) rate=rate+0.1;
		
		w=(int)(p*(100-rate));
		return w;
	}

	
	
	public String getMn() {
		return Mn;
	}

	public void setMn(String mn) {
		Mn = mn;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	
	
	
	
	
	
}