package pkg05;

public class Array01 {

	public static void main(String[] args) {
		// 좋아하는 보이/걸 그룹의 멤버들을 대입하고 출력하는 프로그램 작성
		String[] ses = new String[3];

		ses[0] = "유진";
		ses[1] = "바다";
		ses[2] = "슈";

		for (int i = 0; i < ses.length; i++) {
			System.out.println(ses[i]);
		}

		String[] ses2 = {"유진", "바다", "슈"};
		for (int i = 0; i < ses.length; i++) {
			System.out.println(ses2[i]);
		}
	}

}
