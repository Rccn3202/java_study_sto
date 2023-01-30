package javaMid3p297;

public class BBB { //부모
	int s=0;
	
	public int sum(int number) {  //오버라이딩 할 필요 없이 number 숫자만 바꾸면 됨
		for(int i=1;i<=number;i++) {
			s=s+i;
		}
		return s;
	}
	
	public int dif(int number) {
		return s-number; 
	}
	
}
