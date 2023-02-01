package chap07_Inheritance.sec04.exam01;

public class ComputerExample {  //실행클래스

	public static void main(String[] args) {
		int r=10;
		
		Calculator calculator= new Calculator();
		System.out.println("원 면적: "+calculator.areaCircle(r));
		System.out.println();
		
		Computer computer=new Computer();
		System.out.println("원 면적: "+computer.areaCircle(r));
	}

}
