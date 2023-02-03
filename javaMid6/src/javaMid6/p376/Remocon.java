package javaMid6.p376;

public interface Remocon {
public void powerOn();
}

public class TV implements Remocon {
	Remocon r=new TV();
	
	public static void main(String[] args) {
		r.powerOn();
	}

	@Override
	public void powerOn() {
		System.out.println("TV¸¦ Ä×½À´Ï´Ù");
		
	}
}