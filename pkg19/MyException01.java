package pkg19;
import java.util.Scanner;

public class MyException01 {

	public static void main(String[] args) {
		int x, y;
		Scanner scan = null; // ����
		
		try {
			scan = new Scanner(System.in);
			x = 3;
			y = 0;
			int[] arr = { 10, 20, 30 };
			
			arr[3] = 50 ; //�迭 ��� �ε��� ����
			
			System.out.println(x / y);
			
			System.out.println("���� �߻��� ������ �ȵ˴ϴ�.");
			
		} catch (ArithmeticException ex) { // ���� Ŭ����
			System.out.println("0���� ���� �� �����ϴ�.");
			
		} catch (ArrayIndexOutOfBoundsException ex) { // ���� Ŭ����
			System.out.println("�迭 �ε��� ����");
			System.out.println("�޽��� : " + ex.getMessage());
			System.out.println("���ڿ� : " + ex.toString());
			System.out.println();
			ex.printStackTrace();
			
		} catch (Exception ex) { // ���� Ŭ����
			System.out.println("������ ��Ÿ ��");
			
		} finally {
			System.out.println("������ ����");
			scan.close();
		}
		

	}

}
