package pkg17;
import java.util.Calendar;

public class MyCalender {
	public static void main(String[] args) {
		// Calender Ŭ������ �߻� Ŭ����, new Ű���� ����� �Ұ���
		// ��ü ������ static �޼ҵ��� getInstance() �޼ҵ带 ����ؾ� ��

		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		// ���� : ���� 0���� �����ϱ� ������ �ݵ�� +1
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int ampm = cal.get(Calendar.AM_PM); // 0�� ����, 1�� ����
		System.out.println(ampm);
		
		String sampm = ampm == 1 ? "����" : "����";
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		String imsi = "������ " + year + "�� " + month + "�� " + day + "�� ";
		imsi += sampm + " " + hour + "�� " + minute + "�� " + second + "�� �Դϴ�.";
		System.out.println(imsi);
		
	}
}
