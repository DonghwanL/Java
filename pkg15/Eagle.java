package pkg15;

public class Eagle extends Animal {

	public Eagle(String name, String location) {
		super(name, location);
	}

	@Override
	public void move() {
		String imsi = super.getName() + "가 " + super.getLocation() + "에서 날아 다닙니다.";
		System.out.println(imsi);
	}

}
