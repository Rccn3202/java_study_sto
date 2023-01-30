package javaMid3p297;

public class CC extends BBB { //합차 만들 필요없고 곱은 만들어야함
	
	public long mul(int number) {
		long m=1;
		for(int i=1;i<=number;i++) {
			m=m*i;
		}
		return m;
	}
}
