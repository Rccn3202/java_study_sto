package javaBasic1;

public class ContinueEx3 {

	public static void main(String[] args) {
		//1~50 //10,20,30 ..빼고 출력하고 싶다
		int a=1;
		for(;a<=50;a++){
			//방법1
//			if(a%10!=0)  
//				System.out.print(a+" ");
		if(a%10==0) continue; //a가 1이면 거짓이니까 출력, a가 10이면 continue로 들어가서 밑 코드가 아닌 반복문 끝으로 다시 올라감
		System.out.print(a+" ");
		}
		
		System.out.println();
		System.out.println("-----");
		
		
		//100~1 //합계가 500, 1000,순간 예)585, 96  이런식으로 출력
//		int b=100;
//		int sum1=0;
//		int c=
//		
//		for(;b>=1;b--) {  //100~1
//			sum1=sum1+b;  //100~1 합
//			if(500<=sum1 && sum1<=1000)
//				System.out.println("합"+sum1+"마지막"+b); 
		int sum3=0;
		boolean p=false; //500이 넘는 순간 1번만 출력해야함, 프린트 했는지 체크하는 변수
		int basu = 500; //
		for(int i=100; i>=0;i--) {
			sum3=sum3+i;
			if(basu%500==0) {
				p=false;
			}
			if(sum3>=basu && !p) {
				System.out.print("합 "+sum3+"숫자 "+i);
			p=true;		//p가 한번 나왔으니까 끝내기
			
		}
		}
		
		System.out.println();
		System.out.println("6----");
		
		//6.
		
		for(int a6=1;a6<=5;a6++) {
			
			for(int a7=0;a7<a6;a7++) {
				System.out.print("*");
			}
				System.out.println(); }
				
			
		
		System.out.println();
		System.out.println("7----");
		
		
		
		
		
		System.out.println();
		System.out.println("-----");
		
		
		System.out.println();
		System.out.println("-----");
		
		
		System.out.println();
		System.out.println("-----");
		
		
		System.out.println();
		System.out.println("-----");
		
	}//end main

}//end class
