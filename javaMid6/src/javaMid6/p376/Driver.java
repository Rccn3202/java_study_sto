package javaMid6.p376;

public class Driver {  //�����Ͻ�Ŭ����
void driver(Vehicle vehicle) {
	vehicle.run();	
}
void farePrint(Vehicle vehicle) {
	vehicle.f();
}
public int fare(Vehicle vehicle) {
	int fare=0;
	if(vehicle instanceof Bus) {
		fare=1350;
	} else if (vehicle instanceof Taxi) {
		fare=3000;
	}else if (vehicle instanceof Subway) {
		fare=4000;
	}
	return fare;
}
}
