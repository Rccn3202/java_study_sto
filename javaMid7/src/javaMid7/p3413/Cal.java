package javaMid7.p3413;

public class Cal {  //∫Ò¡Ó¥œΩ∫ ≈¨∑°Ω∫
	
	
	Input p=new Input();
	
	
	
private Input input1 = new Input() {
	public void print() {
	
	int area=(p.width*p.length);
	System.out.println("≥–¿Ã : "+area);
	}
};
private Input input2=new Input() {
	public void print() {
	int volume= (p.width*p.length*p.height);
	System.out.println("∫Œ«« : "+volume);
}
};
private Input input3=new Input() {
	public void print() {
	int outarea=((p.width*p.length)+(p.length*p.height)+(p.width*p.height))*2;
	System.out.println("∞—≥–¿Ã : "+outarea);
	}
};
 
	
}

