package bookManagement;

public class Main {

	public static void main(String[] args) {
		
			System.out.println("-----------------------------------------");
			System.out.println("***************�������� ���α׷�*************");
			System.out.println("-----------------------------------------");

			boolean result = Login.result();
			System.out.println(result);

			if (result==true) {
					Menu.run();    //�α��� �����ϸ� �޴� Ŭ������
			} else {
				System.out.println("���� ������ �����ϴ�.");
			}


	}

}
