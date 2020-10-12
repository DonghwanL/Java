package pkg07;

public class Method10 {

	public static void main(String[] args) {

		// 5이상 9미만의 임의의 정수를 10개만 만들어 보세요. (random(하한값, 상한값) 메소드)
		int low = 5; // 하한 값
		int high = 9; // 상한 값

		for (int i = 1; i < 11; i++) {
			int imsi = random(low, high);
			System.out.println(imsi);
		}
	}

	static int random(int low, int high) {
		int result = (int)((high-low) * Math.random() + low);

		return result;
	}
}
