package pkg06;

public class Method04 {
	
	static int signOf(int x) {
		if (x > 0) {
			return 1;
		} else if(x < 0) {
			return -1;
		} else {	
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// x�� ����̸� 1, �����̸� -1, 0�̸� 0�� ������ִ� �޼ҵ� signOf �����ϱ�
		System.out.println(Math.signum(1)); // Math Ŭ����
		
		int x = -12;
		int result = signOf(x);
		
		System.out.println("���01 : " + result);
		
		x = 0;
		result = signOf(x);
		
		System.out.println("���02 : " + result);
		
		x = 5;
		result = signOf(x);
		
		System.out.println("���03 : " + result);
	}

}
