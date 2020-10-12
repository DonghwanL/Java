package pkg07;
import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		// main 메소드에서 스캐너를 이용하여 이름과 나이를 입력 받으세요.
		// 이름과 나이를 입력 받아서 출력해주는 namePrint()메소드를 구현해 보세요.
		// 스캐너 nextlnt() : 정수 입력, next() : 문자열 입력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		
		namePrint(name, age);

	}
	
	static void namePrint(String name, int age) {
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
		System.out.printf("제 이름은 %s이고, 나이는 %d 입니다.", name, age);
	}

}
