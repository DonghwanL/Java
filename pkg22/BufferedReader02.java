package pkg22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReader02 {

	public static void main(String[] args) {
		InputStream in = null;
		
		// 브릿지 스트림 : 문자열을 바이트로 또는 바이트를 문자열로 변환해주는 스트림
		// InputStreamReader : 바이트 --> 문자열
 		InputStreamReader isr = null;
 		
 		// BufferedReader : Reader 클래스의 효율성을 높이기 위하여 지원해주는 보조 스트림
 		BufferedReader br = null;
 		
 		try {
 			in = System.in;
 			isr = new InputStreamReader(in);
 			br = new BufferedReader(isr);
 			
 			System.out.print("밑변 입력 : ");
 			
 		// readLine() 메소드 : 한 줄 단위로 읽습니다.
 			double width = Double.parseDouble(br.readLine()); 
 			
 			System.out.print("높이 입력 : ");
 			double height = Double.parseDouble(br.readLine());
 			
 			double area = width * height / 2.0;
 			
 			System.out.println("면적 : " + area);
 			
 			System.out.println("작업 완료");
 			
 		} catch (IOException e) {
 			System.out.println("데이터 입출력에 문제가 있습니다.");
 			e.printStackTrace();
 			
 		} catch (NumberFormatException e) {	
 			System.out.println("잘못된 숫자 형식 입니다.");
 			e.printStackTrace();
 			
		} catch (Exception e) {
			System.out.println("기타 예외 발생");
			e.printStackTrace();
			
		} finally {
			try {
				if (br != null) {br.close();}
				if (isr != null) {isr.close();}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
