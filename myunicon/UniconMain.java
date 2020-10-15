package myunicon;

public class UniconMain {

	public static void main(String[] args) {
		
		Unicon dol = new Unicon("유니돌", 5);
		dol.fly();
		dol.run();
		
		System.out.println("말의 속도 : " + Horse.speed);
		System.out.println("새의 속도 : " + Bird.speed);
	}

}
