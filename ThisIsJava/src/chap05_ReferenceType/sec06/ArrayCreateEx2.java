package chap05_ReferenceType.sec06;

public class ArrayCreateEx2 {
//*배열 변수를 선언한 시점과 값 목록이 대입되는 시점이 다르다면 new 타입[]를 앞에 붙여준다. 
	public static void main(String[] args) {
		String[] names=null;
		names=new String[] {"김","이","박"};   //나중에 값 더 대입할 수 있음.
		
		//배열 변수 선언 scores
		int[] scores;
		
		//배열 변수에 배열을 대입 10 20 30
		scores=new int [] {10,20,30};
		
		//배열 항목의 총합 구하기, 출력
		if(int i=0;i<3;i++) {
			int sum+=scores[i];
			System.out.println("총합 : "+sum);
		}
		
		
		//배열을 매개값으로 주고 printItem()메소드 호출
		
		//printItem() 메소드 선언
		
		//매개변수가 참조하는 배열의 항목을 출력

	}

}
