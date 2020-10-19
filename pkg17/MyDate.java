package pkg17;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	@Override
	public boolean equals(Object obj) {
		MyDate mydate = (MyDate)obj;
		boolean result = 
				this.year == mydate.year &&
				this.month == mydate.month &&
				this.day == mydate.day;

		return result;
	}
	
}
