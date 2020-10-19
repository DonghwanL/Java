package pkg17;

public class Rect { // 사각형
	int width; // 가로 
	int height; // 세로
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// equals() 메소드를 오버라이딩 하여 원하는 대로 변경
	
	@Override
		public boolean equals(Object obj) {
			// 두 객체의 면적이 동일하면 true를 반환
			Rect target = (Rect)obj; // 강등
			boolean result = (this.width * this.height == target.width * target.height);
			return result;
		}
	
}
