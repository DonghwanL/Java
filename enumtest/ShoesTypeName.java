package enumtest;

public enum ShoesTypeName {
	
	// 1. 관련 private 변수를 정의 합니다.
	// 2. private 생성자를 구비합니다.
	// 3. public getter를 구비합니다.
	
	WALKING("워킹화"), RUNNING("런닝화"), TRACKING("트래킹화"), HIKING("등산화");
	
	private String name;
	
	private ShoesTypeName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
