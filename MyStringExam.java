package pkg18;
public class MyStringExam {

	public static void main(String[] args) {
		String str = "lastgodfather";
		
		int apos = str.indexOf("t"); // 3
		int dpos = str.lastIndexOf("t"); // 9
		
		String temp = str.substring(apos + 1, dpos);
		System.out.println(temp);
		
		// 뒤집기 메소드 01
		StringBuffer sb = new StringBuffer(temp);
		System.out.println(sb.reverse());
		
		// 뒤집기 메소드 02
		String imsi = "";
		for (int i = temp.length()-1; i >= 0; i--) {
			imsi += temp.charAt(i);
		}
		
		System.out.println(imsi);
		System.out.println(imsi.toUpperCase());
	}

}
