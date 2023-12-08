package ch03;

public class MyHouse {
	
	public static void homeConnect(IElectronic220v electronic220v) {
		electronic220v.connect();
	}
	
	public static void main(String[] args) {
		// 전압 220v
		// 집들이 선물 일본 가전제품
		
		AirConditioner airConditioner = new AirConditioner();
		HairDryer dryer = new HairDryer();
		Cleaner cleaner = new Cleaner();
		
		// 사용해 보기
		homeConnect(airConditioner); // 200v 전압을 가진 스펙만 들어갈 수 있음 -> 에어컨 바로 연결 가능
//		homeConnect(dryer); // 집에 바로 연결 불가능
		
		// 어댑터 가지고 오기
		ElectronicAdapter dryerAdapter1 = new ElectronicAdapter(dryer);
		homeConnect(dryerAdapter1);
		
		ElectronicAdapter cleanerAdaptor = new ElectronicAdapter(cleaner);
		homeConnect(cleanerAdaptor);
	}
	
}
