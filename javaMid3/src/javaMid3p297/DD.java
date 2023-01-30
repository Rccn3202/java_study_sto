package javaMid3p297;

public class DD {

	public static void main(String[] args) {
		AA aa=new AA();
		System.out.println(aa.sum(10)); //자식이 아무것도 없으니까 부모한테 감
		System.out.println(aa.dif(10)); 
		
		BC bc=new BC();
		System.out.println(bc.sum(100));
		
		CC cc=new CC();
		System.out.println(cc.sum(200));
		System.out.println(cc.dif(200));
		System.out.println(cc.mul(20));
		
	}

}
