package javaMid3p297;

public class BBB { //�θ�
	int s=0;
	
	public int sum(int number) {  //�������̵� �� �ʿ� ���� number ���ڸ� �ٲٸ� ��
		for(int i=1;i<=number;i++) {
			s=s+i;
		}
		return s;
	}
	
	public int dif(int number) {
		return s-number; 
	}
	
}
