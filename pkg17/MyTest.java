package pkg17;
import java.util.Calendar;

public class MyTest {
	Calendar cal = Calendar.getInstance();
	
	int month = cal.get(Calendar.MONTH) + 1;
	int day = cal.get(Calendar.DAY_OF_MONTH);
	
	@Override
	public String toString() {
		String imsi = "";
		imsi = "������ " + month + "�� " + day + "�Դϴ�.";
		
		return imsi;
	}
}
