package pkgplayer;

public enum EnumSkin {
	// 스킨 관련 색상들을 정의한 Enum 타입
	// 색상 : BLACK(0), RED(1), BLUE(2), GREEN(3)

	BLACK("검정색"), RED("빨강색"), BLUE("파랑색"), GREEN("녹색");
	
	private String color;
	
	private EnumSkin(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}
	
}
