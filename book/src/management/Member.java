package management;

public class Member {

	String name;
	int lateCnt;

	public Member(String name, int lateCnt) {
		this.name = name;
		this.lateCnt = lateCnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLateCnt() {
		return lateCnt;
	}

	public void setLateCnt(int lateCnt) {
		this.lateCnt = lateCnt;
	}

}