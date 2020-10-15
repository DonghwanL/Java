package myunicon;

public class Unicon extends Animal implements Horse, Bird {

	public Unicon(String name, int age) {
		super(name, age);
	}

	@Override
	public void fly() {
		String imsi = "나이가 " + super.getAge() + "살인 ";
		imsi += super.getName() + "이(가) ";
		imsi += "시속 " + Bird.speed + "으로 날아 다닙니다.";
		System.out.println(imsi);
	}

	@Override
	public void run() {
		String imsi = "나이가 " + super.getAge() + "살인 ";
		imsi += super.getName() + "이(가) ";
		imsi += "달리기 속도 " + Horse.speed + "으로 달립니다.";
		System.out.println(imsi);
	}

}
