package javaMid10.p464;

public class ExceptionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//ㅖ외발생 코드 작성
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			//예외 발생하면 처리할 코드
			System.out.println(e.getMessage());
			System.out.println("예외가 발생했다");
		}finally {
			//예외와 상관없이 무조건 처리되는 코드
			System.out.println("데이터베이스 닫기");
	
		}
		
	}

}
