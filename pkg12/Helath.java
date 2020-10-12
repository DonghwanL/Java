package pkg12;

public class Helath extends Human {
	private double s_weight = 0.0; 
	private double fat = 0.0;
	private String result = null;
	
	public Helath(String name, String gender, double tall, double weight) {
		super(name, gender, tall, weight);
		this.calculate();
		this.output2();
	}
	
	public void output2() {
		String imsi = "%s���� �񸸵��� %.3f�̰�, %s �Դϴ�.";
		System.out.printf(imsi, super.getName(), this.fat, this.result);
	}
	
	public void calculate() { 
		if (super.getName().equalsIgnoreCase("M")) {
			this.s_weight = (super.getTall() - 100.0) * 0.9;
		} else {
			this.s_weight = (super.getTall() - 100.0) * 0.85;
		}
		
		this.fat = super.getWeight() / this.s_weight;
		
		if( this.fat >= 1.5 ){
			this.result = "�� ��" ;
		}else if( this.fat >= 1.31 ){
			this.result = "�ߵ� ��" ;
		}else if( this.fat >= 1.21 ){
			this.result = "�浵 ��" ;
		}else if( this.fat >= 1.11 ){
			this.result = "��ü��" ;
		}else if( this.fat >= 0.91 ){
			this.result = "����(ǥ�� ü��)" ;
		}else{
			this.result = "��ü��" ;
		}
	}

}