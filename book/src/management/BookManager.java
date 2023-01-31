package management;

import java.time.LocalDate;
import java.util.Scanner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class BookManager {
	// 사서 아이디와 비번 초기화
	static final String[] ID = { "김지희", "박정은", "이수지" };
	static final String[] PASSWORD = { "0104", "0113", "2222" };

	LocalDate now;
	Scanner sc = new Scanner(System.in);

	// 리스트 생성
	ArrayList<Book> list = new ArrayList<>(); //컬렉션

	// 프로그램 실행
	public void run(int managerIndex) {
		boolean bookRun = true;
		
		System.out.println("로그인 성공");
		System.out.println(ID[managerIndex] + " 사서님 환영합니다!");

		list.add(new Book("봄봄", "김유정", "바.1.11", 1, "대출중 / 손석구 반납 1월 25일", 18));
		list.add(new Book("봄봄", "김유정", "바.1.12", 1, "대출중 / 이나연 반납 1월 27일 ", 20));
		list.add(new Book("러브다이브", "아이브", "라.0.10", 11, "대출중 / 장원영 반납 2월 3일", 27));
		list.add(new Book("하입보이", "뉴진스", "하.1.13", 21, "대출가능"));

		now = LocalDate.now(); // 오늘 날짜를 출력함
		int month = now.getMonthValue();
		int today = now.getDayOfMonth();
		System.out.println("오늘은 " + month + "월 " + today + "일 독서 퀴즈 대회가 있는 날입니다."); // 임의로 행사 지정

		int borrowCnt = 0;
		for (int i = 0; i < list.size(); i++) {
			Book t = list.get(i);
			String state = t.state;
			if (!(state.equals("대출가능"))) {
				borrowCnt++;
			}
		}
		System.out.println("오늘의 미납도서는 총 " + borrowCnt + "권 입니다.");
		
		
		//메뉴 선택
		while (bookRun) {
			System.out.println("-----------------------------------------");
			System.out.println("1. 검색 | 2. 신규 도 서추가 | 3. 회원관리 | 4. 미납도서확인");
			System.out.println("5. 주간 인기 도서 | 6. 행사관리 | 7. 종료 ");
			System.out.println("-----------------------------------------");
			System.out.print("메뉴 선택 > ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1": // 책검색
				findBook(null);
				break;
			case "2": // 책추가
				add();
				break;
			case "3": // 회원관리
				memberList();
				break;
			case "4": // 미납도서 확인
				outBookList();
				break;
			case "5": // 주간 인기도서
				popularBook();
				break;
			case "6": // 행사관리
				bookEvent();
				break;
			case "7": // 종료
				System.out.println("프로그램 종료");
				bookRun = false;
				break;
			default:
				System.out.println("등록된 메뉴가 아닙니다.");
			}

		}

	} // run method

	
	// 1번 검색
	public void findBook(String name) {

		do {
			sc = new Scanner(System.in);
			System.out.print("책 이름 입력 >");
			String search = sc.nextLine();

			for (int i = 0; i < list.size(); i++) { // list.size = 리스트의 데이터 수
				Book bookList = list.get(i); // 들어오는 i값을 토대로 i번째의 요소를 bookList에 대입
				String bookName = bookList.getName(); 

				if (search.equals(bookName)) { // 입력받은 책이름과 리스트에 있는 책이름 비교
					bookList.print();
					break;
				} else if (i == list.size() - 1) { // 음수는 참조가 안되므로 반환할 도서가 없음
					System.out.println("해당하는 도서가 없습니다.");
				}
			}
			System.out.println("추가 검색 하시겠습니까? (Y/N)");
			String input = sc.nextLine().toUpperCase();
			if (input.equals("Y"))
				continue;
			if (input.equals("N"))
				break;

		} while (true);

	}

	// 2번 추가
	public void add() {
		do {
			System.out.print("책 제목 > ");
			String name = sc.nextLine();
			System.out.print("작가 > ");
			String author = sc.nextLine();
			System.out.print("위치 > ");
			String position = sc.nextLine();
			Book book = new Book(name, author, position, 0, "대출가능");

			list.add(book);
			System.out.println("신간도서 '" + name + "[" + author + "]" + " / " + position + "' 추가되었습니다.");
			System.out.println("계속 추가 하시겠습니까? (Y/N)");
			String input = sc.nextLine().toUpperCase();
			if (input.equals("Y"))
				continue;
			if (input.equals("N"))
				break;

		} while (true);

	}

	// 3번 회원 관리
	public void memberList() {
		ArrayList<Member> members = new ArrayList<Member>();
		
		members.add(new Member("손석구", 1));
		members.add(new Member("장원영", 0));
		members.add(new Member("박연진", 5));
		members.add(new Member("문동은", 0));
		members.add(new Member("주여정", 3));
		members.add(new Member("이나연", 0));
		members.add(new Member("장도연", 5));

		for (int i = 0; i < members.size(); i++) {
			System.out.println(members.get(i).getName() + " 회원 / 미납횟수 :  " + members.get(i).getLateCnt());
			if (members.get(i).getLateCnt() >= 5) {
				System.out.print(" >> 대출불가능\n");
			}
		}
	}

	// 4번 미납도서 확인
	public void outBookList() {
		System.out.println("미납 도서 목록");

		for (int i = 0; i < list.size(); i++) {
			Book outBook = list.get(i);
			String out = outBook.getState();
			if (!(out.contains("대출가능"))) {
				System.out.println(out);
			}
		}

	}

	// 5번 주간 인기도서
	public void popularBook() {
		list.sort(new Comparator<Book>() { // 정렬한 리스트로 객체 생성
			// 내림차순 정렬 (https://manorgass.tistory.com/60)
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

		String previousName = " "; // 이전 값을 비교할 변수를 선언
		System.out.println("인기 도서 목록");
		for (int i = 0; i < list.size(); i++) {
			Book a = list.get(i);

			if (a.getName() != previousName) // 중복 제거, 마지막 출력값과 i번째 값이 같지 않으면(=다르면) 출력
				System.out.println(a.getName());

			previousName = a.getName();
		}

	}

	// 6번 행사 추가 및 관리
	public void bookEvent() {
		do {
			System.out.print("날짜(월) >");
			String month1 = sc.nextLine();
			System.out.print("날짜(일) >");
			int inputDay = Integer.parseInt(sc.nextLine());
			System.out.print("행사 이름 >");
			String eventName = sc.nextLine();

			System.out.println(month1 + "월 " + inputDay + "일 에 " + eventName + "를(을) 추가할까요?(Y/N)");
			String input = sc.nextLine().toUpperCase();
			;
			if (input.equals("Y")) {
				System.out.println(month1 + "월 " + inputDay + "일 에 " + eventName + "를(을) 알려드리겠습니다.");
			}

			System.out.println("추가 입력 하시겠습니까? (Y/N)");
			input = sc.nextLine().toUpperCase();
			if (input.equals("N")) {
				break;
			}

		} while (true);

	}

	// 사서 로그인 메소드
	public int memberLogin() {
		int i;
		Scanner sc = new Scanner(System.in);
		// 아이디와 비번 입력
		System.out.print("사서ID > ");
		String id = sc.nextLine();
		System.out.print("패스워드 > ");
		String pwd = sc.nextLine();

		int index = -1;
		for (i = 0; i < ID.length; i++) { // 맞으면 해당 인덱스를 리턴, 0:김지희, 1:박정은, 2:이수지
			if (id.equals(ID[i])) {
				index = i;
			}
		}
		if (index < 0)
			return -1; // 아이디가 틀리면 -1 리턴
		if (pwd.equals(PASSWORD[index])) // 아이디에 해당하는 인덱스를 비밀번호 인덱스랑 대조하여 맞으면 해당 인덱스 리턴
			return index;
		return -2; // 아이디에 해당하는 인덱스랑 비교해서 비밀번호가 틀리면 -2 리턴
	}

} // BookManager class end