package ch03;

// 어댑터 패턴 활용
public class ElectronicAdapter implements IElectronic220v {

	// 1. 변환 하고자 하는 스펙을 포함관계로 만들어 준다.
	private IElectronic110v electronic110v;
	
	// 2. 생성자를 통해서 의존 주입을 받을 수 있도록 설계한다.
	public ElectronicAdapter(IElectronic110v electronic110v) {
		this.electronic110v = electronic110v;
	}
	
    public void connect() {
        // 220v에 connect 메서드를 호출하는데
        // 실제로 연결된 건 110v connect() 메서드이다.
        electronic110v.connect();
    }

	
	
}
