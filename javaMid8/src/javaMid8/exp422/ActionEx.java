package javaMid8.exp422;
//�������ν��� new �� �� ������ �͸�����ü ���� �� �ִ�.
public class ActionEx {

	public static void main(String[] args) {
		Action action=new Action() {
			
			@Override
			public void work() {
				System.out.println("����");
			}
		}; 
			action.work();

	}

}
