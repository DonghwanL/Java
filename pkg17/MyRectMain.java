package pkg17;

public class MyRectMain {
	public static void main(String[] args) {
		Rect rectA = new Rect(2, 3);
		Rect rectB = new Rect(3, 2);
		Rect rectC = new Rect(3, 4);
		
		System.out.println(rectA == rectB);
		
		// 클래스에는 객체간의 비교를 위하여 equals라는 메소드를 제공 합니다.
		// 특히, String 클래스는 Object 클래스의 equals 메소드를 
		// 값 비교를 하기 미리 오버라이딩 해두었습니다.
		
		if (rectA.equals(rectB)) { // 승급된 상태 (rect에서 object)
			System.out.println("동일 합니다.");
		} else {
			System.out.println("동일하지 않습니다.");
		}
		if (rectA.equals(rectC)) { // 승급된 상태 (rect에서 object)
			System.out.println("동일 합니다.");
		} else {
			System.out.println("동일하지 않습니다.");
		}
		if (rectB.equals(rectC)) { // 승급된 상태 (rect에서 object)
			System.out.println("동일 합니다.");
		} else {
			System.out.println("동일하지 않습니다.");
		}

	}

}
