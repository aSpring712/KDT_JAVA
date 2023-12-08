package ch04;

// 인코딩을 해주는 클래스이다
public class Encoder {
	// 포함 관계 - base64, Append를 가질 수 있음 -> 둘 다 EncodingStrategy를 바라볼 수 있음 (다형성)
	private EncodingStrategy encodingStrategy;
	
	// 생성자 의존 주입
	public Encoder(EncodingStrategy encodingStrategy) {
		this.encodingStrategy = encodingStrategy;
	}
	
	// 메서드 의존 주입 가능
	public void setEndingStragey(EncodingStrategy encodingStrategy) {
		this.encodingStrategy = encodingStrategy;
	}
	
	public String getMessage(String message) {
		return this.encodingStrategy.encode(message);
	}
}
