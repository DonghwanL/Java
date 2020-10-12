package pkg03;

public class SeasonTest {

	public static void main(String[] args) {
		// 계절 출력하기
		int month = 9;
		String season = "";
		
		// 9월은 "가을" 입니다.
		
		if(month >= 3 && month <= 5) {
			season = "봄";
		} else if (month >= 6 && month <= 8) {
			season = "여름";
		} else if (month >= 9 && month <= 11) {
			season = "가을";
		} else {
			season = "겨울";
		}
		
		String temp = month + "월은 \"" + season + "\" 입니다.";
		System.out.println(temp);

	}

}
