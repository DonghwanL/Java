package enumtest;

public enum ShoesTypeName {
	
	// 1. ���� private ������ ���� �մϴ�.
	// 2. private �����ڸ� �����մϴ�.
	// 3. public getter�� �����մϴ�.
	
	WALKING("��ŷȭ"), RUNNING("����ȭ"), TRACKING("Ʈ��ŷȭ"), HIKING("���ȭ");
	
	private String name;
	
	private ShoesTypeName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
