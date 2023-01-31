package javaMid3.b1318.a01;

public class Tv extends Product {  //실제 프로그램
	public Tv() {   
		super(100);  //Tv라는 생성자는 부모생성자 호출해서 100을 넣음(int price)
	}
	
	@Override            //to+스패이스바  :Object 클래스는 모든 클래스의 상위. Object 클래스의 toString을 오버라이딩함
		public String toString() {
			return "Tv";
		}

}
