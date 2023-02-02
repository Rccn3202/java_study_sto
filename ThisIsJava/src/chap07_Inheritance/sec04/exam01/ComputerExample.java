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


/* 
 * 1. 부모클래스 생성자를 만든다
 * 2. 부모클래스의 프린트라인 출력
 * 3. 부모클래스의 계산에 r=10을 넣는다
 * 
 * 4. 자식클래스 생성자를 만든다
 * 5. 자식클래스의 프린트라인 출력
 */

