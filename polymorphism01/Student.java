package polymorphism01;

public class Student extends Person {
	private int schoolyear ; // 학년
	private String grade ; //학점
	
	public Student() { }
	
	public Student(String name, int age, String address, String phone, int type, int schoolyear, String grade) {
		super(name, age, address, phone, type) ;
		this.schoolyear = schoolyear ;
		this.grade = grade ;		
	}	
	@Override
	public String toString() {
		String imsi = super.toString() ;
		imsi += "학년 : " + this.schoolyear + "\n" ;
		imsi += "학점 : " + this.grade + "\n" ;
		return imsi;
	}
}
