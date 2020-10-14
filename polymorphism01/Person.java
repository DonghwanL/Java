package polymorphism01;

public class Person {
	private String name ; //이름
	private int age ;//나이
	private String address ; //주소
	private String phone ; //전화 번호
	private int type ; // 직원(1), 선생님(2), 학생(3)
	
	@Override
	public String toString() {
		String imsi = "" ;
		imsi += "이름 : " + this.name + "\n" ;
		imsi += "나이 : " + this.age + "\n" ;
		imsi += "주소 : " + this.address + "\n" ;
		imsi += "전화 번호 : " + this.phone + "\n" ;
		
		String mytype = "" ;
		if (this.type == 1) {
			mytype = "직원" ;
		}else if (this.type == 2) {
			mytype = "선생님" ;
		} else {
			mytype = "학생" ;
		}
		
		imsi += "타입 : " + mytype + "\n" ;
		return imsi;
	}

	public Person() {}	
	public Person(String name, int age, String address, String phone, int type) {
		this.name = name ;
		this.age = age ;
		this.address = address ;
		this.phone = phone ;
		this.type = type ;		
	}

}
