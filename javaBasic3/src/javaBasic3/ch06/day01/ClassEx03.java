package javaBasic3.ch06.day01;

public class ClassEx03 {

	public static void main(String[] args) {
		// �����ڳ��� ȣ���ϱ�
			Book book=new Book();  // 1      /1

			System.out.println(book.getBookTitle());   // 8
			System.out.println(book.getBookPrice());   // 9
	}
}

class Book{   //�����ڳ��� ȣ���� �� �ִ�.
	String bookTitle; //åü��
	int bookPrice; //å����
	
	public Book() {  // 2         /2   -�⺻������
		this(30000);  // 3   6    /3   8
		System.out.println("�̰��� �⺻ �������̴�.");   // 7
	}
	
	public Book(int bookPrice) {      //   / 4
		this("�̰��� css");            //  /5
		this.bookPrice=bookPrice;      //   /7
	}
	
	public Book(String bookTitle) {    //  /6
		this.bookTitle=bookTitle;
	}
	
	public Book(String bookTitle, int bookPrice) {   // 4
		this.bookTitle=bookTitle;   // 5
		this.bookPrice=bookPrice;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
}