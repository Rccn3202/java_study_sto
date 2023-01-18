package javaBasic2.ch05.day3;

import java.util.Scanner;

public class Ex199 {

	public static void main(String[] args) {
		// 6번
		//3 5
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		System.out.println(array.length);
		System.out.println(array[2].length);
	
	
	//7번
	int[] array7= {1,5,3,8,2};
	int max=0;
	for(int j=0;j<array7.length;j++) {
		if(max<=array7[j]) {  //
			max=array7[j];}
	}
	System.out.println("max"+ max);
		
	
	
	//8번
	int[][] array8= {   //3행
			{95,86},
			{83,92,96},
			{78,83,93,87,88}
	};
	
	int avg;
	int sum=0;
	int cnt=0;
	for(int i=0;i<array8[0].length;i++) {   //행 반복하는 for   i=0,1,2
		for(int k=0; k<array8[i].length;k++) {	//열 반복하는 for i=0d일 떄, 0열 1열 /i=1일 때 0 1 2열 /i=2일 때 0 2 3 4
			sum=sum+array8[i][k];
			cnt++;	
		}
	}
	System.out.println("합계는 "+sum); //881		
	System.out.println("평균은 "+(sum/cnt));
	
			
			
			
		
			
		
		
	}
}


