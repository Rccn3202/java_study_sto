package ch02.sec01;

import java.util.Scanner;

public class VarEx2 {

	public static void main(String[] args) {
	
		//대문자 K를 변수에 넣기
		//소문자 S 출력
		
		char kWord='K'; //75
		System.out.println( (char) (kWord + 40 )) ; //115
		
		char name1='이';
		char name2='수';
		char name3='지';
		System.out.println((int) (name1) + " " + (int) (name2) + " " + (int) (name3) + " " );
		
		String name = "정현희"; //9바이트(3*3)
		
		String hakbun = "221208"; //문자열->정수형으로 바꾸기 string은 문자열
		//Q. 위의 학번의 다음 사람의 학번을 구하시호(221209)
		System.out.println(Integer.valueOf(hakbun) + 1 );
		
		String avgS = "52.2"; //52.2 + 100 = 152.2
		//문자열은 계산 안되니까 문자열을 실수형으로 바꿔야 한다
		//그리고 100을 더해서 출력 한다
		System.out.println(Float.valueOf(avgS) + 100);
		
		
		float convAvg=Float.parseFloat(avgS);//"52.2"->52.2
		convAvg = convAvg + 100;
		System.out.println(convAvg);
		
		double convAvg1 = Double.parseDouble(avgS);
		convAvg1 = convAvg1 + 100;
		System.out.println(convAvg1+"~");		
		
		String 성별="false"; //"true"->true
		Boolean.parseBoolean(성별);
		System.out.println(성별);
		
	
		boolean 변환한성별 = Boolean.parseBoolean(성별); //parse : 바뀐다
		System.out.println(변환한성별);
		if(변환한성별)
			System.out.println("남자");
		else
			System.out.println("여자");
		
		int hakbun1 = 221208;//문자열 정수형 변환 자바 : int 사용
		System.out.println("다음 사람의 학번은" + (hakbun1+1));
		
		
		//자동타입변환
		byte v1=10; //1byte
		int v2=20; //4byte
		
		v2 = v1; //뒤에 있는 것이 앞으로 들어감. v2 = 10 이 된다. byte형의 값이 int형으로 들어간다.(문제x)
		
		//강제형 변환
		v1 =(byte) v2; //v2의 값을 v1에 넣는다. 즉 int형이 byte형으로 들어간다. 큰 값이 작은 값으로 들어감 -> 오류
		
		int v3=50; //정수형
		double v4 = 10.0; //실수형, double은 8바이트, 소수점 이하 32까지, 기본
		float v5=20.5f; //실수형, float는 숫자 뒤에 f 붙여야한다. float라는 뜻, float 4바이트, 소수점 이하 8자리까지 나옴
		
		v4=v3;
		v4=v5;
		v3= (int) v4; //
		v3=(int) v5; //
		v5=(float) v4; //
		
		//문제 숫자 2개를 입력받아서 사칙연산해보세요
		Scanner sc = new Scanner(System.in); //키보드 입력을 담당하는 스캐너 클래스를 사용한다.
		
//		int x = sc.nextInt(); //키보드에서 정수를 입력 받는다.
//		System.out.println("입력값 " + x);
//		
//		int y = sc.nextInt(); 
//		System.out.println("입력값 " + y);
//		
//		//double형으로 실수 2개를 입력 받으세요
//		double z = sc.nextDouble();
//		System.out.println("입력값 " + z);
//		
//		double k = sc.nextDouble();
//		System.out.println("입력값 " + k);
//		
//		
//		//boolean형 2개를 입력받으세요
//		boolean t = sc.nextBoolean();
//		System.out.println("입력값 " + t);
//		
//		boolean f = sc.nextBoolean();
//		System.out.println("입력값 " + f);
		
		//문자열형 2개를 입력받으세요 입력은 "자바" "재미있다" 로 해줍니다.
		String str3 = sc.nextLine();
		System.out.println("문자형1=>" + str3);
				
		String str4 = sc.nextLine();
		System.out.println("문자형2=>" + str4);
		//nextLine() : 입력받고 한줄을 내린다. 또는 next()을 사용하세요
		
		
		
	}

}
