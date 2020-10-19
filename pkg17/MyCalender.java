package pkg17;
import java.util.Calendar;

public class MyCalender {
	public static void main(String[] args) {
		// Calender 클래스는 추상 클래스, new 키워드 사용이 불가능
		// 객체 생성은 static 메소드인 getInstance() 메소드를 사용해야 함

		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		// 주의 : 월은 0부터 시작하기 때문에 반드시 +1
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int ampm = cal.get(Calendar.AM_PM); // 0은 오전, 1은 오후
		System.out.println(ampm);
		
		String sampm = ampm == 1 ? "오후" : "오전";
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		String imsi = "지금은 " + year + "년 " + month + "월 " + day + "일 ";
		imsi += sampm + " " + hour + "시 " + minute + "분 " + second + "초 입니다.";
		System.out.println(imsi);
		
	}
}
