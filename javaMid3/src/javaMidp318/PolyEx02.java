package javaMidp318;

public class PolyEx02 {

	public static void main(String[] args) {
		Driver driver=new Driver();
		
		Bus bus=new Bus();
		driver.driver(bus);
		
		Taxi taxi=new Taxi();
		driver.driver(taxi);
		
		
	}

}
