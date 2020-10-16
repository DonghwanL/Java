package paytable;

public class PayTable extends MySalary implements Output, Calculate {

	public PayTable(String name, double pay, int family, int overtime) {
		super(name, pay, family, overtime);
	}

	@Override
	public void calc() {
		// ���� ����
		if (super.getFamily() < 3) {	
		super.setFamily_p(super.getFamily() * 20000);
		} else if (super.getFamily() >= 3) {
		super.setFamily_p(60000);
		}
		
		// �ð� �� ����
		super.setOvertime_p(super.getOvertime() * 5000);
		
		// ����
		super.setTax(super.getPay() * 0.1);
		
		// ������
		super.setIncen_p(MySalary.incentive * super.getPay());
		
		// �Ǽ��ɾ�
		double imsi = 0.0;
		imsi += super.getPay() + super.getFamily_p() + super.getIncen_p();
		imsi += super.getOvertime_p() - super.getTax();
		super.setTotal_pay(imsi);
	}

	@Override
	public void out() {
		String imsi = "";
		imsi += "�̸� : " + super.getName() + "\n";
		imsi += "�޿� : " + super.getPay() + "\n";
		imsi += "���� �� : " + super.getFamily() + "\n";
		imsi += "���� ���� : " + super.getFamily_p() + "\n";
		imsi += "�ð� �� �ٹ� : " + super.getOvertime() + "\n";
		imsi += "�ð� �� ���� : " + super.getOvertime_p() + "\n";
		imsi += "���� : " + super.getTax() + "\n";
		imsi += "�μ�Ƽ�� : " + MySalary.incentive + "\n";
		imsi += "������ : " + super.getIncen_p() + "\n";
		imsi += "�� ���ɾ� : " + super.getTotal_pay();
		
		System.out.println(imsi);
	}
	

}
