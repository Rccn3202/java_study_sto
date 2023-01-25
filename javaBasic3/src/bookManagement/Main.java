package bookManagement;

public class Main {

	public static void main(String[] args) {
		
			System.out.println("-----------------------------------------");
			System.out.println("***************도서관리 프로그램*************");
			System.out.println("-----------------------------------------");

			boolean result = Login.result();
			System.out.println(result);

			if (result==true) {
					Menu.run();    //로그인 성공하면 메뉴 클래스로
			} else {
				System.out.println("접속 권한이 없습니다.");
			}


	}

}
