package ch03;

public class AirConditioner implements IElectronic220v{

	public void connect() {
		System.out.println("에어컨 연결 220V ON");
	}
}