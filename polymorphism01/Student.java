package polymorphism01;

public class Student extends Person {
	private int schoolyear ; // �г�
	private String grade ; //����
	
	public Student() { }
	
	public Student(String name, int age, String address, String phone, int type, int schoolyear, String grade) {
		super(name, age, address, phone, type) ;
		this.schoolyear = schoolyear ;
		this.grade = grade ;		
	}	
	@Override
	public String toString() {
		String imsi = super.toString() ;
		imsi += "�г� : " + this.schoolyear + "\n" ;
		imsi += "���� : " + this.grade + "\n" ;
		return imsi;
	}
}
