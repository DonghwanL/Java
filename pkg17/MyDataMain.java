package pkg17;

public class MyDataMain {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(2011, 7, 6);
		MyDate date2 = new MyDate(2011, 7, 6);
		
		if (date1.equals(date2)) {
			System.out.println("���� �մϴ�.");
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}

	}

}
