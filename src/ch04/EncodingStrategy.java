package ch04;

// 추상 메서드를 2개 이상 만들지 못함. 람다 표현식 쓰기 위해
public interface EncodingStrategy { // interface는 역할로 바라보라 -> 역할을 실제로 돌아가게 하는 구현 클래스를 만들어 주어야 함
	String encode(String text);
//	String encode1(String text);
}
