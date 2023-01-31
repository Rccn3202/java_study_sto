package management;


public class Main {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------");
		System.out.println("도서관리 프로그램");
		System.out.println("-----------------------------------------");

		BookManager bookManager = new BookManager();

		int managerIndex = bookManager.memberLogin();
		if (managerIndex >= 0) {
			bookManager.run(managerIndex);
		} else {
			System.out.println("로그인 실패");
		}
		System.out.println("프로그램 종료");

	}

}