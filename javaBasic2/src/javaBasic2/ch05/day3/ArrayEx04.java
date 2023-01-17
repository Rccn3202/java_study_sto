package javaBasic2.ch05.day3;

public class ArrayEx04 {

	public static void main(String[] args) {
		// p165
		int[] a1;
//		a1=10; /X : /Type mismatch: cannot convert from int to int[] 
//		a1=null; /O
		
		//배열안에 값 넣기
		//1. 초기값으로 넣기
		int[] a3= {1,2,3,4,5};
		System.out.println(a3[3]); //4 출력
		//반복문으로 1~5 출력
		for(int i=0;i<5;i++) {   //i=0,1,2,3,4,5
			System.out.print(a3[i]+" ");
		}
		System.out.println();
		System.out.println("----------------");
		
		//다른 방법으로 1~5 출력
		System.out.println("배열의 길이(크기)"+a3.length);  //length는 ()가 없으며로 메소드 아니고 필드, 배열의 길이 크기
		for(int j=0;j<a3.length;j++) {   //i=0,1,2,3,4,5
			System.out.print(a3[j]+" ");
		}
		System.out.println();
		System.out.println("배열의 크기"+a3.length);
		//향상된 for(자료형 변수 : 배열명) ---------------->훨씬 심플
		//배열에 있는 원소들을 한개씩 꺼내서 앞에 변수에 넣는다.
		//마지막까지 꺼내서 변수에 넣어주면 더이상 반복하지 않는다.
		for(int a:a3) {
			System.out.print(a+" ");
		}
		
		
		//문) 1.1 3.3 5.4 10.3 8.9 11.23 배열에 넣기
		double[] a4= {1.1,3.3,5.4,10.3, 8.9 ,11.23};
		System.out.println(a4[3]-a4[1]);
		System.out.println("전부출력"+a4.length);
		//전체 출력
		System.out.println("전체"+a4.length);
		for(int k=0;k<a4.length;k++) {
			System.out.println(a4[k]+" ");
		}
		//향상된 for
		for(double k1:a4) {
			System.out.println(k1+" ");
		}
		
		System.out.println();
		
		//문2) 
		boolean[] a5= {true,false,true,false,true};
		System.out.println(a5[4]);
		System.out.println("전체"+a5.length);
		for(int l=0;l<a5.length;l++) {
			System.out.println(a5[l]);
		}
		for(boolean a:a5) {
			System.out.println(a);   //a는 for 밖을 벗어나면 지워지므로 a 또 써도 됨
		}
		
		System.out.println();
		
		//문3
		String[] a6= {"돈까스","김밥","떡볶이","피자"};
		System.out.println(a6[1]+a6[2]);
		//전체출력, 향상for문
		
		
		//2. 배열을 만들어놓고 필요하면 넣어준다.
		
	}

}
