package javaBasic2.ch05.day3;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		//2. 배열을 먼저 만들어두고 나중에 값을 넣기
		int[] a1=new int[5];
		a1[0]=10;
		a1[1]=20;
		a1[2]=50;
		a1[3]=30;
		a1[4]=40;
		
		for(int a:a1) {
			System.out.println(a+" ");
		}
		
		System.out.println("---------");
		
		
		
		//키보드로 정수 5개 입력받기, 총합계 출력
		//배열명 a2
		
		Scanner sc=new Scanner(System.in); //1. 스캐너 생성
		int[] a2=new int[5]; //2. 배열 생성
		int sum=0; //4. 합계변수 설정
		for(int i=0; i<a2.length;i++) { //3. 5번 반복하므로 for문 사용
			System.out.println((i+1)+"번째 숫자> "); //6.프린트 양식
			a2[i]=sc.nextInt();
			sum=sum+a2[i]; //5.합계 설정
		}
		System.out.println(sum); //6.합계 출력
		
		 //입력받은 숫자 중 가장 큰,작은 숫자 출력
/*		int max; //max와 다음 수 비교
		
		//1 5 2 4 6
		if(a2[0]>a2[1]) {
		  max=a2[0]; //5  
		 if(a2[1]>max) {
			 max=a2[1];	
				} else if (a2[2]>max) {
					max=a2[2];
				} else if (a2[3]>max) {
					max=a2[3];
				} else max=a2[4];
		 System.out.println(max);
		}
		*/
		
		int max=0;
		int min=9999;
		
		for(int i=0;i<a2.length;i++) {   
			if(max<a2[i]) max=a2[i];		//1 5 5 5 6
			if(min>a2[i]) min=a2[i];		//1 1 1 1 1
		}
			System.out.println("최대 "+max);
			System.out.println("최소 "+min);
			
			//오름차순으로 정렬하기
			//20 5 3 100 7 있으면 20과 5 비교해서 자리 바꿈.->순차적으로 옆 숫자와 비교해서 작은거는 [0]으로 뺌
			//1회 3 20 5 100 7 0칸 기준 0~4 비교
			//2회 3/5 20 100 7 1칸 기준 1~4 비교
			//3회 3 5/ 7 20 100
			
			//1 5 7 9 2
		/*	for(int j=0;j<a2.length;j++) {      //[0]
			 for(int i=j;i<a2.length;i++) {		// [0]
				if(min>a2[i]) min=a2[i];
				  //1
			}
			 System.out.println(min); break;	//
			}
			
			System.out.println("----------");
			
			for(int j=0;j<a2.length;j++) {  
				if(min>a2[j]) min=a2[j];
				 System.out.println(min); }  */
			
			//오름차순으로 정렬 T
			int temp;
			// 1 9 3 4 6
			for(int i=0;i<a2.length;i++) { //i=0 1 2 3 기준에 해당되는 반복 /3회 떄는 [2]가 기준이므로 3까지만 필요 
				for(int j=i ;j<a2.length;j++) { //비교대상 찾기  //j=0
					if(a2[i] > a2[j]) { //1>1  1x9
						temp=a2[i];		//1 
						a2[i]=a2[j];   //1=1
						a2[j]=temp;		//1
					} //if 끝
				   }
			  System.out.println((i+1)+"회 정렬> ");   // 1회 2
				for(int a:a2) {				//1 
					System.out.print(a+" "); // 19346
				    }
			System.out.println();
			}
		
	}//엔드 메인

}//엔드 클래스
