package myunicon;

public class UniconMain {

	public static void main(String[] args) {
		
		Unicon dol = new Unicon("���ϵ�", 5);
		dol.fly();
		dol.run();
		
		System.out.println("���� �ӵ� : " + Horse.speed);
		System.out.println("���� �ӵ� : " + Bird.speed);
	}

}
