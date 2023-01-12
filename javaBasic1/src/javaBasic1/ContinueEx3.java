package javaBasic1;

import java.util.Scanner;

public class ContinueEx3 {

	public static void main(String[] args) {
		//1~50 //10,20,30 ..빼고 출력하고 싶다
//		int a=1;
//		for(;a<=50;a++){
//			//방법1
////			if(a%10!=0)  
////				System.out.print(a+" ");
//		if(a%10==0) continue; //a가 1이면 거짓이니까 출력, a가 10이면 continue로 들어가서 밑 코드가 아닌 반복문 끝으로 다시 올라감
//		System.out.print(a+" ");
//		}
//		
//		System.out.println();
//		System.out.println("-----");
//		
//		
//		//100~1 //합계가 500, 1000,순간 예)585, 96  이런식으로 출력
////		int b=100;
////		int sum1=0;
////		int c=
////		
////		for(;b>=1;b--) {  //100~1
////			sum1=sum1+b;  //100~1 합
////			if(500<=sum1 && sum1<=1000)
////				System.out.println("합"+sum1+"마지막"+b); 
//		int sum3=0;
//		boolean p=false; //500이 넘는 순간 1번만 출력해야함, 프린트 했는지 체크하는 변수
//		int basu = 500; //
//		for(int i=100; i>=0;i--) {
//			sum3=sum3+i;
//			if(basu%500==0) {
//				p=false;
//			}
//			if(sum3>=basu && !p) {
//				System.out.print("합 "+sum3+"숫자 "+i);
//			p=true;		//p가 한번 나왔으니까 끝내기
//			
//		}
//		}
//		
//		System.out.println();
//		System.out.println("6----");
//		
//		//6.
//		
//		for(int a6=1;a6<=5;a6++) {
//			
//			for(int a7=0;a7<a6;a7++) {
//				System.out.print("*");
//			}
//				System.out.println(); }
//				
//			
//		
//		System.out.println();
//		System.out.println("----");
//		
//		
//		
//		System.out.println((int)(Math.random()*49)+1);
//		
//		
//		
//		System.out.println();
//		System.out.println("--7---");
//		
//		while(true) {
//		System.out.println("메뉴");
//		
//	
//		Scanner v1 =new Scanner(System.in);
//		System.out.println("선택1> ");
//		if(v1.equals("1")) {
//			System.out.println("일번");
//		} else if(v1.equals("2")) {
//			System.out.println("2번");
//		} else if(v1.equals("3")) {
//			System.out.println("3번");
//		} else if (v1.equals("0")){
//		System.out.println("종료");	
//		}
//		break;
//		}
		 Scanner sc = new Scanner(System.in);
String choice=null;
String num=null; //계좌번호
int money=0; //입력받는 돈 변수
int balance=0; //잔액
int minu=0; //출금액

while(true) {
	System.out.println("----------------------------------------");
    System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4 이체 | 0 종료 ");
    System.out.println("----------------------------------------");

    System.out.print("선택> ");
    choice=sc.nextLine();	
   

    switch(choice) {
    
    case "1":{System.out.print("예금액> ");
    money=sc.nextInt();
    sc.nextLine();
    balance=balance+money;
    System.out.println("잔고> "+balance);
    
    
    ///추가
   
//    if(choice.equals("1")) { //if 사용
//    	System.out.println("종료합니다");
//    } else if(choice.equals("2"))
    
    System.out.println("다른업무 1/종료 2");{
    choice=sc.nextLine();
    
    if(choice.equals("1")) {
    	System.out.println();  //업무목록 나오게 하기
    }
    else if(choice.equals("2")) {
    	System.out.println("종료");break;   //종료 안되는데??????
    }
    else {
    	System.out.println("잘못입력"); //다른업부/종료 나오게
    }
    }
//    switch(choice) {  //switch 사용?
//   
//    
//    
//    case "1":{System.out.println();break;
//    }
//    
//    
//    case "2":{System.out.println("종료"); break;
//    	
//    }
//    default : System.out.println("잘못 입력");
//    
//    }
    }//end switch
    
    
    
    ////추가
    
    break;
//    }
    
    case "2":{ System.out.print("출금액> ");
    money=sc.nextInt();
    sc.nextLine();
    if(balance<money) {
    	System.out.println("잔액부족");
    }else {
    	minu=balance-minu;
    }
    break;}
    
    case "3":{System.out.println("잔고> "+balance);
    sc.nextLine();

    break;}
    
    case "4" : { System.out.println("잔고> "+balance); //이체할 계좌번호 입력받고(문자) 이체할 금액
    System.out.println("이체할 계좌번호 입력> ");
    num=sc.nextLine();
    System.out.println("이체할 금액> ");
    money=sc.nextInt();
    sc.nextLine();
    if(balance<money) {
    	System.out.println("잔액부족");
    } else {
    	balance=balance-money;
    	System.out.println(num+"계좌로 "+money+"금액이 이체되었습니다. 잔액은 "+balance+"입니다");
    	System.out.println("잔고> "+balance);
    } break;
    }

    case "0": System.out.println("종료"); break;
    
    default : System.out.println("잘못 입력");

    }
    
    if(choice.equals("0")) break;
}
		
	
		
		
		
		
		
		
		
		
	}//end main

}//end class
