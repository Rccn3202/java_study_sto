package javaBasic1;

import java.util.Scanner;

public class b {
	public static void main(String[] args) {
		////문제 숫자3개를 입력받아서 중간 숫자를 출력하기 
		
		//방법1
		//maxNumber MinNumber 둘다 아니면 중간 숫자
		Scanner sc=new Scanner(System.in);


		System.out.print("num1-->");
		int number1=sc.nextInt();
		System.out.print("num2--->");
		int number2=sc.nextInt();
		System.out.print("num3--->");
		int number3=sc.nextInt();

	
		int maxNumber=(number1>=number2) ? number1:number2; 
		maxNumber =(maxNumber>=number3) ? maxNumber:number3; //최댓값 구함
	
		int minNumber=(number1<=number2) ? number1:number2;
		minNumber =(minNumber<=number3) ? minNumber:number3; //최소값 구함
		
		//경우의 수 10 5 20, 5 10 20, 5 20 10
		int midNumber=0;
		if(number1 !=maxNumber && number1!=minNumber)
			midNumber = number1;
		if(number2 !=maxNumber&& number2!=minNumber)
			midNumber =number2;
		if(number3 !=maxNumber && number3!=minNumber)
			midNumber =number3;
		
		System.out.println("Max " + maxNumber);
		System.out.println("Mid " + midNumber);
		System.out.println("Min " + minNumber);
		
		//방법2
		System.out.println("숫자1 입력:");
        int e6 = sc.nextInt();
        System.out.println("숫자2 입력:");
        int e7 = sc.nextInt();
        System.out.println("숫자3 입력:");
        int e8 = sc.nextInt();	
        System.out.println((e6>=e7)?((e6>=e8)?((e7>=e8)?e7:e8):e6):((e6>=e8)?e6:((e7>=e8)?e8:e7)));

		//방법3 삼항연산자 사용
        System.out.print("첫번째 숫자를 입력하세요 : ");
		int n1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int n2 = sc.nextInt();
		System.out.print("세번째 숫자를 입력하세요 : ");
		int n3 = sc.nextInt();

		int result1 = (n1 <= n2) ? n1 : n2;
		int min = (result1 <= number3) ? result1 : number3;
		
		int result2 = (n1 >= n2) ? n1 : n2;
		int max = (result2 >= number3) ? result2 : number3;
		int mid = (n1 != min && n1 != max) ? n1 : ((n2 != min && n2 != max) ? n2 : n3);
		
		System.out.println(mid);

        
        
	}

		

	}
						

