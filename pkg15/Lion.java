package pkg15;

public class Lion extends Animal {

	public Lion(String name, String location) {
		super(name, location);
	}

	@Override // implementation(구체화)
	public void move() {
		String imsi = super.getName() + "가 " + super.getLocation() + "에서 달립니다.";
		System.out.println(imsi);
	}

}
