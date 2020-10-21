package pkg19;
import java.util.Scanner;

public class MyException01 {

	public static void main(String[] args) {
		int x, y;
		Scanner scan = null; // 정의
		
		try {
			scan = new Scanner(System.in);
			x = 3;
			y = 0;
			int[] arr = { 10, 20, 30 };
			
			arr[3] = 50 ; //배열 요소 인덱스 문제
			
			System.out.println(x / y);
			
			System.out.println("문제 발생시 실행이 안됩니다.");
			
		} catch (ArithmeticException ex) { // 서브 클래스
			System.out.println("0으로 나눌 수 없습니다.");
			
		} catch (ArrayIndexOutOfBoundsException ex) { // 서브 클래스
			System.out.println("배열 인덱스 오류");
			System.out.println("메시지 : " + ex.getMessage());
			System.out.println("문자열 : " + ex.toString());
			System.out.println();
			ex.printStackTrace();
			
		} catch (Exception ex) { // 슈퍼 클래스
			System.out.println("나머지 기타 등");
			
		} finally {
			System.out.println("무조건 실행");
			scan.close();
		}
		

	}

}
