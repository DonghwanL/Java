package polymorphism01;

public class Staff extends Person {
	private String department ; //부서

	public Staff(String name, int age, String address, String phone, int type, String department) {
		super(name, age, address, phone, type) ;
		this.department = department ;		
	}
	@Override
	public String toString() {
		String imsi = super.toString() ;
		imsi += "부서 : " + this.department + "\n" ;
		return imsi;
	}
}
