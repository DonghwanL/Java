package pkg17;

public class MyStringTest {

	public static void main(String[] args) {
		String str = "hong@naver.com";

		int idx1 = str.indexOf("@");
		System.out.println(idx1);

		int idx2 = str.indexOf("o");
		System.out.println(idx2);

		int idx3 = str.lastIndexOf("o");
		System.out.println(idx3);

		int alt = str.indexOf("@");
		System.out.println("���̵� : " + str.substring(0, alt));
		System.out.println("�����ּ� : " + str.substring(alt + 1));

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(i));
		}
		
		String id = "";
		String email = "";
		String str2 = "hong@naver.com/kim@daum.net";
		
		String[] data = str2.split("/");
		for (int i = 0; i < data.length; i++) {
			alt = data[i].indexOf("@");
			id = data[i].substring(0, alt);
			email = data[i].substring(alt + 1);
			System.out.println("���̵� : " + id);
			System.out.println("�̸��� : " + email);
			System.out.println();					
		}
		
		
	}
}
