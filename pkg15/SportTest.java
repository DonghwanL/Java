package pkg15;

public class SportTest {

	public static void main(String[] args) {
		// �̸�, ��Ʈ��, Ÿ��
		Baseball baseball = new Baseball("�߱�", 9, 0.235);
		baseball.play();
		baseball.display();
		
		// �̸�, ��Ʈ��, �� ��
		Football soccer = new Football("�౸", 11, 5);
		soccer.show();
		
		// ���� ������ �����ϸ� "�౸�� ��վ�"��� ������ ��� �ȴٰ� �մϴ�.
		System.out.println(soccer);
	}

}
