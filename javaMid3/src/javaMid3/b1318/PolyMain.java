package javaMid3.b1318;

public class PolyMain {

	public static void main(String[] args) {
		CaptionTv ca=new CaptionTv();
		ca.channel=11;
		ca.power=true;
		ca.text="파노라마";
		ca.caption();
		ca.channelUp();
		ca.channelDown();
		
		//부모클래스는 자기 것만 사용가능
		Tv tv=new Tv();
		tv.channel=7;
		tv.power=false;
		tv.channelDown();
		tv.channelUp();
		
		//Animal animal = new Cat();
		//다형성으로 객체화하기
		Tv tv1=new CaptionTv();
		tv1.channel=7;
		tv1.power=false;
		tv1.channelDown();
		System.out.println("=============");
		tv1.channelUp();
		//tv1.text="자식필드";    //자식필드 못쓴다
		//tv1.caption();   //자식필드 못쓴다
		
		//자식 필드와 메소드 사용하려면
		//1. 오버라이딩
		//다형성에서 부모것을 오버라이드 한 메소드는 자식 것이 나온다/ 부모것은 그냥 부모것 객체생성해서 쓰면 됨
		
		//2. 다운캐슽팅
		CaptionTv ct1=(CaptionTv) tv1;  //캡션티비 만드는 변수 만든 후 다운캐스팅
		ct1.text="자식필드";
		ct1.caption();
		
	}

}
