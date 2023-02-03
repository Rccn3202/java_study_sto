package javaMid6.p376;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("검색");
	}

	@Override
	public void insert() {
		System.out.println("삽입");
	}

	@Override
	public void update() {
		System.out.println("수정");
	}

	@Override
	public void delete() {
		System.out.println("삭제");
		
	}

}
