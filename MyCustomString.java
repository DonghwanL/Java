package pkg18;

public class MyCustomString {
	private String sometext;

	public MyCustomString(String sometext) {
		this.sometext = sometext;
	}

	public String mysubstring(int start, int end) {
		String imsi = "";
		imsi = this.sometext.substring(start - 1, end);
		return imsi;
	}

	public int mycount(String string) { // "abcdefghaa"
		int cnt = 0;
		int idx = 0;
		int len = string.length();

		while (true) {
			idx = this.sometext.indexOf(string);
			if (idx == -1) {
				System.out.println("더 이상 존재하지 않습니다.");
				break;
			} else {
				string = this.sometext.substring(idx + len);
				cnt++;
			}
		}
		return cnt;
	}

	public String myreverse(int start, int end) {
		String imsi = "";
		String temp = this.sometext.substring(start, end);
		
		for (int i = temp.length()-1; i >= 0; i--) {
			imsi += temp.charAt(i);
		}
		return imsi;
	}

}
