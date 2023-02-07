package javaMid8.exp422;
//인터페인스는 new 할 수 없지만 익명구현객체 만들 수 있다.
public class ActionEx {

	public static void main(String[] args) {
		Action action=new Action() {
			
			@Override
			public void work() {
				System.out.println("복사");
			}
		}; 
			action.work();

	}

}
