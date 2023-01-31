package javaMid3p325;



public class InstanceofEx {
	public static void personInfo(Person person) {  //매개변수를 Person 클래스에 넣는다.
		System.out.println("name :"+person.name);
		person.walk();
		//다형성에서 부모객체타입으로 받으면 자식객체로 접근 못한다
		//System.out.println(person.studentNo);
		//해결방법: ( Student ) person 이렇게 다운 캐스팅하기

		// Animal animal=new Cat();  //animal이란 변수는 Animal 에만 접근 가능, Cat에 접근 못함
		// (Cat) animal :다운캐스팅

		
		
		if(person instanceof Student) {  //instanceof :person을 가지고 
			//person객체의 주소가 Student클래스를 가르킬 수 있으면 참
			Student s=(Student) person;
			System.out.println(s.studentNo);
			s.study();
			
			
		}
	}
	
	public static void main(String[] args) {
		Person p1=new Person("홍길동");
		personInfo(p1);
		System.out.println();
		
		Person p2=new Student("김길동", 10);
		personInfo(p2);
	}
}
