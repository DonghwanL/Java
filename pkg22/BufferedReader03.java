package pkg22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader03 {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("첫 번째 수를 입력하세요. :");
			int first = Integer.parseInt(br.readLine());
			
			System.out.print("두 번째 수를 입력하세요. : ");
			int second = Integer.parseInt(br.readLine());
			
			int max = first > second ? first : second;
			System.out.println("큰 수 : " + max);
			
			System.out.println("작업 종료");
		
		} catch (IOException e) {	
			System.out.println("데이터 입출력에 문제가 있습니다.");
 			e.printStackTrace();
 			
		} catch (NumberFormatException e) {	
			System.out.println("정수 형식으로 입력 해주세요.");
 			e.printStackTrace();
 			
		} catch (Exception e) {
			System.out.println("기타 예외 발생");
			e.printStackTrace();
			
		} finally { // 사용한 모든 객체는 반드시 종료 작업을 수행
			try {
				if (br != null) {br.close();}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}

	}

}
