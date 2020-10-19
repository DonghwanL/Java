package pkg17;
import java.util.Calendar;

public class MyTest {
	Calendar cal = Calendar.getInstance();
	
	int month = cal.get(Calendar.MONTH) + 1;
	int day = cal.get(Calendar.DAY_OF_MONTH);
	
	@Override
	public String toString() {
		String imsi = "";
		imsi = "금일은 " + month + "월 " + day + "입니다.";
		
		return imsi;
	}
}
