package pkgplayer;

public enum EnumSkin {
	// ��Ų ���� ������� ������ Enum Ÿ��
	// ���� : BLACK(0), RED(1), BLUE(2), GREEN(3)

	BLACK("������"), RED("������"), BLUE("�Ķ���"), GREEN("���");
	
	private String color;
	
	private EnumSkin(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}
	
}
