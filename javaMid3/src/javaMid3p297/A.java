package javaMid3p297;

public class A extends BB {
	
	    int s=0;
	    
		@Override   //�������̵��ϸ� �ڽĸ޼ҵ尡 �켱������ ���
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


