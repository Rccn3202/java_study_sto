package management;


public class Main {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------");
		System.out.println("�������� ���α׷�");
		System.out.println("-----------------------------------------");

		BookManager bookManager = new BookManager();

		int managerIndex = bookManager.memberLogin();
		if (managerIndex >= 0) {
			bookManager.run(managerIndex);
		} else {
			System.out.println("�α��� ����");
		}
		System.out.println("���α׷� ����");

	}

}