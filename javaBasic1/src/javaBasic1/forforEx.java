package javaBasic1;

public class forforEx {

	public static void main(String[] args) {
		//for ���߹�
//		for(int i=1; i<3; i++) {
//			for(int j=1;j<2; j++) {
//				System.out.println(i+ " " +j);
//			}
//		}
		
//		for(int i=2;i<=4; i++) {
//			for(int j=5; j>=i ; j--) {
//				System.out.print(i+" " + j+ " ");
//			}
//			System.out.println();
//		}

		//��1) ���
		// 11 12 13
		//21 22 23
//		for(int i=1;i<=2;i++) {
//			for(int j=1;j<=3; j++) {
//				System.out.print("["+i+","+j+"]");
//				}
//			System.out.println();
//		}
		
		//��2) ���
		//111 112
		//121 122
//		for(int i=1;i<=2;i++) {
//			for(int j=1;j<=2; j++) {
//				for(int k=1;k<=2;k++) {
//				System.out.print("["+i+","+j+","+k+"]");
//				}
//				System.out.println();
//			}
//			
//		}

		//��3) ������ ���
		//2X1=2 2X2=4 ...
		//9X1=9 
	
	
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				int x=i*j;
			System.out.print(i+"X"+j+"="+x+" ");	
			
			} System.out.println();
		}
			
		System.out.println();
		
			//��4)
			//2X1=2 3X1=3
			//2X9=18 ...
		

		for(int i1=1;i1<=9;i1++) {
			for(int j1=2;j1<=9;j1++) {
				int x1=i1*j1;
			System.out.print(j1+"X"+i1+"="+x1+" ");	
			
			} System.out.println();
		}
			
		
		
		
			
			
		
			
		
		
	} //end main

} //end class


