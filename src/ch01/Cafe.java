package ch01;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Cafe {
	public static void main(String[] args) {
		// 커피 메이커 인스턴스 얻어서 커피를 만들게 동작 시키기
		System.out.println("- 세상에서 가장 작은 카페 오픈 -");
		
		CoffeeMaker coffeeMaker 
//			= new CoffeeMaker(); // Not working
			= CoffeeMaker.getInstance();
		coffeeMaker.makeCoffee();
		
		LogWriter
		.getInstance()
		.writeLog("커피 결제 완료 : " + dateFormatter(new Date()));
		
		// 다른 파일에서 또 필요함  
				CoffeeMaker coffeeMaker2 = CoffeeMaker.getInstance();
				coffeeMaker2.makeCoffee();
				LogWriter
				.getInstance()
				.writeLog("커피 결제 완료 : " + dateFormatter(new Date()));
		
		// 두 인스턴스가 동일한지 확인(주소값 비교 ==)
		System.out.println("CoffeMaker == coffeMaker2 : "
				+ (coffeeMaker == coffeeMaker2));
		
	}
	
	public static String dateFormatter(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}
}
