package pkg13;

public class Salary {
	private String name; // �̸�
	private int salary = 3000; // �޿�
	private String department; // �μ� �̸�
	
	public Salary(String name, int salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public Salary(String name, String department) {
		this.name = name;
		this.department = department;
	}
	
	// ����ϴ� ���ϴ� ���������� �ۼ��� �صδ°� ����
	public Salary() {}
	
	public void Display() {
		int bae = 0;
		
		if (this.department.equals("����") || this.department.equals("�Ǹ�")) {
			bae = 15;
		} else {
			bae = 12;
		}
		
		String imsi = this.name + "(" + this.department + ")";
		imsi += ", �޿� : " + this.salary;
		imsi += ", ���� : " + (bae * this.salary);
		System.out.println(imsi);
	}
}
