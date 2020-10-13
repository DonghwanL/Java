package pkg13;

public class Sawon extends RefCasting { // 서브
	private String name; // 사원 이름
	private String department; // 부서명
	
	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public Sawon(String name, String department) {
		this.name = name;
		this.department = department;
	}
}
