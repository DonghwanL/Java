package pkg13;

public class Salary {
	private String name; // 이름
	private int salary = 3000; // 급여
	private String department; // 부서 이름
	
	public Salary(String name, int salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public Salary(String name, String department) {
		this.name = name;
		this.department = department;
	}
	
	// 사용하던 안하던 습관적으로 작성을 해두는게 좋음
	public Salary() {}
	
	public void Display() {
		int bae = 0;
		
		if (this.department.equals("영업") || this.department.equals("판매")) {
			bae = 15;
		} else {
			bae = 12;
		}
		
		String imsi = this.name + "(" + this.department + ")";
		imsi += ", 급여 : " + this.salary;
		imsi += ", 연봉 : " + (bae * this.salary);
		System.out.println(imsi);
	}
}
