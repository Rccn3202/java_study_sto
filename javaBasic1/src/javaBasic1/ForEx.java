package javaBasic1;

import java.util.Scanner;

public class forEX {

	public static void main(String[] args) {

//		for문 형식
//		for(변수초기값;조건식;증감값) { //초기갑->조건식->반복내용->증감값(결과)->조건식->반복
//			반복할 내용
//		}
		
//		for(int i=1; i<=10; i++) { //int i는 for {}를 벗어나면 사라짐, 밖에 또 int i 만들어도 됨
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		
//		for(int i=10;i>=0;i--) {
//			System.out.print(i+ " ");
//		}
//		
//		System.out.println();
//		
//		//문1) 10 20 30 ... 100 출력
//		for(int a1=1; a1<=10; a1++) { //a1=a1+10 아니면 a1+=10 이용할 수 있음 
//			System.out.print(a1+"0 ");
//		}
//		
//		System.out.println();
//		
//		//문2) 1~100까지 합 구하기
//		
//		int sum1=0;
//		int a2=0;
//		for(a2=0;a2<=100 ;a2++ ) {
//			sum1=sum1+a2;   //여기에 int sum=0;을 선언하면 계속 다시 sum이 0이 됨, 밖에 꺼내서 한번만 쓸 수 있게 선언 
//		}
//		System.out.println(sum1);
//		
//		
//		
//		//문3) 0~100까지 홀수의 합 구하기, 홀수의 갯수 구하기
//		//Me
////		int a3=0;
////		int sum2=0;
////		int num1=0;
////		int count=0;
////		for(a3=0;a3<=100;a3++) {
////			if((a3+1)%2==0);
////				sum2=sum2+a3;
////		}
////		for(a3=0;a3<=100;a3++) {	
////			if((a3+1%2)==0){
////			count++;
////			}
////				
////		}
////		System.out.println(sum2);
////		System.out.println(count);
////		System.out.println();
////		
//		//T : sum=sum+odd cnt=cnt+1
//		int sum9=0;
//		int cnt=0;
//		for(int odd=1;odd<100;odd=odd+2) {
//			sum9=sum9+odd;
//			cnt=cnt+1;
//		}
//			System.out.println("홀수의 합 "+sum9); //2500
//			System.out.println("갯수"+cnt); //50
//		
//		
			
		
		//문4) 1~100까지 출력하되 1줄에 10개씩 출력하기
			//ME : 1줄에 10개씩 출력 못함
//		int a4=0;
//		int b4=0;
//		for(a4=1;a4<=100;a4++) {
//			System.out.print(a4+" ");
//			for(b4=0;b4<=10;b4++) {
//			if(b4%10==0);{
//			}
//		}
//		}
//		
		
			//T1. 갯수를 10개씩 세어서 줄바꿈 ,숫자세기 cnt 변수 필요함.
//			int a4=0;
//			int cnt2=0;
//			for(a4=1;a4<=100;a4++) {
//				System.out.print(a4+" ");
//				cnt2++;
//				if(cnt2==10) { //if문 할 일 카운트하기, 줄바꾸기, 카운트 다시 0 만들기)
//				System.out.println();
//				cnt=0;
//				}
//			}
//			
//			System.out.println();
//			
//			//T2. 10의 배수일 때 줄바꿈
//			int i9=0;
//			if(i9%10==0) {
//				System.out.println();
//			}
//			int a10=14;
//			System.out.println(a10 % 10==0);
			
		//T 문제 4번 카톡 참고
			
		
		//문5)(while로 풀어도 됨)아래와 같이 출력해보기 (12345)를 입력한 것임
		/*결과화면
		 *숫자 입력하세요 (예: 12345) => 12345
		 *sum=5number = 12345
		 *sum = 9 number = 1234
		 *...
		 * 
		 */
			
		//ME
//			System.out.println("결과화면");
//			Scanner sc5=new Scanner(System.in);
//			System.out.println("숫자 입력하세요 ");
//			
//			int b7=Integer.MAX_VALUE;
//			String n9=String.valueOf(b7);
//			System.out.println(b7); //숫자를 문자료 변환
//			const b9=b7
//			const b8=b7.substring(0,str.length -1);
//			
			
//			n9=n9.substring(0,n9.length() -1);
//			System.out.println(n9);
			
			
//			int num =sc5.nextInt();
//			
//			while(num>1) {
				
//			}
			
		//T 
//			System.out.println("결과화면"); //결과화면 글자
//			Scanner sc3=new Scanner(System.in); //입력준비
//			System.out.print("숫자 입력하세요 ");
//			int num7 =sc3.nextInt();
//			//sum99변수에 5 넣어주기 12345-12340=5 1234*10..카톡 참고
//			System.out.println(num7);
//			
//			int num8=num7/10;
//			System.out.println(num8);
//			int s=num8-num7;
//			System.out.println(s);
		
		
		//문6(dowhile이 편함)
		//숫자를 계속 입력받는다. 0을 입력하면 지금까지 입력한 숫자를 모두 더한 것을 출력한다.
		//반복문() 합계를 구할 숫자를 입력하세요(끝내려면 0을 입력)
//		100 //(입력수)
//		200 //(입력수)
//		...
//		0 //(입력수)
//		합계:1000 //(출력)
		
			//ME
//		Scanner a6=new Scanner(System.in);
//		String n1=null;
//		int sum6 = 0;
//		int b=0;
//		
//		do {
//			System.out.print("숫자> ");
//			n1 = a6.next();   //이거를 nextInt로 썼으면 integer 필요 없음
//			b=Integer.parseInt(n1); 
//			sum6=sum6+b;
//		} while(! n1.equals("0")); //(n6 !=0) 도 됨
//		
//		System.out.println("합계: "+sum6);
//		
		//T
		Scanner a6=new Scanner(System.in);
		String n1=null;
		int sum6 = 0;
		int b=0;
		
		do {
			System.out.print("숫자> ");
			n1 = a6.nextInt(); 
			sum6=sum6+b;
		} while(! n1.equals("0")); //(n6 !=0) 도 됨
		
		System.out.println("합계: "+sum6);

		
		
	} //end main
} //end class
