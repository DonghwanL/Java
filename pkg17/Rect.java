package pkg17;

public class Rect { // �簢��
	int width; // ���� 
	int height; // ����
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// equals() �޼ҵ带 �������̵� �Ͽ� ���ϴ� ��� ����
	
	@Override
		public boolean equals(Object obj) {
			// �� ��ü�� ������ �����ϸ� true�� ��ȯ
			Rect target = (Rect)obj; // ����
			boolean result = (this.width * this.height == target.width * target.height);
			return result;
		}
	
}
