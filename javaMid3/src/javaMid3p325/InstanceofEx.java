package javaMid3p325;



public class InstanceofEx {
	public static void personInfo(Person person) {  //�Ű������� Person Ŭ������ �ִ´�.
		System.out.println("name :"+person.name);
		person.walk();
		//���������� �θ�üŸ������ ������ �ڽİ�ü�� ���� ���Ѵ�
		//System.out.println(person.studentNo);
		//�ذ���: ( Student ) person �̷��� �ٿ� ĳ�����ϱ�

		// Animal animal=new Cat();  //animal�̶� ������ Animal ���� ���� ����, Cat�� ���� ����
		// (Cat) animal :�ٿ�ĳ����

		
		
		if(person instanceof Student) {  //instanceof :person�� ������ 
			//person��ü�� �ּҰ� StudentŬ������ ����ų �� ������ ��
			Student s=(Student) person;
			System.out.println(s.studentNo);
			s.study();
			
			
		}
	}
	
	public static void main(String[] args) {
		Person p1=new Person("ȫ�浿");
		personInfo(p1);
		System.out.println();
		
		Person p2=new Student("��浿", 10);
		personInfo(p2);
	}
}
