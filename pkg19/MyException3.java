package pkg19;

public class MyException3 {

	public static void main(String[] args) {
		
		try {
			String xx = "aa" ;
			first(xx); // first() �޼ҵ� ȣ��
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} catch (NumberFormatException e) {
			System.out.println("�߸��� ���� ���� �Դϴ�.");
		} catch (Exception e) {
			System.out.println("������ ����");
		}	
		
	}
		
	static void first(String xx) throws ArithmeticException, NumberFormatException {
		second(); // second() �޼ҵ� ȣ��
		int x = Integer.parseInt(xx);
	}
		
	static void second() throws ArithmeticException {
		third(); // third() �޼ҵ� ȣ��
	}
		
	static void third() throws ArithmeticException {
		int i = 1, j = 0;
		System.out.println(i / j);
	}
	

}
