package pkg03;

public class SwitchEx2 {

	public static void main(String[] args) {

		String name = "홍길동";
		String grade = "B";
		String gift = "";

		System.out.println("케이스01");

		switch (grade) {
		case "A":
			gift = "강남빌딩, 고급 승용차, 노트북";
			break;
		case "B":
			gift = "고급 승용차, 노트북";
			break;
		case "C":
			gift = "노트북";
			break;
		}

		System.out.println("이름 : " + name);
		System.out.println("등급 : " + grade);
		System.out.println("경품 : " + gift);

		
		System.out.println("케이스02");

		gift = "";

		switch (grade) {
		case "A":
			gift += "강남빌딩, ";
		case "B":
			gift += "고급 승용차, ";
		case "C":
			gift += "노트북";

		System.out.println("이름 : " + name);
		System.out.println("등급 : " + grade);
		System.out.println("경품 : " + gift);
		
		}

	}

}
