package ch02;

/*
 * this 용법 3가지
 * 1. this.
 * 2. this() <- 생성자 호출
 * 3. return 키워드에 this를 반환
 * */
public class Robot {
	// 1. 멤버 변수를 정의
	private String head;
	private String torso;
	private String arms;
	private String legs;
	
	// 2. 생성자를 private 선언
	private Robot() {}
	
	// 3. 정적 내부 클래스로 Builder 클래스 선언하기 (외부 접근 허용)
	public static class Builder {
		// 4. 외부 클래스를 멤버 변수로 가지고 있어야 한다.
		private Robot robot;
		
		// 생성자
		public Builder() {
			this.robot = new Robot();
		}
		
		public Builder head(String head) {
//			this.head 
			robot.head = head;
			return this; // 이 this는 Builder
		}
		
		public Builder torso(String torso) {
			robot.torso = torso;
			return this;
		}
		
		public Builder arms(String arms) {
			robot.arms = arms;
			return this;
		}
		
		public Builder legs(String legs) {
			robot.legs = legs;
			return this;
		}
		
		// 핵심 ! 반드시 build() 메서드를 만들어 주자
		public Robot build() {
			return robot;
		}
		
	}

	public String toString() {
		return "Robot [head=" + head + ", torso=" + torso + ", arms=" + arms + ", legs=" + legs + "]";
	}
	
	
}
