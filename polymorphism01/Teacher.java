package polymorphism01;

public class Teacher extends Person {
	private String subject ; //����
	
	public Teacher(String name, int age, String address, String phone, int type, String subject) {
		super(name, age, address, phone, type) ;
		this.subject = subject ;		
	}
	@Override
	public String toString() {
		String imsi = super.toString() ;
		imsi += "���� : " + this.subject + "\n" ;
		return imsi;
	}	
}
