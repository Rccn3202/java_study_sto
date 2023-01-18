package javaBasic2.ch05.day3;

public class ArrayEx178 {

	public static void main(String[] args) {
		// 178
		int[][] scores= { {80,90,96}, {76,88 } };
		// 80 90 96
		// 76 88
		
		System.out.println("배열의 길이"+scores.length);  //---> 2, 행의 갯수
		System.out.println("배열의 길이"+scores[0].length);  //---> 3, 0행의 열의 갯수
		System.out.println("배열의 길이"+scores[1].length); //---> 2, 1행의 열의 갯수
		
		System.out.println("96 "+scores[0][2]);
		System.out.println("88 "+scores[1][1]);
		
		//1반의 세명의 평균
		int avg;
		int sum=0;
		for(int i=0 ;i<scores[0].length ;i++) {
			sum=sum+scores[0][i];
		}
		avg=sum/scores[0].length;
		System.out.println("1 평균> "+avg);
		
		for(int j=0;j<scores[1].length;j++) {
			sum=sum+scores[1][j];
		}
		avg=(scores[1][0]+scores[1][1]);
		System.out.println("2 평균> "+avg);
		
		for(int s:scores[1]) {
			sum=sum+s;
		}
		avg=sum/scores[1].length;
		System.out.println("2반 평균> "+avg);
		
		
		//187. 배열복사-배열은 처음에 길이 결정하면 자르거나 붙일 수 없고 다른 곳에 옮겨야한다.
		int[] oldIntArray= {1,2,3};
		
		int[] newIntArray = new int[5];  //새로운 배열 5칸
		newIntArray[0]=oldIntArray[0];  //옮겨주기
		newIntArray[1]=oldIntArray[1];
		newIntArray[2]=oldIntArray[2];
		
		//옮기기 반복문
		for(int i=0; i<oldIntArray.length;i++) {
			newIntArray[i]=oldIntArray[i];
		}
		for(int n: newIntArray) {
			System.out.print(n+" ");
		}
		
		int[] old= {4,5};
		newIntArray[3]=old[0];
		newIntArray[4]=old[1];
		for(int n:newIntArray) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		//배열은 크키가 고정되어 변경할 떄는 옮겨야하는데
		//이러한 단점을 없애주는 자료구조를 컬렉션(list)이라고 한다--->배열보다는 컬렉션 더 많이 쓴다
		//배열 복사를 해주는 System 클래스가 있다.
		
		//System class를 이용해서 배열을 옮긴다.
		int[] newArr1 = new int[10];
		System.arraycopy(oldIntArray, 0, newArr1, 5,oldIntArray.length ); //old~배열의/0번 인덱스부터/ newd의/0번 위치부터/ old 길이만큼 복사
		
		for(int i=0;i<newArr1.length;i++) {
			System.out.print(newArr1[i]+" ");
		}
		//ss 10 25 30 35  -> newss 0 0 10 25 30 35 0
		
		System.out.println();
		
		int[] ss={10,25,30,35};
		int[] newss=new int[7];
		System.arraycopy(ss,0 ,newss,2, ss.length);
		for(int i=0;i<newss.length;i++) {   //출력
			System.out.print(newss[i]+" ");
		}
		
		
		
		
		
		
		
	}

}
