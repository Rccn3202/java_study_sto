package javaMid3p297;

public class Color extends Point {

	String color="red";
	
	@Override
	void printAll() {
		px=3;
		py=4;
		System.out.println(color+" ("+px+", "+py+") ");
	}
}
