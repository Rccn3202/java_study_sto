package javaMid10.p467;

public class ExceptionEX04 {

	public static void main(String[] args) {
		
			try {
				Class.forName("java.util.String");
				int a=10/k;
				int[] number= {10,20,30,40,50};
				System.out.println(number[2]);
			
			}catch(ArithmeticException e) {
				if(k==0) {k=5;
						System.out.println(a/k);
				}
				System.out.println("숫자잘못");
			}
			catch(Exception e) {
				System.out.println("모든 예외를 다 받는다"+e.getMessage());
				
			}finally {
				System.out.println("종료");
			}
			}
	}


