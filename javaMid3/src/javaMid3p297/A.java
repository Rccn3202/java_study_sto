package javaMid3p297;

public class A extends BB {
	
	    int s=0;
	    
		@Override   //오버라이딩하면 자식메소드가 우선적으로 사용
		public int sum() {
			for(int i=1; i<=10; i++) {
				s = s + i;
			}
			return s;
		}
		
		@Override
		public int dif() {
			return s-10;
		}
		
	}


