package pkg12;

public class Human {
	private String name;
	private String gender;
	private double tall;
	private double weight;
	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public double getTall() {
		return tall;
	}

	public double getWeight() {
		return weight;
	}
	
	public Human(String name, String gender, double tall, double weight) {
		this.name = name;
		this.gender = gender;
		this.tall = tall;
		this.weight = weight;
		this.output1();
	}

	private void output1() {
		String imsi = "�̸� : %s, ���� : %s, Ű : %.1f, ������ : %.2f\n";
		System.out.printf(imsi, this.name, this.gender, this.tall, this.weight);
	}
	
}
