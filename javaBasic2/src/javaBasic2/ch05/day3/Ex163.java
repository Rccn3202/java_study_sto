package javaBasic2.ch05.day3;

public class Ex163 {

	public static void main(String[] args) {
		// ���ڿ� �и�
		String board="��ȣ,����,����,�۾���";
		String board1="��ȣ1 ����1 ����1 �۾���1";
		String board2="��ȣ2-����2-����2-�۾���2";
		String board3="��ȣ3:����3:����3:�۾���3";
		
		String[] b=board.split(",");
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		String[] b1=board1.split(" ");
		System.out.println(b1[0]);
		System.out.println(b1[3]);
		
		String[] b2=board2.split("-");
		System.out.println(b2[2]);
		System.out.println(b2[3]);
		
		String[] b3=board3.split(":");
		System.out.println(b3[1]);
		System.out.println(b3[3]);
		
		System.out.println("----------------------");
		
		String hong="ȫ�浿-20��,�̼���-25��,�ֿ�-30��";
		String[] h=hong.split(",");
		String[] h2=h[0].split("-");
		System.out.println(h2[0]);
		System.out.println(h2[1]);
		
		String[] h3=h[1].split("-");
		System.out.println(h3[0]);
		System.out.println(h3[1]);
		
		String[] h4=h[2].split("-");
		System.out.println(h4[0]);
		System.out.println(h4[1]);
		
		
	
		
	}

}
