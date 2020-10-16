package paytable;

public class PayTable extends MySalary implements Output, Calculate {

	public PayTable(String name, double pay, int family, int overtime) {
		super(name, pay, family, overtime);
	}

	@Override
	public void calc() {
		// 가족 수당
		if (super.getFamily() < 3) {	
		super.setFamily_p(super.getFamily() * 20000);
		} else if (super.getFamily() >= 3) {
		super.setFamily_p(60000);
		}
		
		// 시간 외 수당
		super.setOvertime_p(super.getOvertime() * 5000);
		
		// 세금
		super.setTax(super.getPay() * 0.1);
		
		// 성과급
		super.setIncen_p(MySalary.incentive * super.getPay());
		
		// 실수령액
		double imsi = 0.0;
		imsi += super.getPay() + super.getFamily_p() + super.getIncen_p();
		imsi += super.getOvertime_p() - super.getTax();
		super.setTotal_pay(imsi);
	}

	@Override
	public void out() {
		String imsi = "";
		imsi += "이름 : " + super.getName() + "\n";
		imsi += "급여 : " + super.getPay() + "\n";
		imsi += "가족 수 : " + super.getFamily() + "\n";
		imsi += "가족 수당 : " + super.getFamily_p() + "\n";
		imsi += "시간 외 근무 : " + super.getOvertime() + "\n";
		imsi += "시간 외 수당 : " + super.getOvertime_p() + "\n";
		imsi += "세금 : " + super.getTax() + "\n";
		imsi += "인센티브 : " + MySalary.incentive + "\n";
		imsi += "성과급 : " + super.getIncen_p() + "\n";
		imsi += "실 수령액 : " + super.getTotal_pay();
		
		System.out.println(imsi);
	}
	

}
