package pkg19;
import java.util.Scanner;

public class JumsuMain {

	public static void main(String[] args) {
		Scanner scan = null;
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double average = 0.0;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("응시자 입력 : ");
			name = scan.next();
			System.out.println("국어 입력 : ");
			kor = scan.nextInt(); 
			System.out.println("영어 입력 : ");
			eng = scan.nextInt(); 
			System.out.println("수학 입력 : ");
			math = scan.nextInt(); 
			
			total = kor + eng + math;
			
			if (kor <= 40 || eng <= 40 || math <= 40) {
				throw new MinJumsuException("과락");
			}
			
			if (total < 180) {
				throw new FailedException("평균 이하 점수");
			}
			
			// 평균과 총점 출력
			average = (double)total / 3.0;
			System.out.println("총점 : " + total);
			System.out.printf("평균 : %.2f\n", average);
		
		
		} catch (MinJumsuException e) { // 모든 과목 최하 40 이하
			String imsi = "";
			imsi += "응시자 입력: " + name + "\n";
			imsi += "국어 점수 : " + kor + "\n";
			imsi += "영어 점수 : " + eng + "\n";
			imsi += "수학 점수 : " + math;
			
			System.out.println(imsi);
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		
		} catch (FailedException e) { // 3과목 총점 180 미만
			String imsi = "";
			imsi += "응시자 입력: " + name + "\n";
			imsi += "국어 점수 : " + kor + "\n";
			imsi += "영어 점수 : " + eng + "\n";
			imsi += "수학 점수 : " + math;
			
			System.out.println(imsi);
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			
		} catch (Exception e) {
			System.out.println("나머지 예외 발생 ");
			
		} finally {
			scan.close();
		}
		

	}

}
