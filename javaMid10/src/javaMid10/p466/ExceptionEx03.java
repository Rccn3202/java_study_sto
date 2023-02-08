package javaMid10.p466;

import java.io.File;
import java.nio.channels.UnresolvedAddressException;

public class ExceptionEx03 {

	public static void main(String[] args) {
		try {
			Class.forName("java.util.String");
			int a=10/0;
			int[] number= {10,20,30,40,50};
			System.out.println(number[5]);
		
		}catch(ClassNotFoundException e) {
			System.out.println("클래스 오류");
			
		}catch(ArithmeticException e){
			System.out.println("수학오류");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열");
		}
		finally {
			System.out.println("종료");
		}
		}

}
