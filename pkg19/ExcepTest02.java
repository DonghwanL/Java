package pkg19;
import java.util.Scanner;

public class ExcepTest02 {

	public static void main(String[] args) {
		Scanner scan = null;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("첫 번째 정수 입력 : ");
			int x = Integer.parseInt( scan.next() ) ;
			
			System.out.println("두 번째 정수 입력 : ");
			int y = Integer.parseInt( scan.next() ) ;
			
			System.out.println( x / y );
			
			
		} catch(NumberFormatException ex) {
			System.out.println("숫자만 입력 해야 합니다.");
			ex.printStackTrace();
			
		} catch(ArithmeticException ex) {
			System.out.println("0으로 나눌 수 없습니다.");
			ex.printStackTrace();
			
		} catch(Exception ex) {
			System.out.println("나머지 예외 항목 발생");
			
		} finally {
			System.out.println("스캐너를 종료합니다.");
			scan.close() ;
		}

	}

}
