package javaMid10.p464;

public class ExceptionEx02 {

	public static void main(String[] args) {


		
		try {
			int[] number = {10,20,30,40,50};
			System.out.println(number[5]);
			
			
		}catch(ArrayIndexOutOfBoundsException f) {
			System.out.println(f.getMessage());
		}finally {
			System.out.println("정상종료");
		}
		

	}

}
