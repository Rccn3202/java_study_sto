package javaMid8.exp422;
//��� 3����
public class AnonymousEx {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {  //���� ���� ���� /�޼ҵ� (�ް�����/�ް����� �ȿ��ٰ� �ƿ� �͸� �ڽİ�ü ����) {�������̵�-run �޼ҵ� ȣ��}
			@Override
			public void run() {
				System.out.println("Ʈ��");
			}
		}
		); //end method2

	}

}
