package pkg19;
import java.util.Scanner;

public class UserException {

	public static void main(String[] args) {
		Scanner scan = null; 
		int lotto = 0;
	
		try {
			scan = new Scanner(System.in);
			System.out.println("�ζ� ��ȣ �Է� : ");
			lotto = scan.nextInt();
			
			if (lotto < 0 || lotto > 45) {
				String message = "�߸��� �ζ� ��ȣ �Դϴ�.";
				LottoException le = new LottoException(message, lotto);
				throw le;
			} else {
				String imsi = lotto + "��(��) �ùٸ� �ζ� ��ȣ �Դϴ�.";
				System.out.println(imsi);
			}
			
		} catch (LottoException e) {	
			System.out.println(e.toString());
			
		} catch (Exception e) {
			System.out.println("������ ���� �߻�");
			
		} finally {
			scan.close();
		}

	}

}
