package management;

import java.time.LocalDate;
import java.util.Scanner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class BookManager {
	// �缭 ���̵�� ��� �ʱ�ȭ
	static final String[] ID = { "������", "������", "�̼���" };
	static final String[] PASSWORD = { "0104", "0113", "2222" };

	LocalDate now;
	Scanner sc = new Scanner(System.in);

	// ����Ʈ ����
	ArrayList<Book> list = new ArrayList<>(); //�÷���

	// ���α׷� ����
	public void run(int managerIndex) {
		boolean bookRun = true;
		
		System.out.println("�α��� ����");
		System.out.println(ID[managerIndex] + " �缭�� ȯ���մϴ�!");

		list.add(new Book("����", "������", "��.1.11", 1, "������ / �ռ��� �ݳ� 1�� 25��", 18));
		list.add(new Book("����", "������", "��.1.12", 1, "������ / �̳��� �ݳ� 1�� 27�� ", 20));
		list.add(new Book("������̺�", "���̺�", "��.0.10", 11, "������ / ����� �ݳ� 2�� 3��", 27));
		list.add(new Book("���Ժ���", "������", "��.1.13", 21, "���Ⱑ��"));

		now = LocalDate.now(); // ���� ��¥�� �����
		int month = now.getMonthValue();
		int today = now.getDayOfMonth();
		System.out.println("������ " + month + "�� " + today + "�� ���� ���� ��ȸ�� �ִ� ���Դϴ�."); // ���Ƿ� ��� ����

		int borrowCnt = 0;
		for (int i = 0; i < list.size(); i++) {
			Book t = list.get(i);
			String state = t.state;
			if (!(state.equals("���Ⱑ��"))) {
				borrowCnt++;
			}
		}
		System.out.println("������ �̳������� �� " + borrowCnt + "�� �Դϴ�.");
		
		
		//�޴� ����
		while (bookRun) {
			System.out.println("-----------------------------------------");
			System.out.println("1. �˻� | 2. �ű� �� ���߰� | 3. ȸ������ | 4. �̳�����Ȯ��");
			System.out.println("5. �ְ� �α� ���� | 6. ������ | 7. ���� ");
			System.out.println("-----------------------------------------");
			System.out.print("�޴� ���� > ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1": // å�˻�
				findBook(null);
				break;
			case "2": // å�߰�
				add();
				break;
			case "3": // ȸ������
				memberList();
				break;
			case "4": // �̳����� Ȯ��
				outBookList();
				break;
			case "5": // �ְ� �α⵵��
				popularBook();
				break;
			case "6": // ������
				bookEvent();
				break;
			case "7": // ����
				System.out.println("���α׷� ����");
				bookRun = false;
				break;
			default:
				System.out.println("��ϵ� �޴��� �ƴմϴ�.");
			}

		}

	} // run method

	
	// 1�� �˻�
	public void findBook(String name) {

		do {
			sc = new Scanner(System.in);
			System.out.print("å �̸� �Է� >");
			String search = sc.nextLine();

			for (int i = 0; i < list.size(); i++) { // list.size = ����Ʈ�� ������ ��
				Book bookList = list.get(i); // ������ i���� ���� i��°�� ��Ҹ� bookList�� ����
				String bookName = bookList.getName(); 

				if (search.equals(bookName)) { // �Է¹��� å�̸��� ����Ʈ�� �ִ� å�̸� ��
					bookList.print();
					break;
				} else if (i == list.size() - 1) { // ������ ������ �ȵǹǷ� ��ȯ�� ������ ����
					System.out.println("�ش��ϴ� ������ �����ϴ�.");
				}
			}
			System.out.println("�߰� �˻� �Ͻðڽ��ϱ�? (Y/N)");
			String input = sc.nextLine().toUpperCase();
			if (input.equals("Y"))
				continue;
			if (input.equals("N"))
				break;

		} while (true);

	}

	// 2�� �߰�
	public void add() {
		do {
			System.out.print("å ���� > ");
			String name = sc.nextLine();
			System.out.print("�۰� > ");
			String author = sc.nextLine();
			System.out.print("��ġ > ");
			String position = sc.nextLine();
			Book book = new Book(name, author, position, 0, "���Ⱑ��");

			list.add(book);
			System.out.println("�Ű����� '" + name + "[" + author + "]" + " / " + position + "' �߰��Ǿ����ϴ�.");
			System.out.println("��� �߰� �Ͻðڽ��ϱ�? (Y/N)");
			String input = sc.nextLine().toUpperCase();
			if (input.equals("Y"))
				continue;
			if (input.equals("N"))
				break;

		} while (true);

	}

	// 3�� ȸ�� ����
	public void memberList() {
		ArrayList<Member> members = new ArrayList<Member>();
		
		members.add(new Member("�ռ���", 1));
		members.add(new Member("�����", 0));
		members.add(new Member("�ڿ���", 5));
		members.add(new Member("������", 0));
		members.add(new Member("�ֿ���", 3));
		members.add(new Member("�̳���", 0));
		members.add(new Member("�嵵��", 5));

		for (int i = 0; i < members.size(); i++) {
			System.out.println(members.get(i).getName() + " ȸ�� / �̳�Ƚ�� :  " + members.get(i).getLateCnt());
			if (members.get(i).getLateCnt() >= 5) {
				System.out.print(" >> ����Ұ���\n");
			}
		}
	}

	// 4�� �̳����� Ȯ��
	public void outBookList() {
		System.out.println("�̳� ���� ���");

		for (int i = 0; i < list.size(); i++) {
			Book outBook = list.get(i);
			String out = outBook.getState();
			if (!(out.contains("���Ⱑ��"))) {
				System.out.println(out);
			}
		}

	}

	// 5�� �ְ� �α⵵��
	public void popularBook() {
		list.sort(new Comparator<Book>() { // ������ ����Ʈ�� ��ü ����
			// �������� ���� (https://manorgass.tistory.com/60)
			public int compare(Book book1, Book book2) {
				int cnt1 = book1.getCnt();
				int cnt2 = book2.getCnt();
				if (cnt1 == cnt2)
					return 0;
				else if (cnt2 > cnt1)
					return 1;
				else
					return -1;
			}
		});

		String previousName = " "; // ���� ���� ���� ������ ����
		System.out.println("�α� ���� ���");
		for (int i = 0; i < list.size(); i++) {
			Book a = list.get(i);

			if (a.getName() != previousName) // �ߺ� ����, ������ ��°��� i��° ���� ���� ������(=�ٸ���) ���
				System.out.println(a.getName());

			previousName = a.getName();
		}

	}

	// 6�� ��� �߰� �� ����
	public void bookEvent() {
		do {
			System.out.print("��¥(��) >");
			String month1 = sc.nextLine();
			System.out.print("��¥(��) >");
			int inputDay = Integer.parseInt(sc.nextLine());
			System.out.print("��� �̸� >");
			String eventName = sc.nextLine();

			System.out.println(month1 + "�� " + inputDay + "�� �� " + eventName + "��(��) �߰��ұ��?(Y/N)");
			String input = sc.nextLine().toUpperCase();
			;
			if (input.equals("Y")) {
				System.out.println(month1 + "�� " + inputDay + "�� �� " + eventName + "��(��) �˷��帮�ڽ��ϴ�.");
			}

			System.out.println("�߰� �Է� �Ͻðڽ��ϱ�? (Y/N)");
			input = sc.nextLine().toUpperCase();
			if (input.equals("N")) {
				break;
			}

		} while (true);

	}

	// �缭 �α��� �޼ҵ�
	public int memberLogin() {
		int i;
		Scanner sc = new Scanner(System.in);
		// ���̵�� ��� �Է�
		System.out.print("�缭ID > ");
		String id = sc.nextLine();
		System.out.print("�н����� > ");
		String pwd = sc.nextLine();

		int index = -1;
		for (i = 0; i < ID.length; i++) { // ������ �ش� �ε����� ����, 0:������, 1:������, 2:�̼���
			if (id.equals(ID[i])) {
				index = i;
			}
		}
		if (index < 0)
			return -1; // ���̵� Ʋ���� -1 ����
		if (pwd.equals(PASSWORD[index])) // ���̵� �ش��ϴ� �ε����� ��й�ȣ �ε����� �����Ͽ� ������ �ش� �ε��� ����
			return index;
		return -2; // ���̵� �ش��ϴ� �ε����� ���ؼ� ��й�ȣ�� Ʋ���� -2 ����
	}

} // BookManager class end