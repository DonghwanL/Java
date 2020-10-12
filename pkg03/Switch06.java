package pkg03;

public class Switch06 {

	public static void main(String[] args) {
		// 성적 처리 switch case
		int score = 75;
		String grade;
		String comment = "";
		
		switch(score/10) {
		case 10: case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		
		System.out.println("점수 : " + score);
		System.out.println("학점 : " + grade);
		
		
		// 학점이 A, B이면 잘하셨습니다. 
		// 학점이 C, D이면 보통입니다.
		// 나머지는 좀 더 분발하세요.
		
		switch(grade) {
		case "A": case "B":
			comment = "잘하셨습니다.";
			break;
		case "C": case "D":
			comment = "보통입니다.";
			break;
		default:
			comment = "좀 더 분발하세요.";
			break;		
		}
		
		System.out.println("평가 : " + comment);

	}

}
