package pkg03;

public class Jusawee01 {

	public static void main(String[] args) {
		// �ֻ����� ���� 1�Ǵ� 4�̸� 100
		// �ֻ����� ���� 2�Ǵ� 5�̸� 200
		// �ֻ����� ���� 3�Ǵ� 6�̸� 300
		
		int money, dice;
		dice = 3;
		
		if(dice == 1 || dice == 4) {
			money = 100;
		} else if (dice == 2 || dice == 5) {
			money = 200;
		} else {
			money = 300;
		}
		
		System.out.println("���� " + dice + "�� ���� �ݾ��� " + money + "�Դϴ�.");

	}

}
