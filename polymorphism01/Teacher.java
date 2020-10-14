package polymorphism01;

public class Teacher extends Person {
	private String subject ; //과목
	
	public Teacher(String name, int age, String address, String phone, int type, String subject) {
		super(name, age, address, phone, type) ;
		this.subject = subject ;		
	}
	@Override
	public String toString() {
		String imsi = super.toString() ;
		imsi += "과목 : " + this.subject + "\n" ;
		return imsi;
	}	
}
