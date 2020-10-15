package pkg15;

public class AnimalTest {

	public static void main(String[] args) {
		Animal[] animal  = new Animal[3];
		
		animal[0] = new Lion("사자", "아프리카 초원"); // 승급
		animal[1] = new Eagle("독수리", "하늘");
		animal[2] = new Goldfish("금붕어", "어항");
		
		for (int i = 0; i < animal.length; i++) {
			animal[i].move();
		}
		
//		Animal ani = new Animal(); 

	}

}
