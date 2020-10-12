package pkg03;

public class Jusawee01 {

	public static void main(String[] args) {
		// 주사위의 눈이 1또는 4이면 100
		// 주사위의 눈이 2또는 5이면 200
		// 주사위의 눈이 3또는 6이면 300
		
		int money, dice;
		dice = 3;
		
		if(dice == 1 || dice == 4) {
			money = 100;
		} else if (dice == 2 || dice == 5) {
			money = 200;
		} else {
			money = 300;
		}
		
		System.out.println("눈금 " + dice + "에 대한 금액은 " + money + "입니다.");

	}

}
