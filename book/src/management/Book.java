package management;


public class Book  {
	public String name;
	public String author;
	public String position;
	public int cnt; // ������ ������
	public String state;
	public int date; // ������ ��¥
	public int inDate; // �ݳ���¥
	public int duplicateNumber;

	public void print() {
		// LocalDate ���� �ޱ��� �����ؼ� ����ϴ� �� �̱���, 1���� �ȿ����� ����
		// LocalDate today = LocalDate.now();
		// LocalDate inDate = today.minusDays(date);

		System.out.println("�˻� ��� : " + name + " / " + author + " / " + position + " / " + state);

	}
	
	public Book(Book book) {
		this.name = book.name;
		this.author = book.author;
		this.position = book.position;
		this.cnt = book.cnt;
		this.state = book.state;
		this.date = book.date;
		this.duplicateNumber = book.duplicateNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Book(String name, String author, String position, int cnt, String state) {
		this.name = name;
		this.author = author;
		this.position = position;
		this.cnt = cnt;
		this.state = state;
	}

	public Book(String name, String author, String position, int cnt, String state, int date) {
		this.name = name;
		this.author = author;
		this.position = position;
		this.cnt = cnt;
		this.state = state;
		this.date = date;

	}

	public Book(String name, String author, String position) {
		this.name = name;
		this.author = author;
		this.position = position;
	}



}