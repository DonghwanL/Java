package paytable;

public class MySalary {
	static double incentive = 0.5; // �μ�Ƽ�� �ʱ� �� (0.5)
	static int count; // ���ο� - �ʱⰪ(0)
	
	private String name; // �̸�
	private double pay; // �޿�
	private int family; // ���� ��
	private double family_p; // ���� ����
	private int overtime; // �ð� �� �ٹ�
	private double overtime_p; // �ð� �� ����
	private double tax; // ����
	private double incen_p; //������
	private double total_pay; // �� ���ɾ�
	
	public String getName() {
		return name;
	}

	public double getPay() {
		return pay;
	}
	
	public int getFamily() {
		return family;
	}
	
	public void setFamily_p(double family_p) {
		this.family_p = family_p;
	}
	
	public double getFamily_p() {
		return family_p;
	}
	
	public int getOvertime() {
		return overtime;
	}

	public double getOvertime_p() {
		return overtime_p;
	}

	public void setOvertime_p(double overtime_p) {
		this.overtime_p = overtime_p;
	}
	
	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double getIncen_p() {
		return incen_p;
	}

	public void setIncen_p(double incen_p) {
		this.incen_p = incen_p;
	}
	
	public double getTotal_pay() {
		return total_pay;
	}

	public void setTotal_pay(double total_pay) {
		this.total_pay = total_pay;
	}

	public MySalary(String name, double pay, int family, int overtime) {
		this.name = name;
		this.pay = pay;
		this.family = family;
		this.overtime = overtime;
	}
	
}